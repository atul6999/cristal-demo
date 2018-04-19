package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_stream_configuration database table.
 * 
 */
@Entity
@Table(name="profile_stream_configuration")
@NamedQuery(name="ProfileStreamConfiguration.findAll", query="SELECT p FROM ProfileStreamConfiguration p")
public class ProfileStreamConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="max_listening_time", length=255)
	private String maxListeningTime;

	@Column(name="stream_format", length=255)
	private String streamFormat;

	@Column(name="streaming_quality", length=255)
	private String streamingQuality;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile;

	public ProfileStreamConfiguration() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaxListeningTime() {
		return this.maxListeningTime;
	}

	public void setMaxListeningTime(String maxListeningTime) {
		this.maxListeningTime = maxListeningTime;
	}

	public String getStreamFormat() {
		return this.streamFormat;
	}

	public void setStreamFormat(String streamFormat) {
		this.streamFormat = streamFormat;
	}

	public String getStreamingQuality() {
		return this.streamingQuality;
	}

	public void setStreamingQuality(String streamingQuality) {
		this.streamingQuality = streamingQuality;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}