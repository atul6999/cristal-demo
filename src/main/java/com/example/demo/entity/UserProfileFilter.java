package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_profile_filter database table.
 * 
 */
@Entity
@Table(name="user_profile_filter")
@NamedQuery(name="UserProfileFilter.findAll", query="SELECT u FROM UserProfileFilter u")
public class UserProfileFilter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private byte active;

	@Lob
	@Column(name="json_filter")
	private String jsonFilter;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="user_profile_id")
	private UserProfile userProfile;

	public UserProfileFilter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getJsonFilter() {
		return this.jsonFilter;
	}

	public void setJsonFilter(String jsonFilter) {
		this.jsonFilter = jsonFilter;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

}