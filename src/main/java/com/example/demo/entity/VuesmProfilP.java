package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_profil_ps database table.
 * 
 */
@Entity
@Table(name="vuesm_profil_ps")
@NamedQuery(name="VuesmProfilP.findAll", query="SELECT v FROM VuesmProfilP v")
public class VuesmProfilP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="mtf_id", nullable=false)
	private int mtfId;

	@Column(name="prf_id", nullable=false)
	private int prfId;

	@Column(name="prfps_niveau_zoom", nullable=false)
	private int prfpsNiveauZoom;

	@Column(name="ps_id", nullable=false)
	private int psId;

	public VuesmProfilP() {
	}

	public int getMtfId() {
		return this.mtfId;
	}

	public void setMtfId(int mtfId) {
		this.mtfId = mtfId;
	}

	public int getPrfId() {
		return this.prfId;
	}

	public void setPrfId(int prfId) {
		this.prfId = prfId;
	}

	public int getPrfpsNiveauZoom() {
		return this.prfpsNiveauZoom;
	}

	public void setPrfpsNiveauZoom(int prfpsNiveauZoom) {
		this.prfpsNiveauZoom = prfpsNiveauZoom;
	}

	public int getPsId() {
		return this.psId;
	}

	public void setPsId(int psId) {
		this.psId = psId;
	}

}