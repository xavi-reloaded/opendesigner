package org.openossad.util.vfs;


import org.apache.commons.vfs.*;
import org.apache.commons.vfs.impl.DefaultFileSystemManager;
import org.apache.commons.vfs.provider.local.LocalFile;
import org.openossad.util.core.Const;
import org.openossad.util.core.Messages;
import org.openossad.util.core.util.UUIDUtil;

import java.io.*;
import java.util.Comparator;

public class OpenDESIGNERVFS
{
	private static OpenDESIGNERVFS OpenDESIGNERVFS;
  
    private OpenDESIGNERVFS()
    {
    	// Install a shutdown hook to make sure that the file system manager is closed
    	// This will clean up temporary files in vfs_cache
    	//
        Thread thread = new Thread(new Runnable(){
        	public void run() {
		        try
		        {
		            FileSystemManager mgr = VFS.getManager();
		            if (mgr instanceof DefaultFileSystemManager)
		            {
		                ((DefaultFileSystemManager)mgr).close();
		            }
		        }
		        catch (FileSystemException e)
		        {
		            e.printStackTrace();
		        }
	        }
        });
        Runtime.getRuntime().addShutdownHook(thread); 
    }
    
    private synchronized static void checkHook() {
    	if (OpenDESIGNERVFS==null) OpenDESIGNERVFS=new OpenDESIGNERVFS(); 
    }
    
    public static FileObject getFileObject(String vfsFilename) throws IOException
    {
    	checkHook();
    	
    	try {
	        FileSystemManager fsManager = VFS.getManager();
	        
	        // We have one problem with VFS: if the file is in a subdirectory of the current one: somedir/somefile
	        // In that case, VFS doesn't parse the file correctly.
	        // We need to put file: in front of it to make it work.
	        // However, how are we going to verify this?
	        // 
	        // We are going to see if the filename starts with one of the known protocols like file: zip: ram: smb: jar: etc.
	        // If not, we are going to assume it's a file.
	        //
	        boolean relativeFilename=true;
	        String[] schemes = VFS.getManager().getSchemes();
	        for (int i=0;i<schemes.length && relativeFilename;i++)
	        {
	            if (vfsFilename.startsWith(schemes[i]+":")) relativeFilename=false;
	        }
	        
	        String filename;
	        if (vfsFilename.startsWith("\\\\"))
	        {
	            File file = new File(vfsFilename);
	            filename = file.toURI().toString();
	        }
	        else
	        {
	            if (relativeFilename)
	            {
	                File file = new File(vfsFilename);
	                filename = file.getAbsolutePath();
	            }
	            else
	            {
	                filename = vfsFilename;
	            }
	        }
	        
	        FileObject fileObject = fsManager.resolveFile( filename );
	        
	        return fileObject;
    	}
    	catch(IOException e) {
    		throw new IOException("Unable to get VFS File object for filename '"+vfsFilename+"' : "+e.toString());
    	}
    }
    
    /**
     * Read a text file (like an XML document).  WARNING DO NOT USE FOR DATA FILES.
     * 
     * @param vfsFilename the filename or URL to read from
     * @param charSetName the character set of the string (UTF-8, ISO8859-1, etc)
     * @return The content of the file as a String
     * @throws IOException
     */
    public static String getTextFileContent(String vfsFilename, String charSetName) throws IOException
    {
        InputStream inputStream = getInputStream(vfsFilename);
        InputStreamReader reader = new InputStreamReader(inputStream, charSetName);
        int c;
        StringBuffer stringBuffer = new StringBuffer();
        while ( (c=reader.read())!=-1) stringBuffer.append((char)c);
        reader.close();
        inputStream.close();
        
        return stringBuffer.toString();
    }
    
    public static boolean fileExists(String vfsFilename) throws IOException
    {
        FileObject fileObject = getFileObject(vfsFilename);
        return fileObject.exists();
    }
    
