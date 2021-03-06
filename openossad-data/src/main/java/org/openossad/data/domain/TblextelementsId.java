package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

/**
 * TblextelementsId generated by hbm2java
 */
public class TblextelementsId implements java.io.Serializable {

	private String eltExtId;
	private Integer eltId;
	private String eltDescription;
	private String eltIcone;

	public TblextelementsId() {
	}

	public TblextelementsId(String eltDescription, String eltIcone) {
		this.eltDescription = eltDescription;
		this.eltIcone = eltIcone;
	}

	public TblextelementsId(String eltExtId, Integer eltId,
			String eltDescription, String eltIcone) {
		this.eltExtId = eltExtId;
		this.eltId = eltId;
		this.eltDescription = eltDescription;
		this.eltIcone = eltIcone;
	}

	public String getEltExtId() {
		return this.eltExtId;
	}

	public void setEltExtId(String eltExtId) {
		this.eltExtId = eltExtId;
	}

	public Integer getEltId() {
		return this.eltId;
	}

	public void setEltId(Integer eltId) {
		this.eltId = eltId;
	}

	public String getEltDescription() {
		return this.eltDescription;
	}

	public void setEltDescription(String eltDescription) {
		this.eltDescription = eltDescription;
	}

	public String getEltIcone() {
		return this.eltIcone;
	}

	public void setEltIcone(String eltIcone) {
		this.eltIcone = eltIcone;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblextelementsId))
			return false;
		TblextelementsId castOther = (TblextelementsId) other;

		return ((this.getEltExtId() == castOther.getEltExtId()) || (this
				.getEltExtId() != null
				&& castOther.getEltExtId() != null && this.getEltExtId()
				.equals(castOther.getEltExtId())))
				&& ((this.getEltId() == castOther.getEltId()) || (this
						.getEltId() != null
						&& castOther.getEltId() != null && this.getEltId()
						.equals(castOther.getEltId())))
				&& ((this.getEltDescription() == castOther.getEltDescription()) || (this
						.getEltDescription() != null
						&& castOther.getEltDescription() != null && this
						.getEltDescription().equals(
								castOther.getEltDescription())))
				&& ((this.getEltIcone() == castOther.getEltIcone()) || (this
						.getEltIcone() != null
						&& castOther.getEltIcone() != null && this
						.getEltIcone().equals(castOther.getEltIcone())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEltExtId() == null ? 0 : this.getEltExtId().hashCode());
		result = 37 * result
				+ (getEltId() == null ? 0 : this.getEltId().hashCode());
		result = 37
				* result
				+ (getEltDescription() == null ? 0 : this.getEltDescription()
						.hashCode());
		result = 37 * result
				+ (getEltIcone() == null ? 0 : this.getEltIcone().hashCode());
		return result;
	}

}
