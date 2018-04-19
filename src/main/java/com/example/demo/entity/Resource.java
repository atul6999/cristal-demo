package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the resource database table.
 * 
 */
@Entity
@Table(name="resource")
@NamedQuery(name="Resource.findAll", query="SELECT r FROM Resource r")
public class Resource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String identifier;

	private int active;

	@Column(length=255)
	private String amont;

	@Column(length=255)
	private String aval;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(length=255)
	private String domaineApplicatif;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Date lastUpdate;

	@Column(length=255)
	private String liaison;

	@Column(length=128)
	private String name;

	private int status;

	@Column(name="tech_type")
	private int techType;

	//bi-directional many-to-one association to LinkResource
	@OneToMany(mappedBy="resource")
	private List<LinkResource> linkResources;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier")
	private ServicePoint servicePoint;

	//bi-directional many-to-one association to ResourceServicePoint
	@OneToMany(mappedBy="resource")
	private List<ResourceServicePoint> resourceServicePoints;

	//bi-directional many-to-one association to SynopticComponent
	@OneToMany(mappedBy="resource")
	private List<SynopticComponent> synopticComponents;

	public Resource() {
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getAmont() {
		return this.amont;
	}

	public void setAmont(String amont) {
		this.amont = amont;
	}

	public String getAval() {
		return this.aval;
	}

	public void setAval(String aval) {
		this.aval = aval;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDomaineApplicatif() {
		return this.domaineApplicatif;
	}

	public void setDomaineApplicatif(String domaineApplicatif) {
		this.domaineApplicatif = domaineApplicatif;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getLiaison() {
		return this.liaison;
	}

	public void setLiaison(String liaison) {
		this.liaison = liaison;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTechType() {
		return this.techType;
	}

	public void setTechType(int techType) {
		this.techType = techType;
	}

	public List<LinkResource> getLinkResources() {
		return this.linkResources;
	}

	public void setLinkResources(List<LinkResource> linkResources) {
		this.linkResources = linkResources;
	}

	public LinkResource addLinkResource(LinkResource linkResource) {
		getLinkResources().add(linkResource);
		linkResource.setResource(this);

		return linkResource;
	}

	public LinkResource removeLinkResource(LinkResource linkResource) {
		getLinkResources().remove(linkResource);
		linkResource.setResource(null);

		return linkResource;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	public List<ResourceServicePoint> getResourceServicePoints() {
		return this.resourceServicePoints;
	}

	public void setResourceServicePoints(List<ResourceServicePoint> resourceServicePoints) {
		this.resourceServicePoints = resourceServicePoints;
	}

	public ResourceServicePoint addResourceServicePoint(ResourceServicePoint resourceServicePoint) {
		getResourceServicePoints().add(resourceServicePoint);
		resourceServicePoint.setResource(this);

		return resourceServicePoint;
	}

	public ResourceServicePoint removeResourceServicePoint(ResourceServicePoint resourceServicePoint) {
		getResourceServicePoints().remove(resourceServicePoint);
		resourceServicePoint.setResource(null);

		return resourceServicePoint;
	}

	public List<SynopticComponent> getSynopticComponents() {
		return this.synopticComponents;
	}

	public void setSynopticComponents(List<SynopticComponent> synopticComponents) {
		this.synopticComponents = synopticComponents;
	}

	public SynopticComponent addSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().add(synopticComponent);
		synopticComponent.setResource(this);

		return synopticComponent;
	}

	public SynopticComponent removeSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().remove(synopticComponent);
		synopticComponent.setResource(null);

		return synopticComponent;
	}

}