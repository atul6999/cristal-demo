package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_profile database table.
 * 
 */
@Entity
@Table(name="user_profile")
@NamedQuery(name="UserProfile.findAll", query="SELECT u FROM UserProfile u")
public class UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to JobPlanning
	@OneToMany(mappedBy="userProfile")
	private List<JobPlanning> jobPlannings;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User user;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	//bi-directional many-to-one association to UserProfileDevice
	@OneToMany(mappedBy="userProfile")
	private List<UserProfileDevice> userProfileDevices;

	//bi-directional many-to-one association to UserProfileFilter
	@OneToMany(mappedBy="userProfile")
	private List<UserProfileFilter> userProfileFilters;

	//bi-directional many-to-one association to UserProfilePermission
	@OneToMany(mappedBy="userProfile")
	private List<UserProfilePermission> userProfilePermissions;

	public UserProfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<JobPlanning> getJobPlannings() {
		return this.jobPlannings;
	}

	public void setJobPlannings(List<JobPlanning> jobPlannings) {
		this.jobPlannings = jobPlannings;
	}

	public JobPlanning addJobPlanning(JobPlanning jobPlanning) {
		getJobPlannings().add(jobPlanning);
		jobPlanning.setUserProfile(this);

		return jobPlanning;
	}

	public JobPlanning removeJobPlanning(JobPlanning jobPlanning) {
		getJobPlannings().remove(jobPlanning);
		jobPlanning.setUserProfile(null);

		return jobPlanning;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<UserProfileDevice> getUserProfileDevices() {
		return this.userProfileDevices;
	}

	public void setUserProfileDevices(List<UserProfileDevice> userProfileDevices) {
		this.userProfileDevices = userProfileDevices;
	}

	public UserProfileDevice addUserProfileDevice(UserProfileDevice userProfileDevice) {
		getUserProfileDevices().add(userProfileDevice);
		userProfileDevice.setUserProfile(this);

		return userProfileDevice;
	}

	public UserProfileDevice removeUserProfileDevice(UserProfileDevice userProfileDevice) {
		getUserProfileDevices().remove(userProfileDevice);
		userProfileDevice.setUserProfile(null);

		return userProfileDevice;
	}

	public List<UserProfileFilter> getUserProfileFilters() {
		return this.userProfileFilters;
	}

	public void setUserProfileFilters(List<UserProfileFilter> userProfileFilters) {
		this.userProfileFilters = userProfileFilters;
	}

	public UserProfileFilter addUserProfileFilter(UserProfileFilter userProfileFilter) {
		getUserProfileFilters().add(userProfileFilter);
		userProfileFilter.setUserProfile(this);

		return userProfileFilter;
	}

	public UserProfileFilter removeUserProfileFilter(UserProfileFilter userProfileFilter) {
		getUserProfileFilters().remove(userProfileFilter);
		userProfileFilter.setUserProfile(null);

		return userProfileFilter;
	}

	public List<UserProfilePermission> getUserProfilePermissions() {
		return this.userProfilePermissions;
	}

	public void setUserProfilePermissions(List<UserProfilePermission> userProfilePermissions) {
		this.userProfilePermissions = userProfilePermissions;
	}

	public UserProfilePermission addUserProfilePermission(UserProfilePermission userProfilePermission) {
		getUserProfilePermissions().add(userProfilePermission);
		userProfilePermission.setUserProfile(this);

		return userProfilePermission;
	}

	public UserProfilePermission removeUserProfilePermission(UserProfilePermission userProfilePermission) {
		getUserProfilePermissions().remove(userProfilePermission);
		userProfilePermission.setUserProfile(null);

		return userProfilePermission;
	}

}