package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

/**
 * Tblinddb generated by hbm2java
 */
public class Tblinddb implements java.io.Serializable {

	private Integer iidb;
	private Integer idbtype;
	private String iid;
	private Integer idbmarkRed;
	private Integer idbmarkYellow;
	private Integer idbmarkGreen;

	public Tblinddb() {
	}

	public Tblinddb(Integer idbtype, String iid, Integer idbmarkRed,
			Integer idbmarkYellow, Integer idbmarkGreen) {
		this.idbtype = idbtype;
		this.iid = iid;
		this.idbmarkRed = idbmarkRed;
		this.idbmarkYellow = idbmarkYellow;
		this.idbmarkGreen = idbmarkGreen;
	}

	public Integer getIidb() {
		return this.iidb;
	}

	public void setIidb(Integer iidb) {
		this.iidb = iidb;
	}

	public Integer getIdbtype() {
		return this.idbtype;
	}

	public void setIdbtype(Integer idbtype) {
		this.idbtype = idbtype;
	}

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public Integer getIdbmarkRed() {
		return this.idbmarkRed;
	}

	public void setIdbmarkRed(Integer idbmarkRed) {
		this.idbmarkRed = idbmarkRed;
	}

	public Integer getIdbmarkYellow() {
		return this.idbmarkYellow;
	}

	public void setIdbmarkYellow(Integer idbmarkYellow) {
		this.idbmarkYellow = idbmarkYellow;
	}

	public Integer getIdbmarkGreen() {
		return this.idbmarkGreen;
	}

	public void setIdbmarkGreen(Integer idbmarkGreen) {
		this.idbmarkGreen = idbmarkGreen;
	}

}
