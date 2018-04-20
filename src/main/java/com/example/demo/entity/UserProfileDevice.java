package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_profile_device database table.
 * 
 */
@Entity
@Table(name="user_profile_device")
@NamedQuery(name="UserProfileDevice.findAll", query="SELECT u FROM UserProfileDevice u")
public class UserProfileDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="device_id")
	private int deviceId;

	@Column(length=4000)
	private String parameters;

	@Column(name="user_profile_id")
	private int userProfileId;

	public UserProfileDevice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public int getUserProfileId() {
		return this.userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

}