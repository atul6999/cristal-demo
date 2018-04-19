package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_service_point_status database table.
 * 
 */
@Entity
@Table(name="profile_service_point_status")
@NamedQuery(name="ProfileServicePointStatus.findAll", query="SELECT p FROM ProfileServicePointStatus p")
public class ProfileServicePointStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	//bi-directional many-to-one association to ServicePointStatus
	@ManyToOne
	@JoinColumn(name="service_point_status_id", nullable=false)
	private ServicePointStatus servicePointStatus;

	public ProfileServicePointStatus() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public ServicePointStatus getServicePointStatus() {
		return this.servicePointStatus;
	}

	public void setServicePointStatus(ServicePointStatus servicePointStatus) {
		this.servicePointStatus = servicePointStatus;
	}

}