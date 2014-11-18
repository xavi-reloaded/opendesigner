package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * TblpropvaluesId generated by hbm2java
 */
public class TblpropvaluesId implements java.io.Serializable {

	private String pvCode;
	private String pvGid;
	private String pvType;
	private int pvLongValue;
	private Date pvDateValue;
	private String pvTextValue;
	private String pvMemoValue;
	private Boolean pvBooleanValue;
	private int pvObjectType;

	public TblpropvaluesId() {
	}

	public TblpropvaluesId(String pvCode, String pvGid, String pvType,
			int pvLongValue, Date pvDateValue, String pvTextValue,
			String pvMemoValue, int pvObjectType) {
		this.pvCode = pvCode;
		this.pvGid = pvGid;
		this.pvType = pvType;
		this.pvLongValue = pvLongValue;
		this.pvDateValue = pvDateValue;
		this.pvTextValue = pvTextValue;
		this.pvMemoValue = pvMemoValue;
		this.pvObjectType = pvObjectType;
	}

	public TblpropvaluesId(String pvCode, String pvGid, String pvType,
			int pvLongValue, Date pvDateValue, String pvTextValue,
			String pvMemoValue, Boolean pvBooleanValue, int pvObjectType) {
		this.pvCode = pvCode;
		this.pvGid = pvGid;
		this.pvType = pvType;
		this.pvLongValue = pvLongValue;
		this.pvDateValue = pvDateValue;
		this.pvTextValue = pvTextValue;
		this.pvMemoValue = pvMemoValue;
		this.pvBooleanValue = pvBooleanValue;
		this.pvObjectType = pvObjectType;
	}

	public String getPvCode() {
		return this.pvCode;
	}

	public void setPvCode(String pvCode) {
		this.pvCode = pvCode;
	}

	public String getPvGid() {
		return this.pvGid;
	}

	public void setPvGid(String pvGid) {
		this.pvGid = pvGid;
	}

	public String getPvType() {
		return this.pvType;
	}

	public void setPvType(String pvType) {
		this.pvType = pvType;
	}

	public int getPvLongValue() {
		return this.pvLongValue;
	}

	public void setPvLongValue(int pvLongValue) {
		this.pvLongValue = pvLongValue;
	}

	public Date getPvDateValue() {
		return this.pvDateValue;
	}

	public void setPvDateValue(Date pvDateValue) {
		this.pvDateValue = pvDateValue;
	}

	public String getPvTextValue() {
		return this.pvTextValue;
	}

	public void setPvTextValue(String pvTextValue) {
		this.pvTextValue = pvTextValue;
	}

	public String getPvMemoValue() {
		return this.pvMemoValue;
	}

	public void setPvMemoValue(String pvMemoValue) {
		this.pvMemoValue = pvMemoValue;
	}

	public Boolean getPvBooleanValue() {
		return this.pvBooleanValue;
	}

	public void setPvBooleanValue(Boolean pvBooleanValue) {
		this.pvBooleanValue = pvBooleanValue;
	}

	public int getPvObjectType() {
		return this.pvObjectType;
	}

	public void setPvObjectType(int pvObjectType) {
		this.pvObjectType = pvObjectType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblpropvaluesId))
			return false;
		TblpropvaluesId castOther = (TblpropvaluesId) other;

		return ((this.getPvCode() == castOther.getPvCode()) || (this
				.getPvCode() != null
				&& castOther.getPvCode() != null && this.getPvCode().equals(
				castOther.getPvCode())))
				&& ((this.getPvGid() == castOther.getPvGid()) || (this
						.getPvGid() != null
						&& castOther.getPvGid() != null && this.getPvGid()
						.equals(castOther.getPvGid())))
				&& ((this.getPvType() == castOther.getPvType()) || (this
						.getPvType() != null
						&& castOther.getPvType() != null && this.getPvType()
						.equals(castOther.getPvType())))
				&& (this.getPvLongValue() == castOther.getPvLongValue())
				&& ((this.getPvDateValue() == castOther.getPvDateValue()) || (this
						.getPvDateValue() != null
						&& castOther.getPvDateValue() != null && this
						.getPvDateValue().equals(castOther.getPvDateValue())))
				&& ((this.getPvTextValue() == castOther.getPvTextValue()) || (this
						.getPvTextValue() != null
						&& castOther.getPvTextValue() != null && this
						.getPvTextValue().equals(castOther.getPvTextValue())))
				&& ((this.getPvMemoValue() == castOther.getPvMemoValue()) || (this
						.getPvMemoValue() != null
						&& castOther.getPvMemoValue() != null && this
						.getPvMemoValue().equals(castOther.getPvMemoValue())))
				&& ((this.getPvBooleanValue() == castOther.getPvBooleanValue()) || (this
						.getPvBooleanValue() != null
						&& castOther.getPvBooleanValue() != null && this
						.getPvBooleanValue().equals(
								castOther.getPvBooleanValue())))
				&& (this.getPvObjectType() == castOther.getPvObjectType());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPvCode() == null ? 0 : this.getPvCode().hashCode());
		result = 37 * result
				+ (getPvGid() == null ? 0 : this.getPvGid().hashCode());
		result = 37 * result
				+ (getPvType() == null ? 0 : this.getPvType().hashCode());
		result = 37 * result + this.getPvLongValue();
		result = 37
				* result
				+ (getPvDateValue() == null ? 0 : this.getPvDateValue()
						.hashCode());
		result = 37
				* result
				+ (getPvTextValue() == null ? 0 : this.getPvTextValue()
						.hashCode());
		result = 37
				* result
				+ (getPvMemoValue() == null ? 0 : this.getPvMemoValue()
						.hashCode());
		result = 37
				* result
				+ (getPvBooleanValue() == null ? 0 : this.getPvBooleanValue()
						.hashCode());
		result = 37 * result + this.getPvObjectType();
		return result;
	}

}
