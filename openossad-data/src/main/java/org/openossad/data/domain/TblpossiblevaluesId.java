package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * TblpossiblevaluesId generated by hbm2java
 */
public class TblpossiblevaluesId implements java.io.Serializable {

	private String pvCode;
	private Integer pvNumber;
	private int pvLongValue;
	private Date pvDateValue;
	private String pvTextValue;
	private String pvMemoValue;
	private int pvOrder;

	public TblpossiblevaluesId() {
	}

	public TblpossiblevaluesId(int pvLongValue, Date pvDateValue,
			String pvTextValue, String pvMemoValue, int pvOrder) {
		this.pvLongValue = pvLongValue;
		this.pvDateValue = pvDateValue;
		this.pvTextValue = pvTextValue;
		this.pvMemoValue = pvMemoValue;
		this.pvOrder = pvOrder;
	}

	public TblpossiblevaluesId(String pvCode, Integer pvNumber,
			int pvLongValue, Date pvDateValue, String pvTextValue,
			String pvMemoValue, int pvOrder) {
		this.pvCode = pvCode;
		this.pvNumber = pvNumber;
		this.pvLongValue = pvLongValue;
		this.pvDateValue = pvDateValue;
		this.pvTextValue = pvTextValue;
		this.pvMemoValue = pvMemoValue;
		this.pvOrder = pvOrder;
	}

	public String getPvCode() {
		return this.pvCode;
	}

	public void setPvCode(String pvCode) {
		this.pvCode = pvCode;
	}

	public Integer getPvNumber() {
		return this.pvNumber;
	}

	public void setPvNumber(Integer pvNumber) {
		this.pvNumber = pvNumber;
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

	public int getPvOrder() {
		return this.pvOrder;
	}

	public void setPvOrder(int pvOrder) {
		this.pvOrder = pvOrder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblpossiblevaluesId))
			return false;
		TblpossiblevaluesId castOther = (TblpossiblevaluesId) other;

		return ((this.getPvCode() == castOther.getPvCode()) || (this
				.getPvCode() != null
				&& castOther.getPvCode() != null && this.getPvCode().equals(
				castOther.getPvCode())))
				&& ((this.getPvNumber() == castOther.getPvNumber()) || (this
						.getPvNumber() != null
						&& castOther.getPvNumber() != null && this
						.getPvNumber().equals(castOther.getPvNumber())))
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
				&& (this.getPvOrder() == castOther.getPvOrder());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPvCode() == null ? 0 : this.getPvCode().hashCode());
		result = 37 * result
				+ (getPvNumber() == null ? 0 : this.getPvNumber().hashCode());
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
		result = 37 * result + this.getPvOrder();
		return result;
	}

}
