package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_s_seau database table.
 * 
 */
@Entity
@Table(name="vuesm_s_seau")
@NamedQuery(name="VuesmSSeau.findAll", query="SELECT v FROM VuesmSSeau v")
public class VuesmSSeau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	private int idesther;

	@Column(nullable=false)
	private int libelleext;

	@Column(nullable=false)
	private int libelleint;

	@Column(nullable=false)
	private int nomcourt;

	@Column(name="pere_id", nullable=false)
	private int pereId;

	@Column(name="service_id", nullable=false)
	private int serviceId;

	@Column(name="sseau_id", nullable=false)
	private int sseauId;

	public VuesmSSeau() {
	}

	public int getIdesther() {
		return this.idesther;
	}

	public void setIdesther(int idesther) {
		this.idesther = idesther;
	}

	public int getLibelleext() {
		return this.libelleext;
	}

	public void setLibelleext(int libelleext) {
		this.libelleext = libelleext;
	}

	public int getLibelleint() {
		return this.libelleint;
	}

	public void setLibelleint(int libelleint) {
		this.libelleint = libelleint;
	}

	public int getNomcourt() {
		return this.nomcourt;
	}

	public void setNomcourt(int nomcourt) {
		this.nomcourt = nomcourt;
	}

	public int getPereId() {
		return this.pereId;
	}

	public void setPereId(int pereId) {
		this.pereId = pereId;
	}

	public int getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getSseauId() {
		return this.sseauId;
	}

	public void setSseauId(int sseauId) {
		this.sseauId = sseauId;
	}

}