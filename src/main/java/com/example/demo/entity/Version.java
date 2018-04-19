package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the version database table.
 * 
 */
@Entity
@Table(name="version")
@NamedQuery(name="Version.findAll", query="SELECT v FROM Version v")
public class Version implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String identifier;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Date lastUpdate;

	@Column(nullable=false, length=255)
	private String status;

	//bi-directional many-to-one association to PatchAction
	@OneToMany(mappedBy="version")
	private List<PatchAction> patchActions;

	//bi-directional many-to-one association to Version
	@ManyToOne
	@JoinColumn(name="previous_version_identifier")
	private Version version;

	//bi-directional many-to-one association to Version
	@OneToMany(mappedBy="version")
	private List<Version> versions;

	public Version() {
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PatchAction> getPatchActions() {
		return this.patchActions;
	}

	public void setPatchActions(List<PatchAction> patchActions) {
		this.patchActions = patchActions;
	}

	public PatchAction addPatchAction(PatchAction patchAction) {
		getPatchActions().add(patchAction);
		patchAction.setVersion(this);

		return patchAction;
	}

	public PatchAction removePatchAction(PatchAction patchAction) {
		getPatchActions().remove(patchAction);
		patchAction.setVersion(null);

		return patchAction;
	}

	public Version getVersion() {
		return this.version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public List<Version> getVersions() {
		return this.versions;
	}

	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}

	public Version addVersion(Version version) {
		getVersions().add(version);
		version.setVersion(this);

		return version;
	}

	public Version removeVersion(Version version) {
		getVersions().remove(version);
		version.setVersion(null);

		return version;
	}

}