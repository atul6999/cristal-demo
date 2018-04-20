package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grid_field_user_profile_device database table.
 * 
 */
@Entity
@Table(name="grid_field_user_profile_device")
@NamedQuery(name="GridFieldUserProfileDevice.findAll", query="SELECT g FROM GridFieldUserProfileDevice g")
public class GridFieldUserProfileDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="column_order", nullable=false)
	private short columnOrder;

	@Lob
	private String filter;

	//uni-directional many-to-one association to GridField
	@ManyToOne
	@JoinColumn(name="grid_field_id", nullable=false)
	private GridField gridField;

	//uni-directional many-to-one association to UserProfileDevice
	@ManyToOne
	@JoinColumn(name="user_profile_device_id", nullable=false)
	private UserProfileDevice userProfileDevice;

	public GridFieldUserProfileDevice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getColumnOrder() {
		return this.columnOrder;
	}

	public void setColumnOrder(short columnOrder) {
		this.columnOrder = columnOrder;
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public GridField getGridField() {
		return this.gridField;
	}

	public void setGridField(GridField gridField) {
		this.gridField = gridField;
	}

	public UserProfileDevice getUserProfileDevice() {
		return this.userProfileDevice;
	}

	public void setUserProfileDevice(UserProfileDevice userProfileDevice) {
		this.userProfileDevice = userProfileDevice;
	}

}