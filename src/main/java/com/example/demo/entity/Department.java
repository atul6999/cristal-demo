package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@Table(name="department")
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String code;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to Region
	@ManyToOne
	@JoinColumn(name="region_code", nullable=false)
	private Region region;

	//bi-directional many-to-one association to Town
	@OneToMany(mappedBy="department")
	private List<Town> towns;

	public Department() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Town> getTowns() {
		return this.towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

	public Town addTown(Town town) {
		getTowns().add(town);
		town.setDepartment(this);

		return town;
	}

	public Town removeTown(Town town) {
		getTowns().remove(town);
		town.setDepartment(null);

		return town;
	}

}