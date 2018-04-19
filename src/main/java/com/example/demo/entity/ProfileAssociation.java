package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_association database table.
 * 
 */
@Entity
@Table(name="profile_association")
@NamedQuery(name="ProfileAssociation.findAll", query="SELECT p FROM ProfileAssociation p")
public class ProfileAssociation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile1;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="primary_profile_id")
	private Profile profile2;

	public ProfileAssociation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Profile getProfile1() {
		return this.profile1;
	}

	public void setProfile1(Profile profile1) {
		this.profile1 = profile1;
	}

	public Profile getProfile2() {
		return this.profile2;
	}

	public void setProfile2(Profile profile2) {
		this.profile2 = profile2;
	}

}