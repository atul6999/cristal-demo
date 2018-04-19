package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the permission database table.
 * 
 */
@Entity
@Table(name="permission")
@NamedQuery(name="Permission.findAll", query="SELECT p FROM Permission p")
public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String description;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to ProfilePermission
	@OneToMany(mappedBy="permission")
	private List<ProfilePermission> profilePermissions;

	//bi-directional many-to-one association to UserProfilePermission
	@OneToMany(mappedBy="permission")
	private List<UserProfilePermission> userProfilePermissions;

	public Permission() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProfilePermission> getProfilePermissions() {
		return this.profilePermissions;
	}

	public void setProfilePermissions(List<ProfilePermission> profilePermissions) {
		this.profilePermissions = profilePermissions;
	}

	public ProfilePermission addProfilePermission(ProfilePermission profilePermission) {
		getProfilePermissions().add(profilePermission);
		profilePermission.setPermission(this);

		return profilePermission;
	}

	public ProfilePermission removeProfilePermission(ProfilePermission profilePermission) {
		getProfilePermissions().remove(profilePermission);
		profilePermission.setPermission(null);

		return profilePermission;
	}

	public List<UserProfilePermission> getUserProfilePermissions() {
		return this.userProfilePermissions;
	}

	public void setUserProfilePermissions(List<UserProfilePermission> userProfilePermissions) {
		this.userProfilePermissions = userProfilePermissions;
	}

	public UserProfilePermission addUserProfilePermission(UserProfilePermission userProfilePermission) {
		getUserProfilePermissions().add(userProfilePermission);
		userProfilePermission.setPermission(this);

		return userProfilePermission;
	}

	public UserProfilePermission removeUserProfilePermission(UserProfilePermission userProfilePermission) {
		getUserProfilePermissions().remove(userProfilePermission);
		userProfilePermission.setPermission(null);

		return userProfilePermission;
	}

}