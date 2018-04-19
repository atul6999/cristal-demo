package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tdf_division database table.
 * 
 */
@Entity
@Table(name="tdf_division")
@NamedQuery(name="TdfDivision.findAll", query="SELECT t FROM TdfDivision t")
public class TdfDivision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(nullable=false, length=255)
	private String latitude;

	@Column(nullable=false, length=255)
	private String longitude;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modification_date")
	private Date modificationDate;

	@Column(length=255)
	private String name;

	@Column(name="time_zone", nullable=false, length=255)
	private String timeZone;

	@Column(name="zoom_level", nullable=false)
	private int zoomLevel;

	//bi-directional many-to-one association to GeoSite
	@OneToMany(mappedBy="tdfDivision")
	private List<GeoSite> geoSites;

	//bi-directional many-to-one association to TdfDivisionLocation
	@OneToMany(mappedBy="tdfDivision")
	private List<TdfDivisionLocation> tdfDivisionLocations;

	public TdfDivision() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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

	public Date getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public int getZoomLevel() {
		return this.zoomLevel;
	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

	public List<GeoSite> getGeoSites() {
		return this.geoSites;
	}

	public void setGeoSites(List<GeoSite> geoSites) {
		this.geoSites = geoSites;
	}

	public GeoSite addGeoSite(GeoSite geoSite) {
		getGeoSites().add(geoSite);
		geoSite.setTdfDivision(this);

		return geoSite;
	}

	public GeoSite removeGeoSite(GeoSite geoSite) {
		getGeoSites().remove(geoSite);
		geoSite.setTdfDivision(null);

		return geoSite;
	}

	public List<TdfDivisionLocation> getTdfDivisionLocations() {
		return this.tdfDivisionLocations;
	}

	public void setTdfDivisionLocations(List<TdfDivisionLocation> tdfDivisionLocations) {
		this.tdfDivisionLocations = tdfDivisionLocations;
	}

	public TdfDivisionLocation addTdfDivisionLocation(TdfDivisionLocation tdfDivisionLocation) {
		getTdfDivisionLocations().add(tdfDivisionLocation);
		tdfDivisionLocation.setTdfDivision(this);

		return tdfDivisionLocation;
	}

	public TdfDivisionLocation removeTdfDivisionLocation(TdfDivisionLocation tdfDivisionLocation) {
		getTdfDivisionLocations().remove(tdfDivisionLocation);
		tdfDivisionLocation.setTdfDivision(null);

		return tdfDivisionLocation;
	}

}