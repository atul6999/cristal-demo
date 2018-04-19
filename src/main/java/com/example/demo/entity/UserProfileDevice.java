package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	@Column(length=4000)
	private String parameters;

	//bi-directional many-to-one association to GridFieldUserProfileDevice
	@OneToMany(mappedBy="userProfileDevice")
	private List<GridFieldUserProfileDevice> gridFieldUserProfileDevices;

	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="user_profile_id")
	private UserProfile userProfile;

	//bi-directional many-to-one association to Device
	@ManyToOne
	@JoinColumn(name="device_id")
	private Device device;

	public UserProfileDevice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public List<GridFieldUserProfileDevice> getGridFieldUserProfileDevices() {
		return this.gridFieldUserProfileDevices;
	}

	public void setGridFieldUserProfileDevices(List<GridFieldUserProfileDevice> gridFieldUserProfileDevices) {
		this.gridFieldUserProfileDevices = gridFieldUserProfileDevices;
	}

	public GridFieldUserProfileDevice addGridFieldUserProfileDevice(GridFieldUserProfileDevice gridFieldUserProfileDevice) {
		getGridFieldUserProfileDevices().add(gridFieldUserProfileDevice);
		gridFieldUserProfileDevice.setUserProfileDevice(this);

		return gridFieldUserProfileDevice;
	}

	public GridFieldUserProfileDevice removeGridFieldUserProfileDevice(GridFieldUserProfileDevice gridFieldUserProfileDevice) {
		getGridFieldUserProfileDevices().remove(gridFieldUserProfileDevice);
		gridFieldUserProfileDevice.setUserProfileDevice(null);

		return gridFieldUserProfileDevice;
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}