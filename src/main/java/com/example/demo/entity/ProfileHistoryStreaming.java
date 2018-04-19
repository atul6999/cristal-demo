package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the profile_history_streaming database table.
 * 
 */
@Entity
@Table(name="profile_history_streaming")
@NamedQuery(name="ProfileHistoryStreaming.findAll", query="SELECT p FROM ProfileHistoryStreaming p")
public class ProfileHistoryStreaming implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="actual_length", nullable=false)
	private int actualLength;

	@Column(name="planned_length", nullable=false)
	private int plannedLength;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date")
	private Date startDate;

	@Column(name="stream_file_name", nullable=false, length=255)
	private String streamFileName;

	@Column(name="stream_format", length=255)
	private String streamFormat;

	@Column(name="stream_quality", length=255)
	private String streamQuality;

	//bi-directional many-to-one association to JobPlanning
	@ManyToOne
	@JoinColumn(name="job_planning_id")
	private JobPlanning jobPlanning;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier", nullable=false)
	private ServicePoint servicePoint;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public ProfileHistoryStreaming() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActualLength() {
		return this.actualLength;
	}

	public void setActualLength(int actualLength) {
		this.actualLength = actualLength;
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

	public String getStreamFileName() {
		return this.streamFileName;
	}

	public void setStreamFileName(String streamFileName) {
		this.streamFileName = streamFileName;
	}

	public String getStreamFormat() {
		return this.streamFormat;
	}

	public void setStreamFormat(String streamFormat) {
		this.streamFormat = streamFormat;
	}

	public String getStreamQuality() {
		return this.streamQuality;
	}

	public void setStreamQuality(String streamQuality) {
		this.streamQuality = streamQuality;
	}

	public JobPlanning getJobPlanning() {
		return this.jobPlanning;
	}

	public void setJobPlanning(JobPlanning jobPlanning) {
		this.jobPlanning = jobPlanning;
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

}