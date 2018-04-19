package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_ps database table.
 * 
 */
@Entity
@Table(name="vuesm_ps")
@NamedQuery(name="VuesmP.findAll", query="SELECT v FROM VuesmP v")
public class VuesmP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	private int actif;

	@Column(nullable=false)
	private int codecanal;

	@Column(name="date_activation", nullable=false)
	private int dateActivation;

	@Column(name="diffuseur_id", nullable=false)
	private int diffuseurId;

	@Column(nullable=false)
	private int flagdirect;

	@Column(nullable=false)
	private int frequence;

	@Column(nullable=false)
	private int idesther;

	@Column(name="ig_codestation", nullable=false)
	private int igCodestation;

	@Column(name="ig_id", nullable=false)
	private int igId;

	@Column(name="ig_libelleext", nullable=false)
	private int igLibelleext;

	@Column(name="ig_libelleint", nullable=false)
	private int igLibelleint;

	@Column(nullable=false)
	private int libelleext;

	@Column(nullable=false)
	private int libelleint;

	@Column(nullable=false)
	private int libellenonesther;

	@Column(nullable=false)
	private int polarisation;

	@Column(name="ps_id", nullable=false)
	private int psId;

	@Column(nullable=false)
	private int puissance;

	@Column(nullable=false)
	private int reseau;

	@Column(name="se_nom_court_secours", nullable=false)
	private int seNomCourtSecours;

	@Column(name="se_nomcourt", nullable=false)
	private int seNomcourt;

	@Column(nullable=false)
	private int sonnicam;

	@Column(name="sseau_id", nullable=false)
	private int sseauId;

	@Column(nullable=false)
	private int typecontrat;

	@Column(nullable=false)
	private int visucristal;

	public VuesmP() {
	}

	public int getActif() {
		return this.actif;
	}

	public void setActif(int actif) {
		this.actif = actif;
	}

	public int getCodecanal() {
		return this.codecanal;
	}

	public void setCodecanal(int codecanal) {
		this.codecanal = codecanal;
	}

	public int getDateActivation() {
		return this.dateActivation;
	}

	public void setDateActivation(int dateActivation) {
		this.dateActivation = dateActivation;
	}

	public int getDiffuseurId() {
		return this.diffuseurId;
	}

	public void setDiffuseurId(int diffuseurId) {
		this.diffuseurId = diffuseurId;
	}

	public int getFlagdirect() {
		return this.flagdirect;
	}

	public void setFlagdirect(int flagdirect) {
		this.flagdirect = flagdirect;
	}

	public int getFrequence() {
		return this.frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	public int getIdesther() {
		return this.idesther;
	}

	public void setIdesther(int idesther) {
		this.idesther = idesther;
	}

	public int getIgCodestation() {
		return this.igCodestation;
	}

	public void setIgCodestation(int igCodestation) {
		this.igCodestation = igCodestation;
	}

	public int getIgId() {
		return this.igId;
	}

	public void setIgId(int igId) {
		this.igId = igId;
	}

	public int getIgLibelleext() {
		return this.igLibelleext;
	}

	public void setIgLibelleext(int igLibelleext) {
		this.igLibelleext = igLibelleext;
	}

	public int getIgLibelleint() {
		return this.igLibelleint;
	}

	public void setIgLibelleint(int igLibelleint) {
		this.igLibelleint = igLibelleint;
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

	public int getLibellenonesther() {
		return this.libellenonesther;
	}

	public void setLibellenonesther(int libellenonesther) {
		this.libellenonesther = libellenonesther;
	}

	public int getPolarisation() {
		return this.polarisation;
	}

	public void setPolarisation(int polarisation) {
		this.polarisation = polarisation;
	}

	public int getPsId() {
		return this.psId;
	}

	public void setPsId(int psId) {
		this.psId = psId;
	}

	public int getPuissance() {
		return this.puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getReseau() {
		return this.reseau;
	}

	public void setReseau(int reseau) {
		this.reseau = reseau;
	}

	public int getSeNomCourtSecours() {
		return this.seNomCourtSecours;
	}

	public void setSeNomCourtSecours(int seNomCourtSecours) {
		this.seNomCourtSecours = seNomCourtSecours;
	}

	public int getSeNomcourt() {
		return this.seNomcourt;
	}

	public void setSeNomcourt(int seNomcourt) {
		this.seNomcourt = seNomcourt;
	}

	public int getSonnicam() {
		return this.sonnicam;
	}

	public void setSonnicam(int sonnicam) {
		this.sonnicam = sonnicam;
	}

	public int getSseauId() {
		return this.sseauId;
	}

	public void setSseauId(int sseauId) {
		this.sseauId = sseauId;
	}

	public int getTypecontrat() {
		return this.typecontrat;
	}

	public void setTypecontrat(int typecontrat) {
		this.typecontrat = typecontrat;
	}

	public int getVisucristal() {
		return this.visucristal;
	}

	public void setVisucristal(int visucristal) {
		this.visucristal = visucristal;
	}

}