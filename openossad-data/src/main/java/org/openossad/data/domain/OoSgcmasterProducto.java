package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

/**
 * OoSgcmasterProducto generated by hbm2java
 */
public class OoSgcmasterProducto implements java.io.Serializable {

	private Integer idx;
	private String pname;
	private String pdescription;

	public OoSgcmasterProducto() {
	}

	public OoSgcmasterProducto(String pname, String pdescription) {
		this.pname = pname;
		this.pdescription = pdescription;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdescription() {
		return this.pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

}
