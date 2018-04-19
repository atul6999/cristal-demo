package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_event_type database table.
 * 
 */
@Entity
@Table(name="profile_event_type")
@NamedQuery(name="ProfileEventType.findAll", query="SELECT p FROM ProfileEventType p")
public class ProfileEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="animate_links", nullable=false)
	private int animateLinks;

	private int delay;

	@Column(length=255)
	private String label;

	@Column(name="mail_notification_active")
	private byte mailNotificationActive;

	@Column(name="sms_notification_active")
	private byte smsNotificationActive;

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

	public ProfileEventType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnimateLinks() {
		return this.animateLinks;
	}

	public void setAnimateLinks(int animateLinks) {
		this.animateLinks = animateLinks;
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

	public byte getMailNotificationActive() {
		return this.mailNotificationActive;
	}

	public void setMailNotificationActive(byte mailNotificationActive) {
		this.mailNotificationActive = mailNotificationActive;
	}

	public byte getSmsNotificationActive() {
		return this.smsNotificationActive;
	}

	public void setSmsNotificationActive(byte smsNotificationActive) {
		this.smsNotificationActive = smsNotificationActive;
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