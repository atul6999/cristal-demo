package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the resource_service_point database table.
 * 
 */
@Entity
@Table(name="resource_service_point")
@NamedQuery(name="ResourceServicePoint.findAll", query="SELECT r FROM ResourceServicePoint r")
public class ResourceServicePoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update", nullable=false)
	private Date lastUpdate;

	//bi-directional many-to-one association to Resource
	@ManyToOne
	@JoinColumn(name="resource_identifier")
	private Resource resource;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier")
	private ServicePoint servicePoint;

	public ResourceServicePoint() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

}