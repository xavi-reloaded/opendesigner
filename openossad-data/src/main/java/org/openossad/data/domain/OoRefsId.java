package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

/**
 * OoRefsId generated by hbm2java
 */
public class OoRefsId implements java.io.Serializable {

	private Integer refId;
	private String refName;
	private String refRadical;
	private String refFormat;
	private int refCount;
	private int refIncrement;
	private int refIndMax;
	private Boolean refShared;

	public OoRefsId() {
	}

	public OoRefsId(String refName, String refRadical, String refFormat,
			int refCount, int refIncrement, int refIndMax) {
		this.refName = refName;
		this.refRadical = refRadical;
		this.refFormat = refFormat;
		this.refCount = refCount;
		this.refIncrement = refIncrement;
		this.refIndMax = refIndMax;
	}

	public OoRefsId(Integer refId, String refName, String refRadical,
			String refFormat, int refCount, int refIncrement, int refIndMax,
			Boolean refShared) {
		this.refId = refId;
		this.refName = refName;
		this.refRadical = refRadical;
		this.refFormat = refFormat;
		this.refCount = refCount;
		this.refIncrement = refIncrement;
		this.refIndMax = refIndMax;
		this.refShared = refShared;
	}

	public Integer getRefId() {
		return this.refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public String getRefName() {
		return this.refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getRefRadical() {
		return this.refRadical;
	}

	public void setRefRadical(String refRadical) {
		this.refRadical = refRadical;
	}

	public String getRefFormat() {
		return this.refFormat;
	}

	public void setRefFormat(String refFormat) {
		this.refFormat = refFormat;
	}

	public int getRefCount() {
		return this.refCount;
	}

	public void setRefCount(int refCount) {
		this.refCount = refCount;
	}

	public int getRefIncrement() {
		return this.refIncrement;
	}

	public void setRefIncrement(int refIncrement) {
		this.refIncrement = refIncrement;
	}

	public int getRefIndMax() {
		return this.refIndMax;
	}

	public void setRefIndMax(int refIndMax) {
		this.refIndMax = refIndMax;
	}

	public Boolean getRefShared() {
		return this.refShared;
	}

	public void setRefShared(Boolean refShared) {
		this.refShared = refShared;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OoRefsId))
			return false;
		OoRefsId castOther = (OoRefsId) other;

		return ((this.getRefId() == castOther.getRefId()) || (this.getRefId() != null
				&& castOther.getRefId() != null && this.getRefId().equals(
				castOther.getRefId())))
				&& ((this.getRefName() == castOther.getRefName()) || (this
						.getRefName() != null
						&& castOther.getRefName() != null && this.getRefName()
						.equals(castOther.getRefName())))
				&& ((this.getRefRadical() == castOther.getRefRadical()) || (this
						.getRefRadical() != null
						&& castOther.getRefRadical() != null && this
						.getRefRadical().equals(castOther.getRefRadical())))
				&& ((this.getRefFormat() == castOther.getRefFormat()) || (this
						.getRefFormat() != null
						&& castOther.getRefFormat() != null && this
						.getRefFormat().equals(castOther.getRefFormat())))
				&& (this.getRefCount() == castOther.getRefCount())
				&& (this.getRefIncrement() == castOther.getRefIncrement())
				&& (this.getRefIndMax() == castOther.getRefIndMax())
				&& ((this.getRefShared() == castOther.getRefShared()) || (this
						.getRefShared() != null
						&& castOther.getRefShared() != null && this
						.getRefShared().equals(castOther.getRefShared())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRefId() == null ? 0 : this.getRefId().hashCode());
		result = 37 * result
				+ (getRefName() == null ? 0 : this.getRefName().hashCode());
		result = 37
				* result
				+ (getRefRadical() == null ? 0 : this.getRefRadical()
						.hashCode());
		result = 37 * result
				+ (getRefFormat() == null ? 0 : this.getRefFormat().hashCode());
		result = 37 * result + this.getRefCount();
		result = 37 * result + this.getRefIncrement();
		result = 37 * result + this.getRefIndMax();
		result = 37 * result
				+ (getRefShared() == null ? 0 : this.getRefShared().hashCode());
		return result;
	}

}
