package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grid_field database table.
 * 
 */
@Entity
@Table(name="grid_field")
@NamedQuery(name="GridField.findAll", query="SELECT g FROM GridField g")
public class GridField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="api_field", length=255)
	private String apiField;

	@Column(name="api_object", length=255)
	private String apiObject;

	@Column(name="field_type", nullable=false, length=255)
	private String fieldType;

	@Column(nullable=false, length=255)
	private String label;

	@Column(nullable=false, length=255)
	private String name;

	//uni-directional many-to-one association to Grid
	@ManyToOne
	@JoinColumn(name="grid_id", nullable=false)
	private Grid grid;

	public GridField() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiField() {
		return this.apiField;
	}

	public void setApiField(String apiField) {
		this.apiField = apiField;
	}

	public String getApiObject() {
		return this.apiObject;
	}

	public void setApiObject(String apiObject) {
		this.apiObject = apiObject;
	}

	public String getFieldType() {
		return this.fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grid getGrid() {
		return this.grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

}