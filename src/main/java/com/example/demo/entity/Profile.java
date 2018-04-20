package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
@Table(name="profile")
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private int duration;

	@Column(name="is_primary", nullable=false)
	private byte isPrimary;

	@Column(nullable=false)
	private byte label;

	@Column(length=255)
	private String logo;

	@Column(nullable=false, length=255)
	private String name;

	@Column(name="tdf_contact_email", length=255)
	private String tdfContactEmail;

	@Column(name="tdf_contact_phone", length=255)
	private String tdfContactPhone;

	@Column(nullable=false)
	private byte type;

	@Column(name="user_manual_id")
	private int userManualId;

	//uni-directional many-to-one association to Application
	@ManyToOne
	@JoinColumn(name="application_id", nullable=false)
	private Application application;

	//bi-directional many-to-one association to ProfilePermission
	@OneToMany(mappedBy="profile", fetch=FetchType.EAGER)
	private List<ProfilePermission> profilePermissions;

	public Profile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public byte getIsPrimary() {
		return this.isPrimary;
	}

	public void setIsPrimary(byte isPrimary) {
		this.isPrimary = isPrimary;
	}

	public byte getLabel() {
		return this.label;
	}

	public void setLabel(byte label) {
		this.label = label;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTdfContactEmail() {
		return this.tdfContactEmail;
	}

	public void setTdfContactEmail(String tdfContactEmail) {
		this.tdfContactEmail = tdfContactEmail;
	}

	public String getTdfContactPhone() {
		return this.tdfContactPhone;
	}

	public void setTdfContactPhone(String tdfContactPhone) {
		this.tdfContactPhone = tdfContactPhone;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public int getUserManualId() {
		return this.userManualId;
	}

	public void setUserManualId(int userManualId) {
		this.userManualId = userManualId;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public List<ProfilePermission> getProfilePermissions() {
		return this.profilePermissions;
	}

	public void setProfilePermissions(List<ProfilePermission> profilePermissions) {
		this.profilePermissions = profilePermissions;
	}

	public ProfilePermission addProfilePermission(ProfilePermission profilePermission) {
		getProfilePermissions().add(profilePermission);
		profilePermission.setProfile(this);

		return profilePermission;
	}

	public ProfilePermission removeProfilePermission(ProfilePermission profilePermission) {
		getProfilePermissions().remove(profilePermission);
		profilePermission.setProfile(null);

		return profilePermission;
	}

}