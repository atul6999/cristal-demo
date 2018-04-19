package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the patch_action database table.
 * 
 */
@Entity
@Table(name="patch_action")
@NamedQuery(name="PatchAction.findAll", query="SELECT p FROM PatchAction p")
public class PatchAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="execution_date")
	private Date executionDate;

	@Lob
	@Column(name="patch_action_text", nullable=false)
	private String patchActionText;

	@Column(nullable=false, length=255)
	private String status;

	//bi-directional many-to-one association to Version
	@ManyToOne
	@JoinColumn(name="version_identifier")
	private Version version;

	public PatchAction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getExecutionDate() {
		return this.executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public String getPatchActionText() {
		return this.patchActionText;
	}

	public void setPatchActionText(String patchActionText) {
		this.patchActionText = patchActionText;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Version getVersion() {
		return this.version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

}