package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the town database table.
 * 
 */
@Entity
@Table(name="town")
@NamedQuery(name="Town.findAll", query="SELECT t FROM Town t")
public class Town implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="insee_code", unique=true, nullable=false, length=64)
	private String inseeCode;

	private double latitude;

	private double longitude;

	@Column(nullable=false, length=255)
	private String name;

	private int population;

	private int surface;

	@Column(name="zip_code", length=5)
	private String zipCode;

	//bi-directional many-to-one association to GeoSite
	@OneToMany(mappedBy="town")
	private List<GeoSite> geoSites;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="department_code", nullable=false)
	private Department department;

	public Town() {
	}

	public String getInseeCode() {
		return this.inseeCode;
	}

	public void setInseeCode(String inseeCode) {
		this.inseeCode = inseeCode;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getSurface() {
		return this.surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<GeoSite> getGeoSites() {
		return this.geoSites;
	}

	public void setGeoSites(List<GeoSite> geoSites) {
		this.geoSites = geoSites;
	}

	public GeoSite addGeoSite(GeoSite geoSite) {
		getGeoSites().add(geoSite);
		geoSite.setTown(this);

		return geoSite;
	}

	public GeoSite removeGeoSite(GeoSite geoSite) {
		getGeoSites().remove(geoSite);
		geoSite.setTown(null);

		return geoSite;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}