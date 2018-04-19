package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_point_sla database table.
 * 
 */
@Entity
@Table(name="service_point_sla")
@NamedQuery(name="ServicePointSla.findAll", query="SELECT s FROM ServicePointSla s")
public class ServicePointSla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to ProfileServicePointSla
	@OneToMany(mappedBy="servicePointSla")
	private List<ProfileServicePointSla> profileServicePointSlas;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="servicePointSla")
	private List<ServicePoint> servicePoints;

	public ServicePointSla() {
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

	public List<ProfileServicePointSla> getProfileServicePointSlas() {
		return this.profileServicePointSlas;
	}

	public void setProfileServicePointSlas(List<ProfileServicePointSla> profileServicePointSlas) {
		this.profileServicePointSlas = profileServicePointSlas;
	}

	public ProfileServicePointSla addProfileServicePointSla(ProfileServicePointSla profileServicePointSla) {
		getProfileServicePointSlas().add(profileServicePointSla);
		profileServicePointSla.setServicePointSla(this);

		return profileServicePointSla;
	}

	public ProfileServicePointSla removeProfileServicePointSla(ProfileServicePointSla profileServicePointSla) {
		getProfileServicePointSlas().remove(profileServicePointSla);
		profileServicePointSla.setServicePointSla(null);

		return profileServicePointSla;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setServicePointSla(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setServicePointSla(null);

		return servicePoint;
	}

}