package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


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

	@Column(name="town_name", length=255)
	private String townName;

	@Column(name="zip_code", length=255)
	private String zipCode;

	//bi-directional many-to-one association to TdfDivisionLocation
	@ManyToOne
	@JoinColumn(name="tdf_division_location_code")
	private TdfDivisionLocation tdfDivisionLocation;

	//bi-directional many-to-one association to Town
	@ManyToOne
	@JoinColumn(name="town_insee_code")
	private Town town;

	//bi-directional many-to-one association to TdfDivision
	@ManyToOne
	@JoinColumn(name="tdf_division_code", nullable=false)
	private TdfDivision tdfDivision;

	//bi-directional many-to-one association to NetworkLink
	@OneToMany(mappedBy="geoSite1")
	private List<NetworkLink> networkLinks1;

	//bi-directional many-to-one association to NetworkLink
	@OneToMany(mappedBy="geoSite2")
	private List<NetworkLink> networkLinks2;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="geoSite")
	private List<ServicePoint> servicePoints;

	//bi-directional many-to-one association to TransportServicePoint
	@OneToMany(mappedBy="geoSite")
	private List<TransportServicePoint> transportServicePoints;

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

	public TdfDivisionLocation getTdfDivisionLocation() {
		return this.tdfDivisionLocation;
	}

	public void setTdfDivisionLocation(TdfDivisionLocation tdfDivisionLocation) {
		this.tdfDivisionLocation = tdfDivisionLocation;
	}

	public Town getTown() {
		return this.town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public TdfDivision getTdfDivision() {
		return this.tdfDivision;
	}

	public void setTdfDivision(TdfDivision tdfDivision) {
		this.tdfDivision = tdfDivision;
	}

	public List<NetworkLink> getNetworkLinks1() {
		return this.networkLinks1;
	}

	public void setNetworkLinks1(List<NetworkLink> networkLinks1) {
		this.networkLinks1 = networkLinks1;
	}

	public NetworkLink addNetworkLinks1(NetworkLink networkLinks1) {
		getNetworkLinks1().add(networkLinks1);
		networkLinks1.setGeoSite1(this);

		return networkLinks1;
	}

	public NetworkLink removeNetworkLinks1(NetworkLink networkLinks1) {
		getNetworkLinks1().remove(networkLinks1);
		networkLinks1.setGeoSite1(null);

		return networkLinks1;
	}

	public List<NetworkLink> getNetworkLinks2() {
		return this.networkLinks2;
	}

	public void setNetworkLinks2(List<NetworkLink> networkLinks2) {
		this.networkLinks2 = networkLinks2;
	}

	public NetworkLink addNetworkLinks2(NetworkLink networkLinks2) {
		getNetworkLinks2().add(networkLinks2);
		networkLinks2.setGeoSite2(this);

		return networkLinks2;
	}

	public NetworkLink removeNetworkLinks2(NetworkLink networkLinks2) {
		getNetworkLinks2().remove(networkLinks2);
		networkLinks2.setGeoSite2(null);

		return networkLinks2;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setGeoSite(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setGeoSite(null);

		return servicePoint;
	}

	public List<TransportServicePoint> getTransportServicePoints() {
		return this.transportServicePoints;
	}

	public void setTransportServicePoints(List<TransportServicePoint> transportServicePoints) {
		this.transportServicePoints = transportServicePoints;
	}

	public TransportServicePoint addTransportServicePoint(TransportServicePoint transportServicePoint) {
		getTransportServicePoints().add(transportServicePoint);
		transportServicePoint.setGeoSite(this);

		return transportServicePoint;
	}

	public TransportServicePoint removeTransportServicePoint(TransportServicePoint transportServicePoint) {
		getTransportServicePoints().remove(transportServicePoint);
		transportServicePoint.setGeoSite(null);

		return transportServicePoint;
	}

}