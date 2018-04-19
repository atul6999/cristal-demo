package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the event_type database table.
 * 
 */
@Entity
@Table(name="event_type")
@NamedQuery(name="EventType.findAll", query="SELECT e FROM EventType e")
public class EventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String identifier;

	@Column(nullable=false)
	private byte active;

	private int animation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(nullable=false)
	private int displayInfoToClient;

	@Column(name="external_desc", length=255)
	private String externalDesc;

	@Column(name="external_name", length=255)
	private String externalName;

	@Column(name="internal_desc", length=255)
	private String internalDesc;

	@Column(name="internal_name", length=255)
	private String internalName;

	@Column(name="is_filtered", nullable=false)
	private int isFiltered;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modification_date")
	private Date modificationDate;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to CustomerEventType
	@OneToMany(mappedBy="eventType")
	private List<CustomerEventType> customerEventTypes;

	//bi-directional many-to-one association to SeverityType
	@ManyToOne
	@JoinColumn(name="severity_type_id", nullable=false)
	private SeverityType severityType;

	//bi-directional many-to-one association to LinkEventType
	@OneToMany(mappedBy="eventType")
	private List<LinkEventType> linkEventTypes;

	//bi-directional many-to-one association to NetworkLinkServicePointEventType
	@OneToMany(mappedBy="eventType")
	private List<NetworkLinkServicePointEventType> networkLinkServicePointEventTypes;

	//bi-directional many-to-one association to ProfileEventType
	@OneToMany(mappedBy="eventType")
	private List<ProfileEventType> profileEventTypes;

	//bi-directional many-to-one association to ProfileServicePointEventType
	@OneToMany(mappedBy="eventType")
	private List<ProfileServicePointEventType> profileServicePointEventTypes;

	//bi-directional many-to-one association to ProfileSynopticEventType
	@OneToMany(mappedBy="eventType")
	private List<ProfileSynopticEventType> profileSynopticEventTypes;

	//bi-directional many-to-one association to SynopticDictionary
	@OneToMany(mappedBy="eventType")
	private List<SynopticDictionary> synopticDictionaries;

	public EventType() {
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getAnimation() {
		return this.animation;
	}

	public void setAnimation(int animation) {
		this.animation = animation;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getDisplayInfoToClient() {
		return this.displayInfoToClient;
	}

	public void setDisplayInfoToClient(int displayInfoToClient) {
		this.displayInfoToClient = displayInfoToClient;
	}

	public String getExternalDesc() {
		return this.externalDesc;
	}

	public void setExternalDesc(String externalDesc) {
		this.externalDesc = externalDesc;
	}

	public String getExternalName() {
		return this.externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public String getInternalDesc() {
		return this.internalDesc;
	}

	public void setInternalDesc(String internalDesc) {
		this.internalDesc = internalDesc;
	}

	public String getInternalName() {
		return this.internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public int getIsFiltered() {
		return this.isFiltered;
	}

	public void setIsFiltered(int isFiltered) {
		this.isFiltered = isFiltered;
	}

	public Date getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CustomerEventType> getCustomerEventTypes() {
		return this.customerEventTypes;
	}

	public void setCustomerEventTypes(List<CustomerEventType> customerEventTypes) {
		this.customerEventTypes = customerEventTypes;
	}

	public CustomerEventType addCustomerEventType(CustomerEventType customerEventType) {
		getCustomerEventTypes().add(customerEventType);
		customerEventType.setEventType(this);

		return customerEventType;
	}

	public CustomerEventType removeCustomerEventType(CustomerEventType customerEventType) {
		getCustomerEventTypes().remove(customerEventType);
		customerEventType.setEventType(null);

		return customerEventType;
	}

	public SeverityType getSeverityType() {
		return this.severityType;
	}

	public void setSeverityType(SeverityType severityType) {
		this.severityType = severityType;
	}

	public List<LinkEventType> getLinkEventTypes() {
		return this.linkEventTypes;
	}

	public void setLinkEventTypes(List<LinkEventType> linkEventTypes) {
		this.linkEventTypes = linkEventTypes;
	}

	public LinkEventType addLinkEventType(LinkEventType linkEventType) {
		getLinkEventTypes().add(linkEventType);
		linkEventType.setEventType(this);

		return linkEventType;
	}

	public LinkEventType removeLinkEventType(LinkEventType linkEventType) {
		getLinkEventTypes().remove(linkEventType);
		linkEventType.setEventType(null);

		return linkEventType;
	}

	public List<NetworkLinkServicePointEventType> getNetworkLinkServicePointEventTypes() {
		return this.networkLinkServicePointEventTypes;
	}

	public void setNetworkLinkServicePointEventTypes(List<NetworkLinkServicePointEventType> networkLinkServicePointEventTypes) {
		this.networkLinkServicePointEventTypes = networkLinkServicePointEventTypes;
	}

	public NetworkLinkServicePointEventType addNetworkLinkServicePointEventType(NetworkLinkServicePointEventType networkLinkServicePointEventType) {
		getNetworkLinkServicePointEventTypes().add(networkLinkServicePointEventType);
		networkLinkServicePointEventType.setEventType(this);

		return networkLinkServicePointEventType;
	}

	public NetworkLinkServicePointEventType removeNetworkLinkServicePointEventType(NetworkLinkServicePointEventType networkLinkServicePointEventType) {
		getNetworkLinkServicePointEventTypes().remove(networkLinkServicePointEventType);
		networkLinkServicePointEventType.setEventType(null);

		return networkLinkServicePointEventType;
	}

	public List<ProfileEventType> getProfileEventTypes() {
		return this.profileEventTypes;
	}

	public void setProfileEventTypes(List<ProfileEventType> profileEventTypes) {
		this.profileEventTypes = profileEventTypes;
	}

	public ProfileEventType addProfileEventType(ProfileEventType profileEventType) {
		getProfileEventTypes().add(profileEventType);
		profileEventType.setEventType(this);

		return profileEventType;
	}

	public ProfileEventType removeProfileEventType(ProfileEventType profileEventType) {
		getProfileEventTypes().remove(profileEventType);
		profileEventType.setEventType(null);

		return profileEventType;
	}

	public List<ProfileServicePointEventType> getProfileServicePointEventTypes() {
		return this.profileServicePointEventTypes;
	}

	public void setProfileServicePointEventTypes(List<ProfileServicePointEventType> profileServicePointEventTypes) {
		this.profileServicePointEventTypes = profileServicePointEventTypes;
	}

	public ProfileServicePointEventType addProfileServicePointEventType(ProfileServicePointEventType profileServicePointEventType) {
		getProfileServicePointEventTypes().add(profileServicePointEventType);
		profileServicePointEventType.setEventType(this);

		return profileServicePointEventType;
	}

	public ProfileServicePointEventType removeProfileServicePointEventType(ProfileServicePointEventType profileServicePointEventType) {
		getProfileServicePointEventTypes().remove(profileServicePointEventType);
		profileServicePointEventType.setEventType(null);

		return profileServicePointEventType;
	}

	public List<ProfileSynopticEventType> getProfileSynopticEventTypes() {
		return this.profileSynopticEventTypes;
	}

	public void setProfileSynopticEventTypes(List<ProfileSynopticEventType> profileSynopticEventTypes) {
		this.profileSynopticEventTypes = profileSynopticEventTypes;
	}

	public ProfileSynopticEventType addProfileSynopticEventType(ProfileSynopticEventType profileSynopticEventType) {
		getProfileSynopticEventTypes().add(profileSynopticEventType);
		profileSynopticEventType.setEventType(this);

		return profileSynopticEventType;
	}

	public ProfileSynopticEventType removeProfileSynopticEventType(ProfileSynopticEventType profileSynopticEventType) {
		getProfileSynopticEventTypes().remove(profileSynopticEventType);
		profileSynopticEventType.setEventType(null);

		return profileSynopticEventType;
	}

	public List<SynopticDictionary> getSynopticDictionaries() {
		return this.synopticDictionaries;
	}

	public void setSynopticDictionaries(List<SynopticDictionary> synopticDictionaries) {
		this.synopticDictionaries = synopticDictionaries;
	}

	public SynopticDictionary addSynopticDictionary(SynopticDictionary synopticDictionary) {
		getSynopticDictionaries().add(synopticDictionary);
		synopticDictionary.setEventType(this);

		return synopticDictionary;
	}

	public SynopticDictionary removeSynopticDictionary(SynopticDictionary synopticDictionary) {
		getSynopticDictionaries().remove(synopticDictionary);
		synopticDictionary.setEventType(null);

		return synopticDictionary;
	}

}