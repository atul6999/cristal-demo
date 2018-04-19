package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the f3_region database table.
 * 
 */
@Entity
@Table(name="f3_region")
@NamedQuery(name="F3Region.findAll", query="SELECT f FROM F3Region f")
public class F3Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String description;

	@Column(nullable=false, length=255)
	private String latitude;

	@Column(nullable=false, length=255)
	private String longitude;

	@Column(name="zoom_level", nullable=false)
	private int zoomLevel;

	//bi-directional many-to-one association to F3RegionProfile
	@OneToMany(mappedBy="f3Region")
	private List<F3RegionProfile> f3RegionProfiles;

	//bi-directional many-to-one association to F3RegionServicePoint
	@OneToMany(mappedBy="f3Region")
	private List<F3RegionServicePoint> f3RegionServicePoints;

	public F3Region() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getZoomLevel() {
		return this.zoomLevel;
	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

	public List<F3RegionProfile> getF3RegionProfiles() {
		return this.f3RegionProfiles;
	}

	public void setF3RegionProfiles(List<F3RegionProfile> f3RegionProfiles) {
		this.f3RegionProfiles = f3RegionProfiles;
	}

	public F3RegionProfile addF3RegionProfile(F3RegionProfile f3RegionProfile) {
		getF3RegionProfiles().add(f3RegionProfile);
		f3RegionProfile.setF3Region(this);

		return f3RegionProfile;
	}

	public F3RegionProfile removeF3RegionProfile(F3RegionProfile f3RegionProfile) {
		getF3RegionProfiles().remove(f3RegionProfile);
		f3RegionProfile.setF3Region(null);

		return f3RegionProfile;
	}

	public List<F3RegionServicePoint> getF3RegionServicePoints() {
		return this.f3RegionServicePoints;
	}

	public void setF3RegionServicePoints(List<F3RegionServicePoint> f3RegionServicePoints) {
		this.f3RegionServicePoints = f3RegionServicePoints;
	}

	public F3RegionServicePoint addF3RegionServicePoint(F3RegionServicePoint f3RegionServicePoint) {
		getF3RegionServicePoints().add(f3RegionServicePoint);
		f3RegionServicePoint.setF3Region(this);

		return f3RegionServicePoint;
	}

	public F3RegionServicePoint removeF3RegionServicePoint(F3RegionServicePoint f3RegionServicePoint) {
		getF3RegionServicePoints().remove(f3RegionServicePoint);
		f3RegionServicePoint.setF3Region(null);

		return f3RegionServicePoint;
	}

}