package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the network_link_service_point_event_type database table.
 * 
 */
@Entity
@Table(name="network_link_service_point_event_type")
@NamedQuery(name="NetworkLinkServicePointEventType.findAll", query="SELECT n FROM NetworkLinkServicePointEventType n")
public class NetworkLinkServicePointEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to NetworkLink
	@ManyToOne
	@JoinColumn(name="network_link_id", nullable=false)
	private NetworkLink networkLink;

	//bi-directional many-to-one association to EventType
	@ManyToOne
	@JoinColumn(name="event_type_identifier", nullable=false)
	private EventType eventType;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier", nullable=false)
	private ServicePoint servicePoint;

	public NetworkLinkServicePointEventType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NetworkLink getNetworkLink() {
		return this.networkLink;
	}

	public void setNetworkLink(NetworkLink networkLink) {
		this.networkLink = networkLink;
	}

	public EventType getEventType() {
		return this.eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

}