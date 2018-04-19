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

	//bi-directional many-to-one association to F3RegionProfile
	@OneToMany(mappedBy="profile")
	private List<F3RegionProfile> f3RegionProfiles;

	//bi-directional many-to-one association to GridFieldProfile
	@OneToMany(mappedBy="profile")
	private List<GridFieldProfile> gridFieldProfiles;

	//bi-directional many-to-one association to LinkProfile
	@OneToMany(mappedBy="profile")
	private List<LinkProfile> linkProfiles;

	//bi-directional many-to-one association to MenuSynopticProfile
	@OneToMany(mappedBy="profile")
	private List<MenuSynopticProfile> menuSynopticProfiles;

	//bi-directional many-to-one association to Application
	@ManyToOne
	@JoinColumn(name="application_id", nullable=false)
	private Application application;

	//bi-directional many-to-one association to UserManual
	@ManyToOne
	@JoinColumn(name="user_manual_id")
	private UserManual userManual;

	//bi-directional many-to-one association to ProfileAssociation
	@OneToMany(mappedBy="profile1")
	private List<ProfileAssociation> profileAssociations1;

	//bi-directional many-to-one association to ProfileAssociation
	@OneToMany(mappedBy="profile2")
	private List<ProfileAssociation> profileAssociations2;

	//bi-directional many-to-one association to ProfileCustomer
	@OneToMany(mappedBy="profile")
	private List<ProfileCustomer> profileCustomers;

	//bi-directional many-to-one association to ProfileEventType
	@OneToMany(mappedBy="profile")
	private List<ProfileEventType> profileEventTypes;

	//bi-directional many-to-one association to ProfileHistoryStreaming
	@OneToMany(mappedBy="profile")
	private List<ProfileHistoryStreaming> profileHistoryStreamings;

	//bi-directional many-to-one association to ProfileLiveStreaming
	@OneToMany(mappedBy="profile")
	private List<ProfileLiveStreaming> profileLiveStreamings;

	//bi-directional many-to-one association to ProfilePermission
	@OneToMany(mappedBy="profile")
	private List<ProfilePermission> profilePermissions;

	//bi-directional many-to-one association to ProfileServicePoint
	@OneToMany(mappedBy="profile")
	private List<ProfileServicePoint> profileServicePoints;

	//bi-directional many-to-one association to ProfileServicePointContractType
	@OneToMany(mappedBy="profile")
	private List<ProfileServicePointContractType> profileServicePointContractTypes;

	//bi-directional many-to-one association to ProfileServicePointEventType
	@OneToMany(mappedBy="profile")
	private List<ProfileServicePointEventType> profileServicePointEventTypes;

	//bi-directional many-to-one association to ProfileServicePointProvider
	@OneToMany(mappedBy="profile")
	private List<ProfileServicePointProvider> profileServicePointProviders;

	//bi-directional many-to-one association to ProfileServicePointSla
	@OneToMany(mappedBy="profile")
	private List<ProfileServicePointSla> profileServicePointSlas;

	//bi-directional many-to-one association to ProfileServicePointStatus
	@OneToMany(mappedBy="profile")
	private List<ProfileServicePointStatus> profileServicePointStatuses;

	//bi-directional many-to-one association to ProfileServicePointType
	@OneToMany(mappedBy="profile")
	private List<ProfileServicePointType> profileServicePointTypes;

	//bi-directional many-to-one association to ProfileStreamConfiguration
	@OneToMany(mappedBy="profile")
	private List<ProfileStreamConfiguration> profileStreamConfigurations;

	//bi-directional many-to-one association to ProfileSynopticEventType
	@OneToMany(mappedBy="profile")
	private List<ProfileSynopticEventType> profileSynopticEventTypes;

	//bi-directional many-to-one association to Telemetry
	@OneToMany(mappedBy="profile")
	private List<Telemetry> telemetries;

	//bi-directional many-to-one association to TransportServicePointStreamingProfile
	@OneToMany(mappedBy="profile")
	private List<TransportServicePointStreamingProfile> transportServicePointStreamingProfiles;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="profile")
	private List<User> users;

	//bi-directional many-to-one association to UserProfile
	@OneToMany(mappedBy="profile")
	private List<UserProfile> userProfiles;

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

	public List<F3RegionProfile> getF3RegionProfiles() {
		return this.f3RegionProfiles;
	}

	public void setF3RegionProfiles(List<F3RegionProfile> f3RegionProfiles) {
		this.f3RegionProfiles = f3RegionProfiles;
	}

	public F3RegionProfile addF3RegionProfile(F3RegionProfile f3RegionProfile) {
		getF3RegionProfiles().add(f3RegionProfile);
		f3RegionProfile.setProfile(this);

		return f3RegionProfile;
	}

	public F3RegionProfile removeF3RegionProfile(F3RegionProfile f3RegionProfile) {
		getF3RegionProfiles().remove(f3RegionProfile);
		f3RegionProfile.setProfile(null);

		return f3RegionProfile;
	}

	public List<GridFieldProfile> getGridFieldProfiles() {
		return this.gridFieldProfiles;
	}

	public void setGridFieldProfiles(List<GridFieldProfile> gridFieldProfiles) {
		this.gridFieldProfiles = gridFieldProfiles;
	}

	public GridFieldProfile addGridFieldProfile(GridFieldProfile gridFieldProfile) {
		getGridFieldProfiles().add(gridFieldProfile);
		gridFieldProfile.setProfile(this);

		return gridFieldProfile;
	}

	public GridFieldProfile removeGridFieldProfile(GridFieldProfile gridFieldProfile) {
		getGridFieldProfiles().remove(gridFieldProfile);
		gridFieldProfile.setProfile(null);

		return gridFieldProfile;
	}

	public List<LinkProfile> getLinkProfiles() {
		return this.linkProfiles;
	}

	public void setLinkProfiles(List<LinkProfile> linkProfiles) {
		this.linkProfiles = linkProfiles;
	}

	public LinkProfile addLinkProfile(LinkProfile linkProfile) {
		getLinkProfiles().add(linkProfile);
		linkProfile.setProfile(this);

		return linkProfile;
	}

	public LinkProfile removeLinkProfile(LinkProfile linkProfile) {
		getLinkProfiles().remove(linkProfile);
		linkProfile.setProfile(null);

		return linkProfile;
	}

	public List<MenuSynopticProfile> getMenuSynopticProfiles() {
		return this.menuSynopticProfiles;
	}

	public void setMenuSynopticProfiles(List<MenuSynopticProfile> menuSynopticProfiles) {
		this.menuSynopticProfiles = menuSynopticProfiles;
	}

	public MenuSynopticProfile addMenuSynopticProfile(MenuSynopticProfile menuSynopticProfile) {
		getMenuSynopticProfiles().add(menuSynopticProfile);
		menuSynopticProfile.setProfile(this);

		return menuSynopticProfile;
	}

	public MenuSynopticProfile removeMenuSynopticProfile(MenuSynopticProfile menuSynopticProfile) {
		getMenuSynopticProfiles().remove(menuSynopticProfile);
		menuSynopticProfile.setProfile(null);

		return menuSynopticProfile;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public UserManual getUserManual() {
		return this.userManual;
	}

	public void setUserManual(UserManual userManual) {
		this.userManual = userManual;
	}

	public List<ProfileAssociation> getProfileAssociations1() {
		return this.profileAssociations1;
	}

	public void setProfileAssociations1(List<ProfileAssociation> profileAssociations1) {
		this.profileAssociations1 = profileAssociations1;
	}

	public ProfileAssociation addProfileAssociations1(ProfileAssociation profileAssociations1) {
		getProfileAssociations1().add(profileAssociations1);
		profileAssociations1.setProfile1(this);

		return profileAssociations1;
	}

	public ProfileAssociation removeProfileAssociations1(ProfileAssociation profileAssociations1) {
		getProfileAssociations1().remove(profileAssociations1);
		profileAssociations1.setProfile1(null);

		return profileAssociations1;
	}

	public List<ProfileAssociation> getProfileAssociations2() {
		return this.profileAssociations2;
	}

	public void setProfileAssociations2(List<ProfileAssociation> profileAssociations2) {
		this.profileAssociations2 = profileAssociations2;
	}

	public ProfileAssociation addProfileAssociations2(ProfileAssociation profileAssociations2) {
		getProfileAssociations2().add(profileAssociations2);
		profileAssociations2.setProfile2(this);

		return profileAssociations2;
	}

	public ProfileAssociation removeProfileAssociations2(ProfileAssociation profileAssociations2) {
		getProfileAssociations2().remove(profileAssociations2);
		profileAssociations2.setProfile2(null);

		return profileAssociations2;
	}

	public List<ProfileCustomer> getProfileCustomers() {
		return this.profileCustomers;
	}

	public void setProfileCustomers(List<ProfileCustomer> profileCustomers) {
		this.profileCustomers = profileCustomers;
	}

	public ProfileCustomer addProfileCustomer(ProfileCustomer profileCustomer) {
		getProfileCustomers().add(profileCustomer);
		profileCustomer.setProfile(this);

		return profileCustomer;
	}

	public ProfileCustomer removeProfileCustomer(ProfileCustomer profileCustomer) {
		getProfileCustomers().remove(profileCustomer);
		profileCustomer.setProfile(null);

		return profileCustomer;
	}

	public List<ProfileEventType> getProfileEventTypes() {
		return this.profileEventTypes;
	}

	public void setProfileEventTypes(List<ProfileEventType> profileEventTypes) {
		this.profileEventTypes = profileEventTypes;
	}

	public ProfileEventType addProfileEventType(ProfileEventType profileEventType) {
		getProfileEventTypes().add(profileEventType);
		profileEventType.setProfile(this);

		return profileEventType;
	}

	public ProfileEventType removeProfileEventType(ProfileEventType profileEventType) {
		getProfileEventTypes().remove(profileEventType);
		profileEventType.setProfile(null);

		return profileEventType;
	}

	public List<ProfileHistoryStreaming> getProfileHistoryStreamings() {
		return this.profileHistoryStreamings;
	}

	public void setProfileHistoryStreamings(List<ProfileHistoryStreaming> profileHistoryStreamings) {
		this.profileHistoryStreamings = profileHistoryStreamings;
	}

	public ProfileHistoryStreaming addProfileHistoryStreaming(ProfileHistoryStreaming profileHistoryStreaming) {
		getProfileHistoryStreamings().add(profileHistoryStreaming);
		profileHistoryStreaming.setProfile(this);

		return profileHistoryStreaming;
	}

	public ProfileHistoryStreaming removeProfileHistoryStreaming(ProfileHistoryStreaming profileHistoryStreaming) {
		getProfileHistoryStreamings().remove(profileHistoryStreaming);
		profileHistoryStreaming.setProfile(null);

		return profileHistoryStreaming;
	}

	public List<ProfileLiveStreaming> getProfileLiveStreamings() {
		return this.profileLiveStreamings;
	}

	public void setProfileLiveStreamings(List<ProfileLiveStreaming> profileLiveStreamings) {
		this.profileLiveStreamings = profileLiveStreamings;
	}

	public ProfileLiveStreaming addProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().add(profileLiveStreaming);
		profileLiveStreaming.setProfile(this);

		return profileLiveStreaming;
	}

	public ProfileLiveStreaming removeProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().remove(profileLiveStreaming);
		profileLiveStreaming.setProfile(null);

		return profileLiveStreaming;
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

	public List<ProfileServicePoint> getProfileServicePoints() {
		return this.profileServicePoints;
	}

	public void setProfileServicePoints(List<ProfileServicePoint> profileServicePoints) {
		this.profileServicePoints = profileServicePoints;
	}

	public ProfileServicePoint addProfileServicePoint(ProfileServicePoint profileServicePoint) {
		getProfileServicePoints().add(profileServicePoint);
		profileServicePoint.setProfile(this);

		return profileServicePoint;
	}

	public ProfileServicePoint removeProfileServicePoint(ProfileServicePoint profileServicePoint) {
		getProfileServicePoints().remove(profileServicePoint);
		profileServicePoint.setProfile(null);

		return profileServicePoint;
	}

	public List<ProfileServicePointContractType> getProfileServicePointContractTypes() {
		return this.profileServicePointContractTypes;
	}

	public void setProfileServicePointContractTypes(List<ProfileServicePointContractType> profileServicePointContractTypes) {
		this.profileServicePointContractTypes = profileServicePointContractTypes;
	}

	public ProfileServicePointContractType addProfileServicePointContractType(ProfileServicePointContractType profileServicePointContractType) {
		getProfileServicePointContractTypes().add(profileServicePointContractType);
		profileServicePointContractType.setProfile(this);

		return profileServicePointContractType;
	}

	public ProfileServicePointContractType removeProfileServicePointContractType(ProfileServicePointContractType profileServicePointContractType) {
		getProfileServicePointContractTypes().remove(profileServicePointContractType);
		profileServicePointContractType.setProfile(null);

		return profileServicePointContractType;
	}

	public List<ProfileServicePointEventType> getProfileServicePointEventTypes() {
		return this.profileServicePointEventTypes;
	}

	public void setProfileServicePointEventTypes(List<ProfileServicePointEventType> profileServicePointEventTypes) {
		this.profileServicePointEventTypes = profileServicePointEventTypes;
	}

	public ProfileServicePointEventType addProfileServicePointEventType(ProfileServicePointEventType profileServicePointEventType) {
		getProfileServicePointEventTypes().add(profileServicePointEventType);
		profileServicePointEventType.setProfile(this);

		return profileServicePointEventType;
	}

	public ProfileServicePointEventType removeProfileServicePointEventType(ProfileServicePointEventType profileServicePointEventType) {
		getProfileServicePointEventTypes().remove(profileServicePointEventType);
		profileServicePointEventType.setProfile(null);

		return profileServicePointEventType;
	}

	public List<ProfileServicePointProvider> getProfileServicePointProviders() {
		return this.profileServicePointProviders;
	}

	public void setProfileServicePointProviders(List<ProfileServicePointProvider> profileServicePointProviders) {
		this.profileServicePointProviders = profileServicePointProviders;
	}

	public ProfileServicePointProvider addProfileServicePointProvider(ProfileServicePointProvider profileServicePointProvider) {
		getProfileServicePointProviders().add(profileServicePointProvider);
		profileServicePointProvider.setProfile(this);

		return profileServicePointProvider;
	}

	public ProfileServicePointProvider removeProfileServicePointProvider(ProfileServicePointProvider profileServicePointProvider) {
		getProfileServicePointProviders().remove(profileServicePointProvider);
		profileServicePointProvider.setProfile(null);

		return profileServicePointProvider;
	}

	public List<ProfileServicePointSla> getProfileServicePointSlas() {
		return this.profileServicePointSlas;
	}

	public void setProfileServicePointSlas(List<ProfileServicePointSla> profileServicePointSlas) {
		this.profileServicePointSlas = profileServicePointSlas;
	}

	public ProfileServicePointSla addProfileServicePointSla(ProfileServicePointSla profileServicePointSla) {
		getProfileServicePointSlas().add(profileServicePointSla);
		profileServicePointSla.setProfile(this);

		return profileServicePointSla;
	}

	public ProfileServicePointSla removeProfileServicePointSla(ProfileServicePointSla profileServicePointSla) {
		getProfileServicePointSlas().remove(profileServicePointSla);
		profileServicePointSla.setProfile(null);

		return profileServicePointSla;
	}

	public List<ProfileServicePointStatus> getProfileServicePointStatuses() {
		return this.profileServicePointStatuses;
	}

	public void setProfileServicePointStatuses(List<ProfileServicePointStatus> profileServicePointStatuses) {
		this.profileServicePointStatuses = profileServicePointStatuses;
	}

	public ProfileServicePointStatus addProfileServicePointStatus(ProfileServicePointStatus profileServicePointStatus) {
		getProfileServicePointStatuses().add(profileServicePointStatus);
		profileServicePointStatus.setProfile(this);

		return profileServicePointStatus;
	}

	public ProfileServicePointStatus removeProfileServicePointStatus(ProfileServicePointStatus profileServicePointStatus) {
		getProfileServicePointStatuses().remove(profileServicePointStatus);
		profileServicePointStatus.setProfile(null);

		return profileServicePointStatus;
	}

	public List<ProfileServicePointType> getProfileServicePointTypes() {
		return this.profileServicePointTypes;
	}

	public void setProfileServicePointTypes(List<ProfileServicePointType> profileServicePointTypes) {
		this.profileServicePointTypes = profileServicePointTypes;
	}

	public ProfileServicePointType addProfileServicePointType(ProfileServicePointType profileServicePointType) {
		getProfileServicePointTypes().add(profileServicePointType);
		profileServicePointType.setProfile(this);

		return profileServicePointType;
	}

	public ProfileServicePointType removeProfileServicePointType(ProfileServicePointType profileServicePointType) {
		getProfileServicePointTypes().remove(profileServicePointType);
		profileServicePointType.setProfile(null);

		return profileServicePointType;
	}

	public List<ProfileStreamConfiguration> getProfileStreamConfigurations() {
		return this.profileStreamConfigurations;
	}

	public void setProfileStreamConfigurations(List<ProfileStreamConfiguration> profileStreamConfigurations) {
		this.profileStreamConfigurations = profileStreamConfigurations;
	}

	public ProfileStreamConfiguration addProfileStreamConfiguration(ProfileStreamConfiguration profileStreamConfiguration) {
		getProfileStreamConfigurations().add(profileStreamConfiguration);
		profileStreamConfiguration.setProfile(this);

		return profileStreamConfiguration;
	}

	public ProfileStreamConfiguration removeProfileStreamConfiguration(ProfileStreamConfiguration profileStreamConfiguration) {
		getProfileStreamConfigurations().remove(profileStreamConfiguration);
		profileStreamConfiguration.setProfile(null);

		return profileStreamConfiguration;
	}

	public List<ProfileSynopticEventType> getProfileSynopticEventTypes() {
		return this.profileSynopticEventTypes;
	}

	public void setProfileSynopticEventTypes(List<ProfileSynopticEventType> profileSynopticEventTypes) {
		this.profileSynopticEventTypes = profileSynopticEventTypes;
	}

	public ProfileSynopticEventType addProfileSynopticEventType(ProfileSynopticEventType profileSynopticEventType) {
		getProfileSynopticEventTypes().add(profileSynopticEventType);
		profileSynopticEventType.setProfile(this);

		return profileSynopticEventType;
	}

	public ProfileSynopticEventType removeProfileSynopticEventType(ProfileSynopticEventType profileSynopticEventType) {
		getProfileSynopticEventTypes().remove(profileSynopticEventType);
		profileSynopticEventType.setProfile(null);

		return profileSynopticEventType;
	}

	public List<Telemetry> getTelemetries() {
		return this.telemetries;
	}

	public void setTelemetries(List<Telemetry> telemetries) {
		this.telemetries = telemetries;
	}

	public Telemetry addTelemetry(Telemetry telemetry) {
		getTelemetries().add(telemetry);
		telemetry.setProfile(this);

		return telemetry;
	}

	public Telemetry removeTelemetry(Telemetry telemetry) {
		getTelemetries().remove(telemetry);
		telemetry.setProfile(null);

		return telemetry;
	}

	public List<TransportServicePointStreamingProfile> getTransportServicePointStreamingProfiles() {
		return this.transportServicePointStreamingProfiles;
	}

	public void setTransportServicePointStreamingProfiles(List<TransportServicePointStreamingProfile> transportServicePointStreamingProfiles) {
		this.transportServicePointStreamingProfiles = transportServicePointStreamingProfiles;
	}

	public TransportServicePointStreamingProfile addTransportServicePointStreamingProfile(TransportServicePointStreamingProfile transportServicePointStreamingProfile) {
		getTransportServicePointStreamingProfiles().add(transportServicePointStreamingProfile);
		transportServicePointStreamingProfile.setProfile(this);

		return transportServicePointStreamingProfile;
	}

	public TransportServicePointStreamingProfile removeTransportServicePointStreamingProfile(TransportServicePointStreamingProfile transportServicePointStreamingProfile) {
		getTransportServicePointStreamingProfiles().remove(transportServicePointStreamingProfile);
		transportServicePointStreamingProfile.setProfile(null);

		return transportServicePointStreamingProfile;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setProfile(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setProfile(null);

		return user;
	}

	public List<UserProfile> getUserProfiles() {
		return this.userProfiles;
	}

	public void setUserProfiles(List<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	public UserProfile addUserProfile(UserProfile userProfile) {
		getUserProfiles().add(userProfile);
		userProfile.setProfile(this);

		return userProfile;
	}

	public UserProfile removeUserProfile(UserProfile userProfile) {
		getUserProfiles().remove(userProfile);
		userProfile.setProfile(null);

		return userProfile;
	}

}