package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_service_point_provider database table.
 * 
 */
@Entity
@Table(name="profile_service_point_provider")
@NamedQuery(name="ProfileServicePointProvider.findAll", query="SELECT p FROM ProfileServicePointProvider p")
public class ProfileServicePointProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to ServicePointProvider
	@ManyToOne
	@JoinColumn(name="service_point_provider_id", nullable=false)
	private ServicePointProvider servicePointProvider;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public ProfileServicePointProvider() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServicePointProvider getServicePointProvider() {
		return this.servicePointProvider;
	}

	public void setServicePointProvider(ServicePointProvider servicePointProvider) {
		this.servicePointProvider = servicePointProvider;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}