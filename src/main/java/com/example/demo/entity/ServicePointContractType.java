package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_point_contract_type database table.
 * 
 */
@Entity
@Table(name="service_point_contract_type")
@NamedQuery(name="ServicePointContractType.findAll", query="SELECT s FROM ServicePointContractType s")
public class ServicePointContractType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to ProfileServicePointContractType
	@OneToMany(mappedBy="servicePointContractType")
	private List<ProfileServicePointContractType> profileServicePointContractTypes;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="servicePointContractType")
	private List<ServicePoint> servicePoints;

	public ServicePointContractType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProfileServicePointContractType> getProfileServicePointContractTypes() {
		return this.profileServicePointContractTypes;
	}

	public void setProfileServicePointContractTypes(List<ProfileServicePointContractType> profileServicePointContractTypes) {
		this.profileServicePointContractTypes = profileServicePointContractTypes;
	}

	public ProfileServicePointContractType addProfileServicePointContractType(ProfileServicePointContractType profileServicePointContractType) {
		getProfileServicePointContractTypes().add(profileServicePointContractType);
		profileServicePointContractType.setServicePointContractType(this);

		return profileServicePointContractType;
	}

	public ProfileServicePointContractType removeProfileServicePointContractType(ProfileServicePointContractType profileServicePointContractType) {
		getProfileServicePointContractTypes().remove(profileServicePointContractType);
		profileServicePointContractType.setServicePointContractType(null);

		return profileServicePointContractType;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setServicePointContractType(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setServicePointContractType(null);

		return servicePoint;
	}

}