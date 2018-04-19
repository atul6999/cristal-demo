package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vuesm_profil database table.
 * 
 */
@Entity
@Table(name="vuesm_profil")
@NamedQuery(name="VuesmProfil.findAll", query="SELECT v FROM VuesmProfil v")
public class VuesmProfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="prf_acces_bande_emission", nullable=false)
	private int prfAccesBandeEmission;

	@Column(name="prf_acces_bande_reception", nullable=false)
	private int prfAccesBandeReception;

	@Column(name="prf_acces_code_esther", nullable=false)
	private int prfAccesCodeEsther;

	@Column(name="prf_acces_code_ig", nullable=false)
	private int prfAccesCodeIg;

	@Column(name="prf_acces_conditions_intervention", nullable=false)
	private int prfAccesConditionsIntervention;

	@Column(name="prf_acces_couleur", nullable=false)
	private int prfAccesCouleur;

	@Column(name="prf_acces_dates_alarme_serveur", nullable=false)
	private int prfAccesDatesAlarmeServeur;

	@Column(name="prf_acces_decrochage", nullable=false)
	private int prfAccesDecrochage;

	@Column(name="prf_acces_ecet", nullable=false)
	private int prfAccesEcet;

	@Column(name="prf_acces_ecet_maintenance", nullable=false)
	private int prfAccesEcetMaintenance;

	@Column(name="prf_acces_filtres", nullable=false)
	private int prfAccesFiltres;

	@Column(name="prf_acces_libelle_indispo", nullable=false)
	private int prfAccesLibelleIndispo;

	@Column(name="prf_acces_libelle_interne", nullable=false)
	private int prfAccesLibelleInterne;

	@Column(name="prf_acces_libelle_ps_non_esther", nullable=false)
	private int prfAccesLibellePsNonEsther;

	@Column(name="prf_acces_nom_diffuseur", nullable=false)
	private int prfAccesNomDiffuseur;

	@Column(name="prf_acces_programme", nullable=false)
	private int prfAccesProgramme;

	@Column(name="prf_acces_restriction_ps_client", nullable=false)
	private int prfAccesRestrictionPsClient;

	@Column(name="prf_acces_site", nullable=false)
	private int prfAccesSite;

	@Column(name="prf_acces_surveillance_chantier", nullable=false)
	private int prfAccesSurveillanceChantier;

	@Column(name="prf_acces_type_ecet", nullable=false)
	private int prfAccesTypeEcet;

	@Column(name="prf_alarmes_acquittees", nullable=false)
	private int prfAlarmesAcquittees;

	@Column(name="prf_balai_delai", nullable=false)
	private int prfBalaiDelai;

	@Column(name="prf_carte_couleur", nullable=false)
	private int prfCarteCouleur;

	@Column(name="prf_carte_zoom", nullable=false)
	private int prfCarteZoom;

	@Column(name="prf_contact_mail", nullable=false)
	private int prfContactMail;

	@Column(name="prf_contact_tel", nullable=false)
	private int prfContactTel;

	@Column(name="prf_date_initiale", nullable=false)
	private int prfDateInitiale;

	@Column(name="prf_delai_defaillance", nullable=false)
	private int prfDelaiDefaillance;

	@Column(name="prf_id", nullable=false)
	private int prfId;

	@Column(name="prf_logo", nullable=false)
	private int prfLogo;

	@Column(name="prf_menu_evenements_en_cours", nullable=false)
	private int prfMenuEvenementsEnCours;

	@Column(name="prf_menu_filtre_diffuseur", nullable=false)
	private int prfMenuFiltreDiffuseur;

	@Column(name="prf_menu_filtre_do", nullable=false)
	private int prfMenuFiltreDo;

	@Column(name="prf_menu_filtre_frequence", nullable=false)
	private int prfMenuFiltreFrequence;

	@Column(name="prf_menu_filtre_historique_incidents", nullable=false)
	private int prfMenuFiltreHistoriqueIncidents;

	@Column(name="prf_menu_filtre_incidents_en_cours", nullable=false)
	private int prfMenuFiltreIncidentsEnCours;

	@Column(name="prf_menu_filtre_nicam", nullable=false)
	private int prfMenuFiltreNicam;

	@Column(name="prf_menu_filtre_programmes", nullable=false)
	private int prfMenuFiltreProgrammes;

	@Column(name="prf_menu_filtre_puissance", nullable=false)
	private int prfMenuFiltrePuissance;

	@Column(name="prf_menu_filtre_type_service", nullable=false)
	private int prfMenuFiltreTypeService;

	@Column(name="prf_menu_filtre_vue", nullable=false)
	private int prfMenuFiltreVue;

	@Column(name="prf_menu_historique_evenements", nullable=false)
	private int prfMenuHistoriqueEvenements;

	@Column(name="prf_menu_legende", nullable=false)
	private int prfMenuLegende;

	@Column(name="prf_menu_liste_ecets", nullable=false)
	private int prfMenuListeEcets;

	@Column(name="prf_menu_mode_carte", nullable=false)
	private int prfMenuModeCarte;

	@Column(name="prf_menu_mode_liste", nullable=false)
	private int prfMenuModeListe;

	@Column(name="prf_menu_ps_surveilles", nullable=false)
	private int prfMenuPsSurveilles;

	@Column(name="prf_menu_type_evenement", nullable=false)
	private int prfMenuTypeEvenement;

	@Column(name="prf_nom", nullable=false)
	private int prfNom;

	@Column(name="prf_notification_duree", nullable=false)
	private int prfNotificationDuree;

	@Column(name="prf_tdf", nullable=false)
	private int prfTdf;

	@Column(name="prf_tout_client", nullable=false)
	private int prfToutClient;

	@Column(name="prf_version", nullable=false)
	private int prfVersion;

	@Column(name="prfcss_id", nullable=false)
	private int prfcssId;

	public VuesmProfil() {
	}

	public int getPrfAccesBandeEmission() {
		return this.prfAccesBandeEmission;
	}

	public void setPrfAccesBandeEmission(int prfAccesBandeEmission) {
		this.prfAccesBandeEmission = prfAccesBandeEmission;
	}

	public int getPrfAccesBandeReception() {
		return this.prfAccesBandeReception;
	}

	public void setPrfAccesBandeReception(int prfAccesBandeReception) {
		this.prfAccesBandeReception = prfAccesBandeReception;
	}

	public int getPrfAccesCodeEsther() {
		return this.prfAccesCodeEsther;
	}

	public void setPrfAccesCodeEsther(int prfAccesCodeEsther) {
		this.prfAccesCodeEsther = prfAccesCodeEsther;
	}

	public int getPrfAccesCodeIg() {
		return this.prfAccesCodeIg;
	}

	public void setPrfAccesCodeIg(int prfAccesCodeIg) {
		this.prfAccesCodeIg = prfAccesCodeIg;
	}

	public int getPrfAccesConditionsIntervention() {
		return this.prfAccesConditionsIntervention;
	}

	public void setPrfAccesConditionsIntervention(int prfAccesConditionsIntervention) {
		this.prfAccesConditionsIntervention = prfAccesConditionsIntervention;
	}

	public int getPrfAccesCouleur() {
		return this.prfAccesCouleur;
	}

	public void setPrfAccesCouleur(int prfAccesCouleur) {
		this.prfAccesCouleur = prfAccesCouleur;
	}

	public int getPrfAccesDatesAlarmeServeur() {
		return this.prfAccesDatesAlarmeServeur;
	}

	public void setPrfAccesDatesAlarmeServeur(int prfAccesDatesAlarmeServeur) {
		this.prfAccesDatesAlarmeServeur = prfAccesDatesAlarmeServeur;
	}

	public int getPrfAccesDecrochage() {
		return this.prfAccesDecrochage;
	}

	public void setPrfAccesDecrochage(int prfAccesDecrochage) {
		this.prfAccesDecrochage = prfAccesDecrochage;
	}

	public int getPrfAccesEcet() {
		return this.prfAccesEcet;
	}

	public void setPrfAccesEcet(int prfAccesEcet) {
		this.prfAccesEcet = prfAccesEcet;
	}

	public int getPrfAccesEcetMaintenance() {
		return this.prfAccesEcetMaintenance;
	}

	public void setPrfAccesEcetMaintenance(int prfAccesEcetMaintenance) {
		this.prfAccesEcetMaintenance = prfAccesEcetMaintenance;
	}

	public int getPrfAccesFiltres() {
		return this.prfAccesFiltres;
	}

	public void setPrfAccesFiltres(int prfAccesFiltres) {
		this.prfAccesFiltres = prfAccesFiltres;
	}

	public int getPrfAccesLibelleIndispo() {
		return this.prfAccesLibelleIndispo;
	}

	public void setPrfAccesLibelleIndispo(int prfAccesLibelleIndispo) {
		this.prfAccesLibelleIndispo = prfAccesLibelleIndispo;
	}

	public int getPrfAccesLibelleInterne() {
		return this.prfAccesLibelleInterne;
	}

	public void setPrfAccesLibelleInterne(int prfAccesLibelleInterne) {
		this.prfAccesLibelleInterne = prfAccesLibelleInterne;
	}

	public int getPrfAccesLibellePsNonEsther() {
		return this.prfAccesLibellePsNonEsther;
	}

	public void setPrfAccesLibellePsNonEsther(int prfAccesLibellePsNonEsther) {
		this.prfAccesLibellePsNonEsther = prfAccesLibellePsNonEsther;
	}

	public int getPrfAccesNomDiffuseur() {
		return this.prfAccesNomDiffuseur;
	}

	public void setPrfAccesNomDiffuseur(int prfAccesNomDiffuseur) {
		this.prfAccesNomDiffuseur = prfAccesNomDiffuseur;
	}

	public int getPrfAccesProgramme() {
		return this.prfAccesProgramme;
	}

	public void setPrfAccesProgramme(int prfAccesProgramme) {
		this.prfAccesProgramme = prfAccesProgramme;
	}

	public int getPrfAccesRestrictionPsClient() {
		return this.prfAccesRestrictionPsClient;
	}

	public void setPrfAccesRestrictionPsClient(int prfAccesRestrictionPsClient) {
		this.prfAccesRestrictionPsClient = prfAccesRestrictionPsClient;
	}

	public int getPrfAccesSite() {
		return this.prfAccesSite;
	}

	public void setPrfAccesSite(int prfAccesSite) {
		this.prfAccesSite = prfAccesSite;
	}

	public int getPrfAccesSurveillanceChantier() {
		return this.prfAccesSurveillanceChantier;
	}

	public void setPrfAccesSurveillanceChantier(int prfAccesSurveillanceChantier) {
		this.prfAccesSurveillanceChantier = prfAccesSurveillanceChantier;
	}

	public int getPrfAccesTypeEcet() {
		return this.prfAccesTypeEcet;
	}

	public void setPrfAccesTypeEcet(int prfAccesTypeEcet) {
		this.prfAccesTypeEcet = prfAccesTypeEcet;
	}

	public int getPrfAlarmesAcquittees() {
		return this.prfAlarmesAcquittees;
	}

	public void setPrfAlarmesAcquittees(int prfAlarmesAcquittees) {
		this.prfAlarmesAcquittees = prfAlarmesAcquittees;
	}

	public int getPrfBalaiDelai() {
		return this.prfBalaiDelai;
	}

	public void setPrfBalaiDelai(int prfBalaiDelai) {
		this.prfBalaiDelai = prfBalaiDelai;
	}

	public int getPrfCarteCouleur() {
		return this.prfCarteCouleur;
	}

	public void setPrfCarteCouleur(int prfCarteCouleur) {
		this.prfCarteCouleur = prfCarteCouleur;
	}

	public int getPrfCarteZoom() {
		return this.prfCarteZoom;
	}

	public void setPrfCarteZoom(int prfCarteZoom) {
		this.prfCarteZoom = prfCarteZoom;
	}

	public int getPrfContactMail() {
		return this.prfContactMail;
	}

	public void setPrfContactMail(int prfContactMail) {
		this.prfContactMail = prfContactMail;
	}

	public int getPrfContactTel() {
		return this.prfContactTel;
	}

	public void setPrfContactTel(int prfContactTel) {
		this.prfContactTel = prfContactTel;
	}

	public int getPrfDateInitiale() {
		return this.prfDateInitiale;
	}

	public void setPrfDateInitiale(int prfDateInitiale) {
		this.prfDateInitiale = prfDateInitiale;
	}

	public int getPrfDelaiDefaillance() {
		return this.prfDelaiDefaillance;
	}

	public void setPrfDelaiDefaillance(int prfDelaiDefaillance) {
		this.prfDelaiDefaillance = prfDelaiDefaillance;
	}

	public int getPrfId() {
		return this.prfId;
	}

	public void setPrfId(int prfId) {
		this.prfId = prfId;
	}

	public int getPrfLogo() {
		return this.prfLogo;
	}

	public void setPrfLogo(int prfLogo) {
		this.prfLogo = prfLogo;
	}

	public int getPrfMenuEvenementsEnCours() {
		return this.prfMenuEvenementsEnCours;
	}

	public void setPrfMenuEvenementsEnCours(int prfMenuEvenementsEnCours) {
		this.prfMenuEvenementsEnCours = prfMenuEvenementsEnCours;
	}

	public int getPrfMenuFiltreDiffuseur() {
		return this.prfMenuFiltreDiffuseur;
	}

	public void setPrfMenuFiltreDiffuseur(int prfMenuFiltreDiffuseur) {
		this.prfMenuFiltreDiffuseur = prfMenuFiltreDiffuseur;
	}

	public int getPrfMenuFiltreDo() {
		return this.prfMenuFiltreDo;
	}

	public void setPrfMenuFiltreDo(int prfMenuFiltreDo) {
		this.prfMenuFiltreDo = prfMenuFiltreDo;
	}

	public int getPrfMenuFiltreFrequence() {
		return this.prfMenuFiltreFrequence;
	}

	public void setPrfMenuFiltreFrequence(int prfMenuFiltreFrequence) {
		this.prfMenuFiltreFrequence = prfMenuFiltreFrequence;
	}

	public int getPrfMenuFiltreHistoriqueIncidents() {
		return this.prfMenuFiltreHistoriqueIncidents;
	}

	public void setPrfMenuFiltreHistoriqueIncidents(int prfMenuFiltreHistoriqueIncidents) {
		this.prfMenuFiltreHistoriqueIncidents = prfMenuFiltreHistoriqueIncidents;
	}

	public int getPrfMenuFiltreIncidentsEnCours() {
		return this.prfMenuFiltreIncidentsEnCours;
	}

	public void setPrfMenuFiltreIncidentsEnCours(int prfMenuFiltreIncidentsEnCours) {
		this.prfMenuFiltreIncidentsEnCours = prfMenuFiltreIncidentsEnCours;
	}

	public int getPrfMenuFiltreNicam() {
		return this.prfMenuFiltreNicam;
	}

	public void setPrfMenuFiltreNicam(int prfMenuFiltreNicam) {
		this.prfMenuFiltreNicam = prfMenuFiltreNicam;
	}

	public int getPrfMenuFiltreProgrammes() {
		return this.prfMenuFiltreProgrammes;
	}

	public void setPrfMenuFiltreProgrammes(int prfMenuFiltreProgrammes) {
		this.prfMenuFiltreProgrammes = prfMenuFiltreProgrammes;
	}

	public int getPrfMenuFiltrePuissance() {
		return this.prfMenuFiltrePuissance;
	}

	public void setPrfMenuFiltrePuissance(int prfMenuFiltrePuissance) {
		this.prfMenuFiltrePuissance = prfMenuFiltrePuissance;
	}

	public int getPrfMenuFiltreTypeService() {
		return this.prfMenuFiltreTypeService;
	}

	public void setPrfMenuFiltreTypeService(int prfMenuFiltreTypeService) {
		this.prfMenuFiltreTypeService = prfMenuFiltreTypeService;
	}

	public int getPrfMenuFiltreVue() {
		return this.prfMenuFiltreVue;
	}

	public void setPrfMenuFiltreVue(int prfMenuFiltreVue) {
		this.prfMenuFiltreVue = prfMenuFiltreVue;
	}

	public int getPrfMenuHistoriqueEvenements() {
		return this.prfMenuHistoriqueEvenements;
	}

	public void setPrfMenuHistoriqueEvenements(int prfMenuHistoriqueEvenements) {
		this.prfMenuHistoriqueEvenements = prfMenuHistoriqueEvenements;
	}

	public int getPrfMenuLegende() {
		return this.prfMenuLegende;
	}

	public void setPrfMenuLegende(int prfMenuLegende) {
		this.prfMenuLegende = prfMenuLegende;
	}

	public int getPrfMenuListeEcets() {
		return this.prfMenuListeEcets;
	}

	public void setPrfMenuListeEcets(int prfMenuListeEcets) {
		this.prfMenuListeEcets = prfMenuListeEcets;
	}

	public int getPrfMenuModeCarte() {
		return this.prfMenuModeCarte;
	}

	public void setPrfMenuModeCarte(int prfMenuModeCarte) {
		this.prfMenuModeCarte = prfMenuModeCarte;
	}

	public int getPrfMenuModeListe() {
		return this.prfMenuModeListe;
	}

	public void setPrfMenuModeListe(int prfMenuModeListe) {
		this.prfMenuModeListe = prfMenuModeListe;
	}

	public int getPrfMenuPsSurveilles() {
		return this.prfMenuPsSurveilles;
	}

	public void setPrfMenuPsSurveilles(int prfMenuPsSurveilles) {
		this.prfMenuPsSurveilles = prfMenuPsSurveilles;
	}

	public int getPrfMenuTypeEvenement() {
		return this.prfMenuTypeEvenement;
	}

	public void setPrfMenuTypeEvenement(int prfMenuTypeEvenement) {
		this.prfMenuTypeEvenement = prfMenuTypeEvenement;
	}

	public int getPrfNom() {
		return this.prfNom;
	}

	public void setPrfNom(int prfNom) {
		this.prfNom = prfNom;
	}

	public int getPrfNotificationDuree() {
		return this.prfNotificationDuree;
	}

	public void setPrfNotificationDuree(int prfNotificationDuree) {
		this.prfNotificationDuree = prfNotificationDuree;
	}

	public int getPrfTdf() {
		return this.prfTdf;
	}

	public void setPrfTdf(int prfTdf) {
		this.prfTdf = prfTdf;
	}

	public int getPrfToutClient() {
		return this.prfToutClient;
	}

	public void setPrfToutClient(int prfToutClient) {
		this.prfToutClient = prfToutClient;
	}

	public int getPrfVersion() {
		return this.prfVersion;
	}

	public void setPrfVersion(int prfVersion) {
		this.prfVersion = prfVersion;
	}

	public int getPrfcssId() {
		return this.prfcssId;
	}

	public void setPrfcssId(int prfcssId) {
		this.prfcssId = prfcssId;
	}

}