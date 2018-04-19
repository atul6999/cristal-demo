package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_point_type database table.
 * 
 */
@Entity
@Table(name="service_point_type")
@NamedQuery(name="ServicePointType.findAll", query="SELECT s FROM ServicePointType s")
public class ServicePointType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="emission_mode", length=255)
	private String emissionMode;

	@Column(name="is_fm_or_tnt", length=255)
	private String isFmOrTnt;

	@Column(length=255)
	private String shape;

	@Column(length=255)
	private String value;

	//bi-directional many-to-one association to ProfileServicePointType
	@OneToMany(mappedBy="servicePointType")
	private List<ProfileServicePointType> profileServicePointTypes;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="servicePointType")
	private List<ServicePoint> servicePoints;

	public ServicePointType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmissionMode() {
		return this.emissionMode;
	}

	public void setEmissionMode(String emissionMode) {
		this.emissionMode = emissionMode;
	}

	public String getIsFmOrTnt() {
		return this.isFmOrTnt;
	}

	public void setIsFmOrTnt(String isFmOrTnt) {
		this.isFmOrTnt = isFmOrTnt;
	}

	public String getShape() {
		return this.shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<ProfileServicePointType> getProfileServicePointTypes() {
		return this.profileServicePointTypes;
	}

	public void setProfileServicePointTypes(List<ProfileServicePointType> profileServicePointTypes) {
		this.profileServicePointTypes = profileServicePointTypes;
	}

	public ProfileServicePointType addProfileServicePointType(ProfileServicePointType profileServicePointType) {
		getProfileServicePointTypes().add(profileServicePointType);
		profileServicePointType.setServicePointType(this);

		return profileServicePointType;
	}

	public ProfileServicePointType removeProfileServicePointType(ProfileServicePointType profileServicePointType) {
		getProfileServicePointTypes().remove(profileServicePointType);
		profileServicePointType.setServicePointType(null);

		return profileServicePointType;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setServicePointType(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setServicePointType(null);

		return servicePoint;
	}

}