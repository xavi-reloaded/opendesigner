package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * Tblaccounts generated by hbm2java
 */
public class Tblaccounts implements java.io.Serializable {

	private Integer sid;
	private String name;
	private String completeName;
	private String description;
	private int isGroup;
	private int type;
	private String password;
	private String samsid;
	private String samaccountName;
	private String phone;
	private String mail;
	private Date lastLoginDate;
	private String id;
	private String phoneHome;
	private String fax;
	private String faxHome;
	private String mobilPhone;
	private String mobilHomePhone;
	private String mobilCarPhone;
	private String adress;
	private String mail2;
	private String mail3;
	private String responsable;
	private String assistant;
	private String photoGid;
	private Date updateDate;
	private Boolean htmlGen;
	private String gtype;
	private String pageArrivee;
	private String roles;

	public Tblaccounts() {
	}

	public Tblaccounts(String completeName, String description, int isGroup,
			int type, String password, String samsid, String samaccountName,
			String phone, String mail, Date lastLoginDate, String id,
			String phoneHome, String fax, String faxHome, String mobilPhone,
			String mobilHomePhone, String mobilCarPhone, String adress,
			String mail2, String mail3, String responsable, String assistant,
			String photoGid, Date updateDate, String gtype, String pageArrivee) {
		this.completeName = completeName;
		this.description = description;
		this.isGroup = isGroup;
		this.type = type;
		this.password = password;
		this.samsid = samsid;
		this.samaccountName = samaccountName;
		this.phone = phone;
		this.mail = mail;
		this.lastLoginDate = lastLoginDate;
		this.id = id;
		this.phoneHome = phoneHome;
		this.fax = fax;
		this.faxHome = faxHome;
		this.mobilPhone = mobilPhone;
		this.mobilHomePhone = mobilHomePhone;
		this.mobilCarPhone = mobilCarPhone;
		this.adress = adress;
		this.mail2 = mail2;
		this.mail3 = mail3;
		this.responsable = responsable;
		this.assistant = assistant;
		this.photoGid = photoGid;
		this.updateDate = updateDate;
		this.gtype = gtype;
		this.pageArrivee = pageArrivee;
	}

	public Tblaccounts(String name, String completeName, String description,
			int isGroup, int type, String password, String samsid,
			String samaccountName, String phone, String mail,
			Date lastLoginDate, String id, String phoneHome, String fax,
			String faxHome, String mobilPhone, String mobilHomePhone,
			String mobilCarPhone, String adress, String mail2, String mail3,
			String responsable, String assistant, String photoGid,
			Date updateDate, Boolean htmlGen, String gtype, String pageArrivee,
			String roles) {
		this.name = name;
		this.completeName = completeName;
		this.description = description;
		this.isGroup = isGroup;
		this.type = type;
		this.password = password;
		this.samsid = samsid;
		this.samaccountName = samaccountName;
		this.phone = phone;
		this.mail = mail;
		this.lastLoginDate = lastLoginDate;
		this.id = id;
		this.phoneHome = phoneHome;
		this.fax = fax;
		this.faxHome = faxHome;
		this.mobilPhone = mobilPhone;
		this.mobilHomePhone = mobilHomePhone;
		this.mobilCarPhone = mobilCarPhone;
		this.adress = adress;
		this.mail2 = mail2;
		this.mail3 = mail3;
		this.responsable = responsable;
		this.assistant = assistant;
		this.photoGid = photoGid;
		this.updateDate = updateDate;
		this.htmlGen = htmlGen;
		this.gtype = gtype;
		this.pageArrivee = pageArrivee;
		this.roles = roles;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompleteName() {
		return this.completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIsGroup() {
		return this.isGroup;
	}

	public void setIsGroup(int isGroup) {
		this.isGroup = isGroup;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSamsid() {
		return this.samsid;
	}

	public void setSamsid(String samsid) {
		this.samsid = samsid;
	}

	public String getSamaccountName() {
		return this.samaccountName;
	}

	public void setSamaccountName(String samaccountName) {
		this.samaccountName = samaccountName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneHome() {
		return this.phoneHome;
	}

	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFaxHome() {
		return this.faxHome;
	}

	public void setFaxHome(String faxHome) {
		this.faxHome = faxHome;
	}

	public String getMobilPhone() {
		return this.mobilPhone;
	}

	public void setMobilPhone(String mobilPhone) {
		this.mobilPhone = mobilPhone;
	}

	public String getMobilHomePhone() {
		return this.mobilHomePhone;
	}

	public void setMobilHomePhone(String mobilHomePhone) {
		this.mobilHomePhone = mobilHomePhone;
	}

	public String getMobilCarPhone() {
		return this.mobilCarPhone;
	}

	public void setMobilCarPhone(String mobilCarPhone) {
		this.mobilCarPhone = mobilCarPhone;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMail2() {
		return this.mail2;
	}

	public void setMail2(String mail2) {
		this.mail2 = mail2;
	}

	public String getMail3() {
		return this.mail3;
	}

	public void setMail3(String mail3) {
		this.mail3 = mail3;
	}

	public String getResponsable() {
		return this.responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getAssistant() {
		return this.assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public String getPhotoGid() {
		return this.photoGid;
	}

	public void setPhotoGid(String photoGid) {
		this.photoGid = photoGid;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getHtmlGen() {
		return this.htmlGen;
	}

	public void setHtmlGen(Boolean htmlGen) {
		this.htmlGen = htmlGen;
	}

	public String getGtype() {
		return this.gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	public String getPageArrivee() {
		return this.pageArrivee;
	}

	public void setPageArrivee(String pageArrivee) {
		this.pageArrivee = pageArrivee;
	}

	public String getRoles() {
		return this.roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

}
