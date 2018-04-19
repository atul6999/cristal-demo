package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_profile_permission database table.
 * 
 */
@Entity
@Table(name="user_profile_permission")
@NamedQuery(name="UserProfilePermission.findAll", query="SELECT u FROM UserProfilePermission u")
public class UserProfilePermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="user_profile_id", nullable=false)
	private UserProfile userProfile;

	//bi-directional many-to-one association to Permission
	@ManyToOne
	@JoinColumn(name="permission_id", nullable=false)
	private Permission permission;

	public UserProfilePermission() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

}