    public static InputStream getInputStream(FileObject fileObject) throws FileSystemException
    {
        FileContent content = fileObject.getContent();
        return content.getInputStream();
    }
    
    public static InputStream getInputStream(String vfsFilename) throws IOException
    {
        FileObject fileObject = getFileObject(vfsFilename);
        return getInputStream(fileObject);
    }
    
    public static OutputStream getOutputStream(FileObject fileObject, boolean append) throws IOException
    {
        FileObject parent = fileObject.getParent();
        if (parent!=null)
        {
            if (!parent.exists())
            {
                throw new IOException(Messages.getString("OpenDESIGNERVFS.Exception.ParentDirectoryDoesNotExist", getFilename(parent)));
            }
        }
        try
        {
	        fileObject.createFile();
	        FileContent content = fileObject.getContent();
	        return content.getOutputStream(append);
        }
        catch(FileSystemException e)
        {
        	// Perhaps if it's a local file, we can retry using the standard
        	// File object.  This is because on Windows there is a bug in VFS.
        	//
        	if (fileObject instanceof LocalFile) 
        	{
        		try
        		{
	        		String filename = getFilename(fileObject);
	        		return new FileOutputStream(new File(filename), append);
        		}
        		catch(Exception e2)
        		{
        			throw e; // throw the original exception: hide the retry.
        		}
        	}
        	else
        	{
        		throw e;
        	}
        }
    }
    
    public static OutputStream getOutputStream(String vfsFilename, boolean append) throws IOException
    {
        FileObject fileObject = getFileObject(vfsFilename);
        return getOutputStream(fileObject, append);
    }
    
    public static String getFilename(FileObject fileObject)
    {
        FileName fileName = fileObject.getName();
        String root = fileName.getRootURI();
        if (!root.startsWith("file:")) return fileName.getURI(); // nothing we can do about non-normal files.
        if (root.endsWith(":/")) // Windows
        {
            root = root.substring(8,10);
        }
        else // *nix & OSX
        {
            root = "";
        }
        String fileString = root + fileName.getPath();
        if (!"/".equals(Const.FILE_SEPARATOR))
        {
            fileString = Const.replace(fileString, "/", Const.FILE_SEPARATOR);
        }
        return fileString;
    }
    
    public static FileObject createTempFile(String prefix, String suffix, String directory) throws IOException
    {
        FileObject fileObject;
        do
        {
          // Build temporary file name using UUID to ensure uniqueness. Old mechanism would fail using Sort Rows (for example)
          // when there multiple nodes with multiple JVMs on each node. In this case, the temp file names would end up being
          // duplicated which would cause the sort to fail.
          String filename = new StringBuffer(50).append(directory).append('/').append(prefix).append('_').append(UUIDUtil.getUUIDAsString()).append(suffix).toString();
          fileObject = getFileObject(filename);
        }
        while (fileObject.exists());
        return fileObject;
    }
    
    public static Comparator<FileObject> getComparator()
    {
        return new Comparator<FileObject>()
        {
            public int compare(FileObject o1, FileObject o2)
            {
                String filename1 = getFilename( o1);
                String filename2 = getFilename( o2);
                return filename1.compareTo(filename2);
            }
        };
    }

    /**
     * Get a FileInputStream for a local file.  Local files can be read with NIO.
     * 
     * @param fileObject
     * @return a FileInputStream
     * @throws IOException
     * @deprecated because of API change in Apache VFS.  As a workaround use FileObject.getName().getPathDecoded();
     * Then use a regular File() object to create a File Input stream.
     */
	public static FileInputStream getFileInputStream(FileObject fileObject) throws IOException {
		
		if (!(fileObject instanceof LocalFile)) {
			// We can only use NIO on local files at the moment, so that's what we limit ourselves to.
			//
			throw new IOException(Messages.getString("FixedInput.Log.OnlyLocalFilesAreSupported"));
		}
				
		return new FileInputStream( fileObject.getName().getPath() ); //getPathDecoded
	}

}
