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

	@Column(name="credentials_expired", nullable=false)
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

	@Column(nullable=false, length=255)
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

	private byte tdf;

	@Column(name="telephone_notification_active")
	private byte telephoneNotificationActive;

	@Column(nullable=false, length=255)
	private String username;

	@Column(name="username_canonical", nullable=false, length=255)
	private String usernameCanonical;

	//bi-directional many-to-one association to Accesstoken
	@OneToMany(mappedBy="user")
	private List<Accesstoken> accesstokens;

	//bi-directional many-to-one association to Authcode
	@OneToMany(mappedBy="user")
	private List<Authcode> authcodes;

	//bi-directional many-to-one association to Refreshtoken
	@OneToMany(mappedBy="user")
	private List<Refreshtoken> refreshtokens;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="active_user_profile_id")
	private Profile profile;

	//bi-directional many-to-one association to UserAcquittedAlarm
	@OneToMany(mappedBy="user")
	private List<UserAcquittedAlarm> userAcquittedAlarms;

	//bi-directional many-to-one association to UserActionHistory
	@OneToMany(mappedBy="user")
	private List<UserActionHistory> userActionHistories;

	//bi-directional many-to-one association to UserProfile
	@OneToMany(mappedBy="user")
	private List<UserProfile> userProfiles;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Accesstoken> getAccesstokens() {
		return this.accesstokens;
	}

	public void setAccesstokens(List<Accesstoken> accesstokens) {
		this.accesstokens = accesstokens;
	}

	public Accesstoken addAccesstoken(Accesstoken accesstoken) {
		getAccesstokens().add(accesstoken);
		accesstoken.setUser(this);

		return accesstoken;
	}

	public Accesstoken removeAccesstoken(Accesstoken accesstoken) {
		getAccesstokens().remove(accesstoken);
		accesstoken.setUser(null);

		return accesstoken;
	}

	public List<Authcode> getAuthcodes() {
		return this.authcodes;
	}

	public void setAuthcodes(List<Authcode> authcodes) {
		this.authcodes = authcodes;
	}

	public Authcode addAuthcode(Authcode authcode) {
		getAuthcodes().add(authcode);
		authcode.setUser(this);

		return authcode;
	}

	public Authcode removeAuthcode(Authcode authcode) {
		getAuthcodes().remove(authcode);
		authcode.setUser(null);

		return authcode;
	}

	public List<Refreshtoken> getRefreshtokens() {
		return this.refreshtokens;
	}

	public void setRefreshtokens(List<Refreshtoken> refreshtokens) {
		this.refreshtokens = refreshtokens;
	}

	public Refreshtoken addRefreshtoken(Refreshtoken refreshtoken) {
		getRefreshtokens().add(refreshtoken);
		refreshtoken.setUser(this);

		return refreshtoken;
	}

	public Refreshtoken removeRefreshtoken(Refreshtoken refreshtoken) {
		getRefreshtokens().remove(refreshtoken);
		refreshtoken.setUser(null);

		return refreshtoken;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<UserAcquittedAlarm> getUserAcquittedAlarms() {
		return this.userAcquittedAlarms;
	}

	public void setUserAcquittedAlarms(List<UserAcquittedAlarm> userAcquittedAlarms) {
		this.userAcquittedAlarms = userAcquittedAlarms;
	}

	public UserAcquittedAlarm addUserAcquittedAlarm(UserAcquittedAlarm userAcquittedAlarm) {
		getUserAcquittedAlarms().add(userAcquittedAlarm);
		userAcquittedAlarm.setUser(this);

		return userAcquittedAlarm;
	}

	public UserAcquittedAlarm removeUserAcquittedAlarm(UserAcquittedAlarm userAcquittedAlarm) {
		getUserAcquittedAlarms().remove(userAcquittedAlarm);
		userAcquittedAlarm.setUser(null);

		return userAcquittedAlarm;
	}

	public List<UserActionHistory> getUserActionHistories() {
		return this.userActionHistories;
	}

	public void setUserActionHistories(List<UserActionHistory> userActionHistories) {
		this.userActionHistories = userActionHistories;
	}

	public UserActionHistory addUserActionHistory(UserActionHistory userActionHistory) {
		getUserActionHistories().add(userActionHistory);
		userActionHistory.setUser(this);

		return userActionHistory;
	}

	public UserActionHistory removeUserActionHistory(UserActionHistory userActionHistory) {
		getUserActionHistories().remove(userActionHistory);
		userActionHistory.setUser(null);

		return userActionHistory;
	}

	public List<UserProfile> getUserProfiles() {
		return this.userProfiles;
	}

	public void setUserProfiles(List<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	public UserProfile addUserProfile(UserProfile userProfile) {
		getUserProfiles().add(userProfile);
		userProfile.setUser(this);

		return userProfile;
	}

	public UserProfile removeUserProfile(UserProfile userProfile) {
		getUserProfiles().remove(userProfile);
		userProfile.setUser(null);

		return userProfile;
	}

}