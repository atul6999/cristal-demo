package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the transport_service_point database table.
 * 
 */
@Entity
@Table(name="transport_service_point")
@NamedQuery(name="TransportServicePoint.findAll", query="SELECT t FROM TransportServicePoint t")
public class TransportServicePoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=64)
	private String libelle;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier", nullable=false)
	private ServicePoint servicePoint;

	//bi-directional many-to-one association to GeoSite
	@ManyToOne
	@JoinColumn(name="geo_site_code", nullable=false)
	private GeoSite geoSite;

	//bi-directional many-to-one association to TransportServicePointStreaming
	@OneToMany(mappedBy="transportServicePoint")
	private List<TransportServicePointStreaming> transportServicePointStreamings;

	public TransportServicePoint() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	public GeoSite getGeoSite() {
		return this.geoSite;
	}

	public void setGeoSite(GeoSite geoSite) {
		this.geoSite = geoSite;
	}

	public List<TransportServicePointStreaming> getTransportServicePointStreamings() {
		return this.transportServicePointStreamings;
	}

	public void setTransportServicePointStreamings(List<TransportServicePointStreaming> transportServicePointStreamings) {
		this.transportServicePointStreamings = transportServicePointStreamings;
	}

	public TransportServicePointStreaming addTransportServicePointStreaming(TransportServicePointStreaming transportServicePointStreaming) {
		getTransportServicePointStreamings().add(transportServicePointStreaming);
		transportServicePointStreaming.setTransportServicePoint(this);

		return transportServicePointStreaming;
	}

	public TransportServicePointStreaming removeTransportServicePointStreaming(TransportServicePointStreaming transportServicePointStreaming) {
		getTransportServicePointStreamings().remove(transportServicePointStreaming);
		transportServicePointStreaming.setTransportServicePoint(null);

		return transportServicePointStreaming;
	}

}