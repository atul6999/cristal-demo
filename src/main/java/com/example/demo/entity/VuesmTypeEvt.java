package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_type_evt database table.
 * 
 */
@Entity
@Table(name="vuesm_type_evt")
@NamedQuery(name="VuesmTypeEvt.findAll", query="SELECT v FROM VuesmTypeEvt v")
public class VuesmTypeEvt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	private int categorie;

	@Column(nullable=false)
	private int gravite;

	@Column(name="gravite_presentation", nullable=false)
	private int gravitePresentation;

	@Column(nullable=false)
	private int libelle;

	@Column(nullable=false)
	private int rgevsurv;

	@Column(name="type_evt_id", nullable=false)
	private int typeEvtId;

	@Column(name="typevt_descriptif_externe", nullable=false)
	private int typevtDescriptifExterne;

	@Column(name="typevt_descriptif_interne", nullable=false)
	private int typevtDescriptifInterne;

	public VuesmTypeEvt() {
	}

	public int getCategorie() {
		return this.categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	public int getGravite() {
		return this.gravite;
	}

	public void setGravite(int gravite) {
		this.gravite = gravite;
	}

	public int getGravitePresentation() {
		return this.gravitePresentation;
	}

	public void setGravitePresentation(int gravitePresentation) {
		this.gravitePresentation = gravitePresentation;
	}

	public int getLibelle() {
		return this.libelle;
	}

	public void setLibelle(int libelle) {
		this.libelle = libelle;
	}

	public int getRgevsurv() {
		return this.rgevsurv;
	}

	public void setRgevsurv(int rgevsurv) {
		this.rgevsurv = rgevsurv;
	}

	public int getTypeEvtId() {
		return this.typeEvtId;
	}

	public void setTypeEvtId(int typeEvtId) {
		this.typeEvtId = typeEvtId;
	}

	public int getTypevtDescriptifExterne() {
		return this.typevtDescriptifExterne;
	}

	public void setTypevtDescriptifExterne(int typevtDescriptifExterne) {
		this.typevtDescriptifExterne = typevtDescriptifExterne;
	}

	public int getTypevtDescriptifInterne() {
		return this.typevtDescriptifInterne;
	}

	public void setTypevtDescriptifInterne(int typevtDescriptifInterne) {
		this.typevtDescriptifInterne = typevtDescriptifInterne;
	}

}