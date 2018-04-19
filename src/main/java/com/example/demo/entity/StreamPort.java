package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the stream_port database table.
 * 
 */
@Entity
@Table(name="stream_port")
@NamedQuery(name="StreamPort.findAll", query="SELECT s FROM StreamPort s")
public class StreamPort implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="port_number", nullable=false, length=255)
	private String portNumber;

	@Column(nullable=false, length=255)
	private String type;

	//bi-directional many-to-one association to ProfileLiveStreaming
	@OneToMany(mappedBy="streamPort")
	private List<ProfileLiveStreaming> profileLiveStreamings;

	public StreamPort() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPortNumber() {
		return this.portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ProfileLiveStreaming> getProfileLiveStreamings() {
		return this.profileLiveStreamings;
	}

	public void setProfileLiveStreamings(List<ProfileLiveStreaming> profileLiveStreamings) {
		this.profileLiveStreamings = profileLiveStreamings;
	}

	public ProfileLiveStreaming addProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().add(profileLiveStreaming);
		profileLiveStreaming.setStreamPort(this);

		return profileLiveStreaming;
	}

	public ProfileLiveStreaming removeProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().remove(profileLiveStreaming);
		profileLiveStreaming.setStreamPort(null);

		return profileLiveStreaming;
	}

}