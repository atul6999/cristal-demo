package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the f3_region_profile database table.
 * 
 */
@Entity
@Table(name="f3_region_profile")
@NamedQuery(name="F3RegionProfile.findAll", query="SELECT f FROM F3RegionProfile f")
public class F3RegionProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="f3_region_profile_id", unique=true, nullable=false)
	private int f3RegionProfileId;

	//bi-directional many-to-one association to F3Region
	@ManyToOne
	@JoinColumn(name="f3_region_id", nullable=false)
	private F3Region f3Region;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public F3RegionProfile() {
	}

	public int getF3RegionProfileId() {
		return this.f3RegionProfileId;
	}

	public void setF3RegionProfileId(int f3RegionProfileId) {
		this.f3RegionProfileId = f3RegionProfileId;
	}

	public F3Region getF3Region() {
		return this.f3Region;
	}

	public void setF3Region(F3Region f3Region) {
		this.f3Region = f3Region;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}