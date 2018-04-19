package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_evt_gravite database table.
 * 
 */
@Entity
@Table(name="vuesm_evt_gravite")
@NamedQuery(name="VuesmEvtGravite.findAll", query="SELECT v FROM VuesmEvtGravite v")
public class VuesmEvtGravite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="grv_couleur", nullable=false)
	private int grvCouleur;

	@Column(name="grv_id", nullable=false)
	private int grvId;

	@Column(name="grv_libelle", nullable=false)
	private int grvLibelle;

	@Column(name="grv_niveau", nullable=false)
	private int grvNiveau;

	public VuesmEvtGravite() {
	}

	public int getGrvCouleur() {
		return this.grvCouleur;
	}

	public void setGrvCouleur(int grvCouleur) {
		this.grvCouleur = grvCouleur;
	}

	public int getGrvId() {
		return this.grvId;
	}

	public void setGrvId(int grvId) {
		this.grvId = grvId;
	}

	public int getGrvLibelle() {
		return this.grvLibelle;
	}

	public void setGrvLibelle(int grvLibelle) {
		this.grvLibelle = grvLibelle;
	}

	public int getGrvNiveau() {
		return this.grvNiveau;
	}

	public void setGrvNiveau(int grvNiveau) {
		this.grvNiveau = grvNiveau;
	}

}