package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the job_planning database table.
 * 
 */
@Entity
@Table(name="job_planning")
@NamedQuery(name="JobPlanning.findAll", query="SELECT j FROM JobPlanning j")
public class JobPlanning implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String command;

	@Column(length=1023)
	private String comment;

	@Column(name="cron_expression", nullable=false, length=255)
	private String cronExpression;

	@Column(length=1023)
	private String parameter;

	@Column(nullable=false, length=255)
	private String status;

	@Column(length=255)
	private String type;

	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="user_profile_id")
	private UserProfile userProfile;

	//bi-directional many-to-one association to ProfileHistoryStreaming
	@OneToMany(mappedBy="jobPlanning")
	private List<ProfileHistoryStreaming> profileHistoryStreamings;

	//bi-directional many-to-one association to Telemetry
	@OneToMany(mappedBy="jobPlanning")
	private List<Telemetry> telemetries;

	public JobPlanning() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public List<ProfileHistoryStreaming> getProfileHistoryStreamings() {
		return this.profileHistoryStreamings;
	}

	public void setProfileHistoryStreamings(List<ProfileHistoryStreaming> profileHistoryStreamings) {
		this.profileHistoryStreamings = profileHistoryStreamings;
	}

	public ProfileHistoryStreaming addProfileHistoryStreaming(ProfileHistoryStreaming profileHistoryStreaming) {
		getProfileHistoryStreamings().add(profileHistoryStreaming);
		profileHistoryStreaming.setJobPlanning(this);

		return profileHistoryStreaming;
	}

	public ProfileHistoryStreaming removeProfileHistoryStreaming(ProfileHistoryStreaming profileHistoryStreaming) {
		getProfileHistoryStreamings().remove(profileHistoryStreaming);
		profileHistoryStreaming.setJobPlanning(null);

		return profileHistoryStreaming;
	}

	public List<Telemetry> getTelemetries() {
		return this.telemetries;
	}

	public void setTelemetries(List<Telemetry> telemetries) {
		this.telemetries = telemetries;
	}

	public Telemetry addTelemetry(Telemetry telemetry) {
		getTelemetries().add(telemetry);
		telemetry.setJobPlanning(this);

		return telemetry;
	}

	public Telemetry removeTelemetry(Telemetry telemetry) {
		getTelemetries().remove(telemetry);
		telemetry.setJobPlanning(null);

		return telemetry;
	}

}