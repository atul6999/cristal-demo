package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_service_point_contract_type database table.
 * 
 */
@Entity
@Table(name="profile_service_point_contract_type")
@NamedQuery(name="ProfileServicePointContractType.findAll", query="SELECT p FROM ProfileServicePointContractType p")
public class ProfileServicePointContractType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	//bi-directional many-to-one association to ServicePointContractType
	@ManyToOne
	@JoinColumn(name="service_point_contract_type_id", nullable=false)
	private ServicePointContractType servicePointContractType;

	public ProfileServicePointContractType() {
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

	public ServicePointContractType getServicePointContractType() {
		return this.servicePointContractType;
	}

	public void setServicePointContractType(ServicePointContractType servicePointContractType) {
		this.servicePointContractType = servicePointContractType;
	}

}