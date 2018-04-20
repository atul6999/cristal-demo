package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="active_user_profile_id")
	private int activeUserProfileId;

	@Column(name="administration_rights")
	private int administrationRights;

	@Column(length=255)
	private String company;

	@Column(name="confirmation_token", length=255)
	private String confirmationToken;

	@Column(name="coverage_concurrent_active")
	private byte coverageConcurrentActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="credentials_expire_at")
	private Date credentialsExpireAt;

	@Column(name="credentials_expired", nullable=true)
	private byte credentialsExpired;

	@Column(length=255)
	private String email;

	@Column(name="email_canonical", length=255)
	private String emailCanonical;

	@Column(length=255)
	private String email2;

	@Column(nullable=false)
	private byte enabled;

	@Column(nullable=false)
	private byte expired;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expires_at")
	private Date expiresAt;

	@Column(length=64)
	private String firstname;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="habilitation_date")
	private Date habilitationDate;

	@Column(name="heartbeat_active")
	private byte heartbeatActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login")
	private Date lastLogin;

	@Column(length=64)
	private String lastname;

	@Column(nullable=false)
	private byte locked;

	@Column(name="mail_notification_active")
	private byte mailNotificationActive;

	@Column(name="mail2_notification_active")
	private byte mail2NotificationActive;

	@Column(length=255)
	private String name;

	@Column(nullable=true, length=255)
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="password_requested_at")
	private Date passwordRequestedAt;

	@Column(length=64)
	private String phone;

	@Column(length=64)
	private String phone2;

	@Column(name="remedy_active")
	private byte remedyActive;

	@Lob
	@Column(nullable=false)
	private String roles;

	@Column(nullable=false, length=255)
	private String salt;

	@Column(name="sms_notification_active")
	private byte smsNotificationActive;

	@Column(name="sms2_notification_active")
	private byte sms2NotificationActive;

	@Column(length=255)
	private String status;

	@Column(nullable=false)
	private byte tdf;

	@Column(name="telephone_notification_active")
	private byte telephoneNotificationActive;

	@Column(nullable=false, length=255)
	private String username;

	@Column(name="username_canonical", nullable=false, length=255)
	private String usernameCanonical;

	//bi-directional many-to-many association to User
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST )
	@JoinColumn(name="user_id", nullable=false, insertable=false, updatable=false)
	private List<Skill> skills;
		
	public User() {
	}

	public User(String name, List<Skill> skills) {
		this.name = name;
		this.skills = skills;
		this.password = "atul";		
		this.roles = "atul";
		this.salt = "atul";
		this.username = "atul";
		this.usernameCanonical = "atul";
		this.credentialsExpired = 1;
		this.tdf = 1;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActiveUserProfileId() {
		return this.activeUserProfileId;
	}

	public void setActiveUserProfileId(int activeUserProfileId) {
		this.activeUserProfileId = activeUserProfileId;
	}

	public int getAdministrationRights() {
		return this.administrationRights;
	}

	public void setAdministrationRights(int administrationRights) {
		this.administrationRights = administrationRights;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getConfirmationToken() {
		return this.confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public byte getCoverageConcurrentActive() {
		return this.coverageConcurrentActive;
	}

	public void setCoverageConcurrentActive(byte coverageConcurrentActive) {
		this.coverageConcurrentActive = coverageConcurrentActive;
	}

	public Date getCredentialsExpireAt() {
		return this.credentialsExpireAt;
	}

	public void setCredentialsExpireAt(Date credentialsExpireAt) {
		this.credentialsExpireAt = credentialsExpireAt;
	}

	public byte getCredentialsExpired() {
		return this.credentialsExpired;
	}

	public void setCredentialsExpired(byte credentialsExpired) {
		this.credentialsExpired = credentialsExpired;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailCanonical() {
		return this.emailCanonical;
	}

	public void setEmailCanonical(String emailCanonical) {
		this.emailCanonical = emailCanonical;
	}

	public String getEmail2() {
		return this.email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

	public byte getExpired() {
		return this.expired;
	}

	public void setExpired(byte expired) {
		this.expired = expired;
	}

	public Date getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getHabilitationDate() {
		return this.habilitationDate;
	}

	public void setHabilitationDate(Date habilitationDate) {
		this.habilitationDate = habilitationDate;
	}

	public byte getHeartbeatActive() {
		return this.heartbeatActive;
	}

	public void setHeartbeatActive(byte heartbeatActive) {
		this.heartbeatActive = heartbeatActive;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public byte getLocked() {
		return this.locked;
	}

	public void setLocked(byte locked) {
		this.locked = locked;
	}

	public byte getMailNotificationActive() {
		return this.mailNotificationActive;
	}

	public void setMailNotificationActive(byte mailNotificationActive) {
		this.mailNotificationActive = mailNotificationActive;
	}

	public byte getMail2NotificationActive() {
		return this.mail2NotificationActive;
	}

	public void setMail2NotificationActive(byte mail2NotificationActive) {
		this.mail2NotificationActive = mail2NotificationActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPasswordRequestedAt() {
		return this.passwordRequestedAt;
	}

	public void setPasswordRequestedAt(Date passwordRequestedAt) {
		this.passwordRequestedAt = passwordRequestedAt;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public byte getRemedyActive() {
		return this.remedyActive;
	}

	public void setRemedyActive(byte remedyActive) {
		this.remedyActive = remedyActive;
	}

	public String getRoles() {
		return this.roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public byte getSmsNotificationActive() {
		return this.smsNotificationActive;
	}

	public void setSmsNotificationActive(byte smsNotificationActive) {
		this.smsNotificationActive = smsNotificationActive;
	}

	public byte getSms2NotificationActive() {
		return this.sms2NotificationActive;
	}

	public void setSms2NotificationActive(byte sms2NotificationActive) {
		this.sms2NotificationActive = sms2NotificationActive;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public byte getTdf() {
		return this.tdf;
	}

	public void setTdf(byte tdf) {
		this.tdf = tdf;
	}

	public byte getTelephoneNotificationActive() {
		return this.telephoneNotificationActive;
	}

	public void setTelephoneNotificationActive(byte telephoneNotificationActive) {
		this.telephoneNotificationActive = telephoneNotificationActive;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsernameCanonical() {
		return this.usernameCanonical;
	}

	public void setUsernameCanonical(String usernameCanonical) {
		this.usernameCanonical = usernameCanonical;
	}
	
	public List<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

}