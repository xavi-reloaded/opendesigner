package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

/**
 * OoSgctipoAuditoria generated by hbm2java
 */
public class OoSgctipoAuditoria implements java.io.Serializable {

	private Integer idx;
	private String taname;
	private String tadescription;

	public OoSgctipoAuditoria() {
	}

	public OoSgctipoAuditoria(String taname, String tadescription) {
		this.taname = taname;
		this.tadescription = tadescription;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getTaname() {
		return this.taname;
	}

	public void setTaname(String taname) {
		this.taname = taname;
	}

	public String getTadescription() {
		return this.tadescription;
	}

	public void setTadescription(String tadescription) {
		this.tadescription = tadescription;
	}

}