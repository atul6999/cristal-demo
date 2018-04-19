package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the change_state_old database table.
 * 
 */
@Entity
@Table(name="change_state_old")
@NamedQuery(name="ChangeStateOld.findAll", query="SELECT c FROM ChangeStateOld c")
public class ChangeStateOld implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="current_value", length=255)
	private String currentValue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="detection_date")
	private Date detectionDate;

	@Column(name="event_type_identifier", nullable=false, length=255)
	private String eventTypeIdentifier;

	@Column(name="id_update")
	private BigInteger idUpdate;

	@Column(length=255)
	private String info1;

	@Column(length=255)
	private String info2;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Date lastUpdate;

	private byte masked;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modification_date")
	private Date modificationDate;

	@Column(name="previous_value", length=255)
	private String previousValue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reception_date")
	private Date receptionDate;

	@Column(name="resource_identifier", length=255)
	private String resourceIdentifier;

	@Column(name="service_point_identifier", length=255)
	private String servicePointIdentifier;

	public ChangeStateOld() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	public Date getDetectionDate() {
		return this.detectionDate;
	}

	public void setDetectionDate(Date detectionDate) {
		this.detectionDate = detectionDate;
	}

	public String getEventTypeIdentifier() {
		return this.eventTypeIdentifier;
	}

	public void setEventTypeIdentifier(String eventTypeIdentifier) {
		this.eventTypeIdentifier = eventTypeIdentifier;
	}

	public BigInteger getIdUpdate() {
		return this.idUpdate;
	}

	public void setIdUpdate(BigInteger idUpdate) {
		this.idUpdate = idUpdate;
	}

	public String getInfo1() {
		return this.info1;
	}

	public void setInfo1(String info1) {
		this.info1 = info1;
	}

	public String getInfo2() {
		return this.info2;
	}

	public void setInfo2(String info2) {
		this.info2 = info2;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public byte getMasked() {
		return this.masked;
	}

	public void setMasked(byte masked) {
		this.masked = masked;
	}

	public Date getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getPreviousValue() {
		return this.previousValue;
	}

	public void setPreviousValue(String previousValue) {
		this.previousValue = previousValue;
	}

	public Date getReceptionDate() {
		return this.receptionDate;
	}

	public void setReceptionDate(Date receptionDate) {
		this.receptionDate = receptionDate;
	}

	public String getResourceIdentifier() {
		return this.resourceIdentifier;
	}

	public void setResourceIdentifier(String resourceIdentifier) {
		this.resourceIdentifier = resourceIdentifier;
	}

	public String getServicePointIdentifier() {
		return this.servicePointIdentifier;
	}

	public void setServicePointIdentifier(String servicePointIdentifier) {
		this.servicePointIdentifier = servicePointIdentifier;
	}

}