package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_service_point database table.
 * 
 */
@Entity
@Table(name="profile_service_point")
@NamedQuery(name="ProfileServicePoint.findAll", query="SELECT p FROM ProfileServicePoint p")
public class ProfileServicePoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//uni-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier", nullable=false)
	private ServicePoint servicePoint;

	//uni-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public ProfileServicePoint() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}