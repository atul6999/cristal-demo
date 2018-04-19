package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the menu_synoptic_profile database table.
 * 
 */
@Entity
@Table(name="menu_synoptic_profile")
@NamedQuery(name="MenuSynopticProfile.findAll", query="SELECT m FROM MenuSynopticProfile m")
public class MenuSynopticProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to MenuSynoptic
	@ManyToOne
	@JoinColumn(name="menu_synoptic_id", nullable=false)
	private MenuSynoptic menuSynoptic;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public MenuSynopticProfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MenuSynoptic getMenuSynoptic() {
		return this.menuSynoptic;
	}

	public void setMenuSynoptic(MenuSynoptic menuSynoptic) {
		this.menuSynoptic = menuSynoptic;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}