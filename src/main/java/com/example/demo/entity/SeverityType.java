package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the severity_type database table.
 * 
 */
@Entity
@Table(name="severity_type")
@NamedQuery(name="SeverityType.findAll", query="SELECT s FROM SeverityType s")
public class SeverityType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String color;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(length=255)
	private String level;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modification_date")
	private Date modificationDate;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to EventType
	@OneToMany(mappedBy="severityType")
	private List<EventType> eventTypes;

	//bi-directional many-to-one association to ProfileEventType
	@OneToMany(mappedBy="severityType")
	private List<ProfileEventType> profileEventTypes;

	//bi-directional many-to-one association to ProfileServicePointEventType
	@OneToMany(mappedBy="severityType")
	private List<ProfileServicePointEventType> profileServicePointEventTypes;

	//bi-directional many-to-one association to ProfileSynopticEventType
	@OneToMany(mappedBy="severityType")
	private List<ProfileSynopticEventType> profileSynopticEventTypes;

	public SeverityType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
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

	public List<EventType> getEventTypes() {
		return this.eventTypes;
	}

	public void setEventTypes(List<EventType> eventTypes) {
		this.eventTypes = eventTypes;
	}

	public EventType addEventType(EventType eventType) {
		getEventTypes().add(eventType);
		eventType.setSeverityType(this);

		return eventType;
	}

	public EventType removeEventType(EventType eventType) {
		getEventTypes().remove(eventType);
		eventType.setSeverityType(null);

		return eventType;
	}

	public List<ProfileEventType> getProfileEventTypes() {
		return this.profileEventTypes;
	}

	public void setProfileEventTypes(List<ProfileEventType> profileEventTypes) {
		this.profileEventTypes = profileEventTypes;
	}

	public ProfileEventType addProfileEventType(ProfileEventType profileEventType) {
		getProfileEventTypes().add(profileEventType);
		profileEventType.setSeverityType(this);

		return profileEventType;
	}

	public ProfileEventType removeProfileEventType(ProfileEventType profileEventType) {
		getProfileEventTypes().remove(profileEventType);
		profileEventType.setSeverityType(null);

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
		profileServicePointEventType.setSeverityType(this);

		return profileServicePointEventType;
	}

	public ProfileServicePointEventType removeProfileServicePointEventType(ProfileServicePointEventType profileServicePointEventType) {
		getProfileServicePointEventTypes().remove(profileServicePointEventType);
		profileServicePointEventType.setSeverityType(null);

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
		profileSynopticEventType.setSeverityType(this);

		return profileSynopticEventType;
	}

	public ProfileSynopticEventType removeProfileSynopticEventType(ProfileSynopticEventType profileSynopticEventType) {
		getProfileSynopticEventTypes().remove(profileSynopticEventType);
		profileSynopticEventType.setSeverityType(null);

		return profileSynopticEventType;
	}

}