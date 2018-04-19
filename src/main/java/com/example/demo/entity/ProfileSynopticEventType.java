package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_synoptic_event_type database table.
 * 
 */
@Entity
@Table(name="profile_synoptic_event_type")
@NamedQuery(name="ProfileSynopticEventType.findAll", query="SELECT p FROM ProfileSynopticEventType p")
public class ProfileSynopticEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int delay;

	@Column(length=255)
	private String label;

	//bi-directional many-to-one association to EventType
	@ManyToOne
	@JoinColumn(name="event_type_identifier", nullable=false)
	private EventType eventType;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	//bi-directional many-to-one association to SeverityType
	@ManyToOne
	@JoinColumn(name="severity_type_id")
	private SeverityType severityType;

	public ProfileSynopticEventType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDelay() {
		return this.delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public EventType getEventType() {
		return this.eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public SeverityType getSeverityType() {
		return this.severityType;
	}

	public void setSeverityType(SeverityType severityType) {
		this.severityType = severityType;
	}

}