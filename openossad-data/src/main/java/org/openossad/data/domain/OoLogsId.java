package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * OoLogsId generated by hbm2java
 */
public class OoLogsId implements java.io.Serializable {

	private String licenceId;
	private String installNumber;
	private String userName;
	private String versionNumber;
	private String productName;
	private Date lastConnect;
	private Date lastDisconnect;
	private int connected;

	public OoLogsId() {
	}

	public OoLogsId(String userName, String versionNumber, String productName,
			Date lastConnect, Date lastDisconnect, int connected) {
		this.userName = userName;
		this.versionNumber = versionNumber;
		this.productName = productName;
		this.lastConnect = lastConnect;
		this.lastDisconnect = lastDisconnect;
		this.connected = connected;
	}

	public OoLogsId(String licenceId, String installNumber, String userName,
			String versionNumber, String productName, Date lastConnect,
			Date lastDisconnect, int connected) {
		this.licenceId = licenceId;
		this.installNumber = installNumber;
		this.userName = userName;
		this.versionNumber = versionNumber;
		this.productName = productName;
		this.lastConnect = lastConnect;
		this.lastDisconnect = lastDisconnect;
		this.connected = connected;
	}

	public String getLicenceId() {
		return this.licenceId;
	}

	public void setLicenceId(String licenceId) {
		this.licenceId = licenceId;
	}

	public String getInstallNumber() {
		return this.installNumber;
	}

	public void setInstallNumber(String installNumber) {
		this.installNumber = installNumber;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getLastConnect() {
		return this.lastConnect;
	}

	public void setLastConnect(Date lastConnect) {
		this.lastConnect = lastConnect;
	}

	public Date getLastDisconnect() {
		return this.lastDisconnect;
	}

	public void setLastDisconnect(Date lastDisconnect) {
		this.lastDisconnect = lastDisconnect;
	}

	public int getConnected() {
		return this.connected;
	}

	public void setConnected(int connected) {
		this.connected = connected;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OoLogsId))
			return false;
		OoLogsId castOther = (OoLogsId) other;

		return ((this.getLicenceId() == castOther.getLicenceId()) || (this
				.getLicenceId() != null
				&& castOther.getLicenceId() != null && this.getLicenceId()
				.equals(castOther.getLicenceId())))
				&& ((this.getInstallNumber() == castOther.getInstallNumber()) || (this
						.getInstallNumber() != null
						&& castOther.getInstallNumber() != null && this
						.getInstallNumber()
						.equals(castOther.getInstallNumber())))
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())))
				&& ((this.getVersionNumber() == castOther.getVersionNumber()) || (this
						.getVersionNumber() != null
						&& castOther.getVersionNumber() != null && this
						.getVersionNumber()
						.equals(castOther.getVersionNumber())))
				&& ((this.getProductName() == castOther.getProductName()) || (this
						.getProductName() != null
						&& castOther.getProductName() != null && this
						.getProductName().equals(castOther.getProductName())))
				&& ((this.getLastConnect() == castOther.getLastConnect()) || (this
						.getLastConnect() != null
						&& castOther.getLastConnect() != null && this
						.getLastConnect().equals(castOther.getLastConnect())))
				&& ((this.getLastDisconnect() == castOther.getLastDisconnect()) || (this
						.getLastDisconnect() != null
						&& castOther.getLastDisconnect() != null && this
						.getLastDisconnect().equals(
								castOther.getLastDisconnect())))
				&& (this.getConnected() == castOther.getConnected());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLicenceId() == null ? 0 : this.getLicenceId().hashCode());
		result = 37
				* result
				+ (getInstallNumber() == null ? 0 : this.getInstallNumber()
						.hashCode());
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37
				* result
				+ (getVersionNumber() == null ? 0 : this.getVersionNumber()
						.hashCode());
		result = 37
				* result
				+ (getProductName() == null ? 0 : this.getProductName()
						.hashCode());
		result = 37
				* result
				+ (getLastConnect() == null ? 0 : this.getLastConnect()
						.hashCode());
		result = 37
				* result
				+ (getLastDisconnect() == null ? 0 : this.getLastDisconnect()
						.hashCode());
		result = 37 * result + this.getConnected();
		return result;
	}

}
