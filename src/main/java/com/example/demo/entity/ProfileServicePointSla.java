package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_service_point_sla database table.
 * 
 */
@Entity
@Table(name="profile_service_point_sla")
@NamedQuery(name="ProfileServicePointSla.findAll", query="SELECT p FROM ProfileServicePointSla p")
public class ProfileServicePointSla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to ServicePointSla
	@ManyToOne
	@JoinColumn(name="service_point_sla_id")
	private ServicePointSla servicePointSla;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile;

	public ProfileServicePointSla() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServicePointSla getServicePointSla() {
		return this.servicePointSla;
	}

	public void setServicePointSla(ServicePointSla servicePointSla) {
		this.servicePointSla = servicePointSla;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}