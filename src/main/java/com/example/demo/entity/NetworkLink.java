package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the network_link database table.
 * 
 */
@Entity
@Table(name="network_link")
@NamedQuery(name="NetworkLink.findAll", query="SELECT n FROM NetworkLink n")
public class NetworkLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String type;

	//bi-directional many-to-one association to GeoSite
	@ManyToOne
	@JoinColumn(name="geo_site_code_end", nullable=false)
	private GeoSite geoSite1;

	//bi-directional many-to-one association to GeoSite
	@ManyToOne
	@JoinColumn(name="geo_site_code_start")
	private GeoSite geoSite2;

	//bi-directional many-to-one association to NetworkLinkServicePointEventType
	@OneToMany(mappedBy="networkLink")
	private List<NetworkLinkServicePointEventType> networkLinkServicePointEventTypes;

	public NetworkLink() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GeoSite getGeoSite1() {
		return this.geoSite1;
	}

	public void setGeoSite1(GeoSite geoSite1) {
		this.geoSite1 = geoSite1;
	}

	public GeoSite getGeoSite2() {
		return this.geoSite2;
	}

	public void setGeoSite2(GeoSite geoSite2) {
		this.geoSite2 = geoSite2;
	}

	public List<NetworkLinkServicePointEventType> getNetworkLinkServicePointEventTypes() {
		return this.networkLinkServicePointEventTypes;
	}

	public void setNetworkLinkServicePointEventTypes(List<NetworkLinkServicePointEventType> networkLinkServicePointEventTypes) {
		this.networkLinkServicePointEventTypes = networkLinkServicePointEventTypes;
	}

	public NetworkLinkServicePointEventType addNetworkLinkServicePointEventType(NetworkLinkServicePointEventType networkLinkServicePointEventType) {
		getNetworkLinkServicePointEventTypes().add(networkLinkServicePointEventType);
		networkLinkServicePointEventType.setNetworkLink(this);

		return networkLinkServicePointEventType;
	}

	public NetworkLinkServicePointEventType removeNetworkLinkServicePointEventType(NetworkLinkServicePointEventType networkLinkServicePointEventType) {
		getNetworkLinkServicePointEventTypes().remove(networkLinkServicePointEventType);
		networkLinkServicePointEventType.setNetworkLink(null);

		return networkLinkServicePointEventType;
	}

}