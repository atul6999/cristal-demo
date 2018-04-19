package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the device database table.
 * 
 */
@Entity
@Table(name="device")
@NamedQuery(name="Device.findAll", query="SELECT d FROM Device d")
public class Device implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to UserProfileDevice
	@OneToMany(mappedBy="device")
	private List<UserProfileDevice> userProfileDevices;

	public Device() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserProfileDevice> getUserProfileDevices() {
		return this.userProfileDevices;
	}

	public void setUserProfileDevices(List<UserProfileDevice> userProfileDevices) {
		this.userProfileDevices = userProfileDevices;
	}

	public UserProfileDevice addUserProfileDevice(UserProfileDevice userProfileDevice) {
		getUserProfileDevices().add(userProfileDevice);
		userProfileDevice.setDevice(this);

		return userProfileDevice;
	}

	public UserProfileDevice removeUserProfileDevice(UserProfileDevice userProfileDevice) {
		getUserProfileDevices().remove(userProfileDevice);
		userProfileDevice.setDevice(null);

		return userProfileDevice;
	}

}