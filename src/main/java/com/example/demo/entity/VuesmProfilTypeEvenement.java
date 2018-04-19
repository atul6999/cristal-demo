package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_profil_type_evenement database table.
 * 
 */
@Entity
@Table(name="vuesm_profil_type_evenement")
@NamedQuery(name="VuesmProfilTypeEvenement.findAll", query="SELECT v FROM VuesmProfilTypeEvenement v")
public class VuesmProfilTypeEvenement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="prf_id", nullable=false)
	private int prfId;

	@Column(name="prftypevt_delai_presentation", nullable=false)
	private int prftypevtDelaiPresentation;

	@Column(name="type_evt_id", nullable=false)
	private int typeEvtId;

	public VuesmProfilTypeEvenement() {
	}

	public int getPrfId() {
		return this.prfId;
	}

	public void setPrfId(int prfId) {
		this.prfId = prfId;
	}

	public int getPrftypevtDelaiPresentation() {
		return this.prftypevtDelaiPresentation;
	}

	public void setPrftypevtDelaiPresentation(int prftypevtDelaiPresentation) {
		this.prftypevtDelaiPresentation = prftypevtDelaiPresentation;
	}

	public int getTypeEvtId() {
		return this.typeEvtId;
	}

	public void setTypeEvtId(int typeEvtId) {
		this.typeEvtId = typeEvtId;
	}

}