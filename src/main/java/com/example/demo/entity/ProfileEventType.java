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

	@Column(nullable=false)
	private int delay;

	@Column(name="event_type_identifier", nullable=false, length=255)
	private String eventTypeIdentifier;

	@Column(length=255)
	private String label;

	@Column(name="mail_notification_active")
	private byte mailNotificationActive;

	@Column(name="profile_id", nullable=false)
	private int profileId;

	@Column(name="severity_type_id")
	private int severityTypeId;

	@Column(name="sms_notification_active")
	private byte smsNotificationActive;

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

	public String getEventTypeIdentifier() {
		return this.eventTypeIdentifier;
	}

	public void setEventTypeIdentifier(String eventTypeIdentifier) {
		this.eventTypeIdentifier = eventTypeIdentifier;
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

	public int getProfileId() {
		return this.profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public int getSeverityTypeId() {
		return this.severityTypeId;
	}

	public void setSeverityTypeId(int severityTypeId) {
		this.severityTypeId = severityTypeId;
	}

	public byte getSmsNotificationActive() {
		return this.smsNotificationActive;
	}

	public void setSmsNotificationActive(byte smsNotificationActive) {
		this.smsNotificationActive = smsNotificationActive;
	}

}