package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the service database table.
 * 
 */
@Entity
@Table(name="service")
@NamedQuery(name="Service.findAll", query="SELECT s FROM Service s")
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String identifier;

	@Column(nullable=false)
	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="external_name", length=255)
	private String externalName;

	@Column(name="internal_name", length=255)
	private String internalName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modification_date")
	private Date modificationDate;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to ServiceGroup
	@ManyToOne
	@JoinColumn(name="service_group_id")
	private ServiceGroup serviceGroup;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customer_identifier", nullable=false)
	private Customer customer;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="service")
	private List<ServicePoint> servicePoints;

	public Service() {
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

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getExternalName() {
		return this.externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public String getInternalName() {
		return this.internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
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

	public ServiceGroup getServiceGroup() {
		return this.serviceGroup;
	}

	public void setServiceGroup(ServiceGroup serviceGroup) {
		this.serviceGroup = serviceGroup;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setService(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setService(null);

		return servicePoint;
	}

}