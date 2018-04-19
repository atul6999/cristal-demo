package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transport_service_point_streaming_profile database table.
 * 
 */
@Entity
@Table(name="transport_service_point_streaming_profile")
@NamedQuery(name="TransportServicePointStreamingProfile.findAll", query="SELECT t FROM TransportServicePointStreamingProfile t")
public class TransportServicePointStreamingProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	//bi-directional many-to-one association to TransportServicePointStreaming
	@ManyToOne
	@JoinColumn(name="transport_service_point_streaming_id", nullable=false)
	private TransportServicePointStreaming transportServicePointStreaming;

	public TransportServicePointStreamingProfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public TransportServicePointStreaming getTransportServicePointStreaming() {
		return this.transportServicePointStreaming;
	}

	public void setTransportServicePointStreaming(TransportServicePointStreaming transportServicePointStreaming) {
		this.transportServicePointStreaming = transportServicePointStreaming;
	}

}