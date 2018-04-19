package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_point_provider database table.
 * 
 */
@Entity
@Table(name="service_point_provider")
@NamedQuery(name="ServicePointProvider.findAll", query="SELECT s FROM ServicePointProvider s")
public class ServicePointProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to ProfileServicePointProvider
	@OneToMany(mappedBy="servicePointProvider")
	private List<ProfileServicePointProvider> profileServicePointProviders;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="servicePointProvider")
	private List<ServicePoint> servicePoints;

	public ServicePointProvider() {
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

	public List<ProfileServicePointProvider> getProfileServicePointProviders() {
		return this.profileServicePointProviders;
	}

	public void setProfileServicePointProviders(List<ProfileServicePointProvider> profileServicePointProviders) {
		this.profileServicePointProviders = profileServicePointProviders;
	}

	public ProfileServicePointProvider addProfileServicePointProvider(ProfileServicePointProvider profileServicePointProvider) {
		getProfileServicePointProviders().add(profileServicePointProvider);
		profileServicePointProvider.setServicePointProvider(this);

		return profileServicePointProvider;
	}

	public ProfileServicePointProvider removeProfileServicePointProvider(ProfileServicePointProvider profileServicePointProvider) {
		getProfileServicePointProviders().remove(profileServicePointProvider);
		profileServicePointProvider.setServicePointProvider(null);

		return profileServicePointProvider;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setServicePointProvider(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setServicePointProvider(null);

		return servicePoint;
	}

}