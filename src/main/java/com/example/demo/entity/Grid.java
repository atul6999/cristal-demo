package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grid database table.
 * 
 */
@Entity
@Table(name="grid")
@NamedQuery(name="Grid.findAll", query="SELECT g FROM Grid g")
public class Grid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String label;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to GridField
	@OneToMany(mappedBy="grid")
	private List<GridField> gridFields;

	public Grid() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<GridField> getGridFields() {
		return this.gridFields;
	}

	public void setGridFields(List<GridField> gridFields) {
		this.gridFields = gridFields;
	}

	public GridField addGridField(GridField gridField) {
		getGridFields().add(gridField);
		gridField.setGrid(this);

		return gridField;
	}

	public GridField removeGridField(GridField gridField) {
		getGridFields().remove(gridField);
		gridField.setGrid(null);

		return gridField;
	}

}