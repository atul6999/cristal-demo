package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the application database table.
 * 
 */
@Entity
@Table(name="application")
@NamedQuery(name="Application.findAll", query="SELECT a FROM Application a")
public class Application implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String description;

	@Column(length=255)
	private String logo;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String url;

	//bi-directional many-to-one association to Profile
	@OneToMany(mappedBy="application")
	private List<Profile> profiles;

	//bi-directional many-to-one association to Synchronization
	@OneToMany(mappedBy="application")
	private List<Synchronization> synchronizations;

	public Application() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	public Profile addProfile(Profile profile) {
		getProfiles().add(profile);
		profile.setApplication(this);

		return profile;
	}

	public Profile removeProfile(Profile profile) {
		getProfiles().remove(profile);
		profile.setApplication(null);

		return profile;
	}

	public List<Synchronization> getSynchronizations() {
		return this.synchronizations;
	}

	public void setSynchronizations(List<Synchronization> synchronizations) {
		this.synchronizations = synchronizations;
	}

	public Synchronization addSynchronization(Synchronization synchronization) {
		getSynchronizations().add(synchronization);
		synchronization.setApplication(this);

		return synchronization;
	}

	public Synchronization removeSynchronization(Synchronization synchronization) {
		getSynchronizations().remove(synchronization);
		synchronization.setApplication(null);

		return synchronization;
	}

}