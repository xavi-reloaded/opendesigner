package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

/**
 * OoCounters generated by hbm2java
 */
public class OoCounters implements java.io.Serializable {

	private Integer cid;
	private String gserial;
	private String ctype;
	private int count;
	private String cprefix;
	private String csubfix;
	private String cdescripcion;
	private String celement;

	public OoCounters() {
	}

	public OoCounters(int count) {
		this.count = count;
	}

	public OoCounters(String gserial, String ctype, int count, String cprefix,
			String csubfix, String cdescripcion, String celement) {
		this.gserial = gserial;
		this.ctype = ctype;
		this.count = count;
		this.cprefix = cprefix;
		this.csubfix = csubfix;
		this.cdescripcion = cdescripcion;
		this.celement = celement;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getGserial() {
		return this.gserial;
	}

	public void setGserial(String gserial) {
		this.gserial = gserial;
	}

	public String getCtype() {
		return this.ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCprefix() {
		return this.cprefix;
	}

	public void setCprefix(String cprefix) {
		this.cprefix = cprefix;
	}

	public String getCsubfix() {
		return this.csubfix;
	}

	public void setCsubfix(String csubfix) {
		this.csubfix = csubfix;
	}

	public String getCdescripcion() {
		return this.cdescripcion;
	}

	public void setCdescripcion(String cdescripcion) {
		this.cdescripcion = cdescripcion;
	}

	public String getCelement() {
		return this.celement;
	}

	public void setCelement(String celement) {
		this.celement = celement;
	}

}
