package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the profile_live_streaming database table.
 * 
 */
@Entity
@Table(name="profile_live_streaming")
@NamedQuery(name="ProfileLiveStreaming.findAll", query="SELECT p FROM ProfileLiveStreaming p")
public class ProfileLiveStreaming implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="number_of_users", nullable=false)
	private int numberOfUsers;

	@Column(name="planned_length", nullable=false)
	private int plannedLength;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date")
	private Date startDate;

	@Column(name="stream_index")
	private int streamIndex;

	@Column(name="stream_ref", length=255)
	private String streamRef;

	@Column(name="stream_type", length=255)
	private String streamType;

	//bi-directional many-to-one association to StreamPort
	@ManyToOne
	@JoinColumn(name="stream_port_id", nullable=false)
	private StreamPort streamPort;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier")
	private ServicePoint servicePoint;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	//bi-directional many-to-one association to TransportServicePointStreaming
	@ManyToOne
	@JoinColumn(name="transport_service_point_streaming_id")
	private TransportServicePointStreaming transportServicePointStreaming;

	public ProfileLiveStreaming() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfUsers() {
		return this.numberOfUsers;
	}

	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}

	public int getPlannedLength() {
		return this.plannedLength;
	}

	public void setPlannedLength(int plannedLength) {
		this.plannedLength = plannedLength;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getStreamIndex() {
		return this.streamIndex;
	}

	public void setStreamIndex(int streamIndex) {
		this.streamIndex = streamIndex;
	}

	public String getStreamRef() {
		return this.streamRef;
	}

	public void setStreamRef(String streamRef) {
		this.streamRef = streamRef;
	}

	public String getStreamType() {
		return this.streamType;
	}

	public void setStreamType(String streamType) {
		this.streamType = streamType;
	}

	public StreamPort getStreamPort() {
		return this.streamPort;
	}

	public void setStreamPort(StreamPort streamPort) {
		this.streamPort = streamPort;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
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