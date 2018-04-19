package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_service_point_event_type database table.
 * 
 */
@Entity
@Table(name="profile_service_point_event_type")
@NamedQuery(name="ProfileServicePointEventType.findAll", query="SELECT p FROM ProfileServicePointEventType p")
public class ProfileServicePointEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String label;

	private short visible;

	//bi-directional many-to-one association to EventType
	@ManyToOne
	@JoinColumn(name="event_type_identifier")
	private EventType eventType;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier")
	private ServicePoint servicePoint;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile;

	//bi-directional many-to-one association to SeverityType
	@ManyToOne
	@JoinColumn(name="severity_type_id")
	private SeverityType severityType;

	public ProfileServicePointEventType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public short getVisible() {
		return this.visible;
	}

	public void setVisible(short visible) {
		this.visible = visible;
	}

	public EventType getEventType() {
		return this.eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
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