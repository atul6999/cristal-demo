package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grid_field_profile database table.
 * 
 */
@Entity
@Table(name="grid_field_profile")
@NamedQuery(name="GridFieldProfile.findAll", query="SELECT g FROM GridFieldProfile g")
public class GridFieldProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="column_order")
	private short columnOrder;

	//bi-directional many-to-one association to GridField
	@ManyToOne
	@JoinColumn(name="grid_field_id", nullable=false)
	private GridField gridField;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public GridFieldProfile() {
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

	public GridField getGridField() {
		return this.gridField;
	}

	public void setGridField(GridField gridField) {
		this.gridField = gridField;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}