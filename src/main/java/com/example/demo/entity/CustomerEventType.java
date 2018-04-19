package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_event_type database table.
 * 
 */
@Entity
@Table(name="customer_event_type")
@NamedQuery(name="CustomerEventType.findAll", query="SELECT c FROM CustomerEventType c")
public class CustomerEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="customer_identifier", length=255)
	private String customerIdentifier;

	@Column(name="display_delay", nullable=false)
	private int displayDelay;

	@Column(name="notification_delay", nullable=false)
	private int notificationDelay;

	//bi-directional many-to-one association to EventType
	@ManyToOne
	@JoinColumn(name="event_type_identifier")
	private EventType eventType;

	public CustomerEventType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerIdentifier() {
		return this.customerIdentifier;
	}

	public void setCustomerIdentifier(String customerIdentifier) {
		this.customerIdentifier = customerIdentifier;
	}

	public int getDisplayDelay() {
		return this.displayDelay;
	}

	public void setDisplayDelay(int displayDelay) {
		this.displayDelay = displayDelay;
	}

	public int getNotificationDelay() {
		return this.notificationDelay;
	}

	public void setNotificationDelay(int notificationDelay) {
		this.notificationDelay = notificationDelay;
	}

	public EventType getEventType() {
		return this.eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

}