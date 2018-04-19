package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_ig database table.
 * 
 */
@Entity
@Table(name="vuesm_ig")
@NamedQuery(name="VuesmIg.findAll", query="SELECT v FROM VuesmIg v")
public class VuesmIg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	private int couleur;

	@Column(name="id_dt", nullable=false)
	private int idDt;

	@Column(nullable=false)
	private int idesther;

	@Column(name="ig_code", nullable=false)
	private int igCode;

	@Column(name="ig_id", nullable=false)
	private int igId;

	@Column(name="ig_info", nullable=false)
	private int igInfo;

	@Column(name="ig_regionale", nullable=false)
	private int igRegionale;

	@Column(nullable=false)
	private int igtdf;

	@Column(name="lambert_x", nullable=false)
	private int lambertX;

	@Column(name="lambert_y", nullable=false)
	private int lambertY;

	@Column(nullable=false)
	private int latitude;

	@Column(nullable=false)
	private int libelleesther;

	@Column(nullable=false)
	private int libelleext;

	@Column(nullable=false)
	private int libelleint;

	@Column(nullable=false)
	private int longitude;

	@Column(nullable=false)
	private int numtel;

	@Column(name="station_code", nullable=false)
	private int stationCode;

	public VuesmIg() {
	}

	public int getCouleur() {
		return this.couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}

	public int getIdDt() {
		return this.idDt;
	}

	public void setIdDt(int idDt) {
		this.idDt = idDt;
	}

	public int getIdesther() {
		return this.idesther;
	}

	public void setIdesther(int idesther) {
		this.idesther = idesther;
	}

	public int getIgCode() {
		return this.igCode;
	}

	public void setIgCode(int igCode) {
		this.igCode = igCode;
	}

	public int getIgId() {
		return this.igId;
	}

	public void setIgId(int igId) {
		this.igId = igId;
	}

	public int getIgInfo() {
		return this.igInfo;
	}

	public void setIgInfo(int igInfo) {
		this.igInfo = igInfo;
	}

	public int getIgRegionale() {
		return this.igRegionale;
	}

	public void setIgRegionale(int igRegionale) {
		this.igRegionale = igRegionale;
	}

	public int getIgtdf() {
		return this.igtdf;
	}

	public void setIgtdf(int igtdf) {
		this.igtdf = igtdf;
	}

	public int getLambertX() {
		return this.lambertX;
	}

	public void setLambertX(int lambertX) {
		this.lambertX = lambertX;
	}

	public int getLambertY() {
		return this.lambertY;
	}

	public void setLambertY(int lambertY) {
		this.lambertY = lambertY;
	}

	public int getLatitude() {
		return this.latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLibelleesther() {
		return this.libelleesther;
	}

	public void setLibelleesther(int libelleesther) {
		this.libelleesther = libelleesther;
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

	public int getLongitude() {
		return this.longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getNumtel() {
		return this.numtel;
	}

	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}

	public int getStationCode() {
		return this.stationCode;
	}

	public void setStationCode(int stationCode) {
		this.stationCode = stationCode;
	}

}