package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the geo_site database table.
 * 
 */
@Entity
@Table(name="geo_site")
@NamedQuery(name="GeoSite.findAll", query="SELECT g FROM GeoSite g")
public class GeoSite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=64)
	private String code;

	@Column(nullable=false)
	private byte active;

	@Column(length=255)
	private String address;

	@Column(length=255)
	private String altitude;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="csa_code", length=255)
	private String csaCode;

	@Column(name="csa_name", length=255)
	private String csaName;

	@Column(name="external_name", length=255)
	private String externalName;

	@Column(name="internal_name", nullable=false, length=255)
	private String internalName;

	@Column(nullable=false)
	private double latitude;

	@Column(length=255)
	private String locality;

	@Column(nullable=false)
	private double longitude;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modification_date")
	private Date modificationDate;

	@Column(nullable=false, length=255)
	private String name;

	@Column(name="station_name", length=255)
	private String stationName;

	private byte tdf;

	@Column(name="tdf_division_code", nullable=false, length=255)
	private String tdfDivisionCode;

	@Column(name="town_insee_code", length=64)
	private String townInseeCode;

	@Column(name="town_name", length=255)
	private String townName;

	@Column(name="zip_code", length=255)
	private String zipCode;

	public GeoSite() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAltitude() {
		return this.altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCsaCode() {
		return this.csaCode;
	}

	public void setCsaCode(String csaCode) {
		this.csaCode = csaCode;
	}

	public String getCsaName() {
		return this.csaName;
	}

	public void setCsaName(String csaName) {
		this.csaName = csaName;
	}

	public String getExternalName() {
		return this.externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public String getInternalName() {
		return this.internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getLocality() {
		return this.locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
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

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public byte getTdf() {
		return this.tdf;
	}

	public void setTdf(byte tdf) {
		this.tdf = tdf;
	}

	public String getTdfDivisionCode() {
		return this.tdfDivisionCode;
	}

	public void setTdfDivisionCode(String tdfDivisionCode) {
		this.tdfDivisionCode = tdfDivisionCode;
	}

	public String getTownInseeCode() {
		return this.townInseeCode;
	}

	public void setTownInseeCode(String townInseeCode) {
		this.townInseeCode = townInseeCode;
	}

	public String getTownName() {
		return this.townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}