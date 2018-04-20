package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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

	@Column(name="display_info_to_client", nullable=false)
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

	//uni-directional many-to-one association to SeverityType
	@ManyToOne
	@JoinColumn(name="severity_type_id", nullable=false)
	private SeverityType severityType1;

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

	public SeverityType getSeverityType1() {
		return this.severityType1;
	}

	public void setSeverityType1(SeverityType severityType1) {
		this.severityType1 = severityType1;
	}

}