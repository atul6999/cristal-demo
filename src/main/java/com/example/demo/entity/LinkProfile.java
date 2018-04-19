package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the link_profile database table.
 * 
 */
@Entity
@Table(name="link_profile")
@NamedQuery(name="LinkProfile.findAll", query="SELECT l FROM LinkProfile l")
public class LinkProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Link
	@ManyToOne
	@JoinColumn(name="link_id", nullable=false)
	private Link link;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public LinkProfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Link getLink() {
		return this.link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}