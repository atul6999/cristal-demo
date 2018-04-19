package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="customer")
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
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

	//bi-directional many-to-one association to ProfileCustomer
	@OneToMany(mappedBy="customer")
	private List<ProfileCustomer> profileCustomers;

	//bi-directional many-to-one association to Service
	@OneToMany(mappedBy="customer")
	private List<Service> services;

	public Customer() {
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

	public List<ProfileCustomer> getProfileCustomers() {
		return this.profileCustomers;
	}

	public void setProfileCustomers(List<ProfileCustomer> profileCustomers) {
		this.profileCustomers = profileCustomers;
	}

	public ProfileCustomer addProfileCustomer(ProfileCustomer profileCustomer) {
		getProfileCustomers().add(profileCustomer);
		profileCustomer.setCustomer(this);

		return profileCustomer;
	}

	public ProfileCustomer removeProfileCustomer(ProfileCustomer profileCustomer) {
		getProfileCustomers().remove(profileCustomer);
		profileCustomer.setCustomer(null);

		return profileCustomer;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public Service addService(Service service) {
		getServices().add(service);
		service.setCustomer(this);

		return service;
	}

	public Service removeService(Service service) {
		getServices().remove(service);
		service.setCustomer(null);

		return service;
	}

}