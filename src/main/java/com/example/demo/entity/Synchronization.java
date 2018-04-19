package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the synchronization database table.
 * 
 */
@Entity
@Table(name="synchronization")
@NamedQuery(name="Synchronization.findAll", query="SELECT s FROM Synchronization s")
public class Synchronization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="domain_name", nullable=false, length=255)
	private String domainName;

	@Column(name="id_update")
	private BigInteger idUpdate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_synchronization")
	private Date lastSynchronization;

	@Column(length=255)
	private String method;

	//bi-directional many-to-one association to Application
	@ManyToOne
	@JoinColumn(name="application_id")
	private Application application;

	public Synchronization() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public BigInteger getIdUpdate() {
		return this.idUpdate;
	}

	public void setIdUpdate(BigInteger idUpdate) {
		this.idUpdate = idUpdate;
	}

	public Date getLastSynchronization() {
		return this.lastSynchronization;
	}

	public void setLastSynchronization(Date lastSynchronization) {
		this.lastSynchronization = lastSynchronization;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

}