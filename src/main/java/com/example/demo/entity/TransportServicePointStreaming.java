package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the transport_service_point_streaming database table.
 * 
 */
@Entity
@Table(name="transport_service_point_streaming")
@NamedQuery(name="TransportServicePointStreaming.findAll", query="SELECT t FROM TransportServicePointStreaming t")
public class TransportServicePointStreaming implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Lob
	@Column(name="json_data")
	private String jsonData;

	@Column(nullable=false, length=64)
	private String libelle;

	@Column(length=255)
	private String probe;

	@Column(nullable=false, length=64)
	private String type;

	@Column(name="url_1", length=300)
	private String url1;

	@Column(name="url_2", length=300)
	private String url2;

	//bi-directional many-to-one association to ProfileLiveStreaming
	@OneToMany(mappedBy="transportServicePointStreaming")
	private List<ProfileLiveStreaming> profileLiveStreamings;

	//bi-directional many-to-one association to TransportServicePoint
	@ManyToOne
	@JoinColumn(name="transport_service_point_id", nullable=false)
	private TransportServicePoint transportServicePoint;

	//bi-directional many-to-one association to TransportServicePointStreamingProfile
	@OneToMany(mappedBy="transportServicePointStreaming")
	private List<TransportServicePointStreamingProfile> transportServicePointStreamingProfiles;

	public TransportServicePointStreaming() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJsonData() {
		return this.jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getProbe() {
		return this.probe;
	}

	public void setProbe(String probe) {
		this.probe = probe;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl1() {
		return this.url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	public String getUrl2() {
		return this.url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	public List<ProfileLiveStreaming> getProfileLiveStreamings() {
		return this.profileLiveStreamings;
	}

	public void setProfileLiveStreamings(List<ProfileLiveStreaming> profileLiveStreamings) {
		this.profileLiveStreamings = profileLiveStreamings;
	}

	public ProfileLiveStreaming addProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().add(profileLiveStreaming);
		profileLiveStreaming.setTransportServicePointStreaming(this);

		return profileLiveStreaming;
	}

	public ProfileLiveStreaming removeProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().remove(profileLiveStreaming);
		profileLiveStreaming.setTransportServicePointStreaming(null);

		return profileLiveStreaming;
	}

	public TransportServicePoint getTransportServicePoint() {
		return this.transportServicePoint;
	}

	public void setTransportServicePoint(TransportServicePoint transportServicePoint) {
		this.transportServicePoint = transportServicePoint;
	}

	public List<TransportServicePointStreamingProfile> getTransportServicePointStreamingProfiles() {
		return this.transportServicePointStreamingProfiles;
	}

	public void setTransportServicePointStreamingProfiles(List<TransportServicePointStreamingProfile> transportServicePointStreamingProfiles) {
		this.transportServicePointStreamingProfiles = transportServicePointStreamingProfiles;
	}

	public TransportServicePointStreamingProfile addTransportServicePointStreamingProfile(TransportServicePointStreamingProfile transportServicePointStreamingProfile) {
		getTransportServicePointStreamingProfiles().add(transportServicePointStreamingProfile);
		transportServicePointStreamingProfile.setTransportServicePointStreaming(this);

		return transportServicePointStreamingProfile;
	}

	public TransportServicePointStreamingProfile removeTransportServicePointStreamingProfile(TransportServicePointStreamingProfile transportServicePointStreamingProfile) {
		getTransportServicePointStreamingProfiles().remove(transportServicePointStreamingProfile);
		transportServicePointStreamingProfile.setTransportServicePointStreaming(null);

		return transportServicePointStreamingProfile;
	}

}