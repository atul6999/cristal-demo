package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_point_status database table.
 * 
 */
@Entity
@Table(name="service_point_status")
@NamedQuery(name="ServicePointStatus.findAll", query="SELECT s FROM ServicePointStatus s")
public class ServicePointStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to ProfileServicePointStatus
	@OneToMany(mappedBy="servicePointStatus")
	private List<ProfileServicePointStatus> profileServicePointStatuses;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="servicePointStatus")
	private List<ServicePoint> servicePoints;

	public ServicePointStatus() {
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

	public List<ProfileServicePointStatus> getProfileServicePointStatuses() {
		return this.profileServicePointStatuses;
	}

	public void setProfileServicePointStatuses(List<ProfileServicePointStatus> profileServicePointStatuses) {
		this.profileServicePointStatuses = profileServicePointStatuses;
	}

	public ProfileServicePointStatus addProfileServicePointStatus(ProfileServicePointStatus profileServicePointStatus) {
		getProfileServicePointStatuses().add(profileServicePointStatus);
		profileServicePointStatus.setServicePointStatus(this);

		return profileServicePointStatus;
	}

	public ProfileServicePointStatus removeProfileServicePointStatus(ProfileServicePointStatus profileServicePointStatus) {
		getProfileServicePointStatuses().remove(profileServicePointStatus);
		profileServicePointStatus.setServicePointStatus(null);

		return profileServicePointStatus;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setServicePointStatus(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setServicePointStatus(null);

		return servicePoint;
	}

}