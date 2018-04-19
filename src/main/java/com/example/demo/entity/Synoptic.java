package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the synoptic database table.
 * 
 */
@Entity
@Table(name="synoptic")
@NamedQuery(name="Synoptic.findAll", query="SELECT s FROM Synoptic s")
public class Synoptic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="is_template", nullable=false)
	private byte isTemplate;

	@Column(length=255)
	private String label;

	//bi-directional many-to-one association to Menu
	@OneToMany(mappedBy="synoptic")
	private List<Menu> menus;

	//bi-directional many-to-one association to MenuSynoptic
	@OneToMany(mappedBy="synoptic")
	private List<MenuSynoptic> menuSynoptics;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="synoptic")
	private List<ServicePoint> servicePoints;

	//bi-directional many-to-one association to Synoptic
	@ManyToOne
	@JoinColumn(name="template_id")
	private Synoptic synoptic;

	//bi-directional many-to-one association to Synoptic
	@OneToMany(mappedBy="synoptic")
	private List<Synoptic> synoptics;

	//bi-directional many-to-one association to SynopticModel
	@ManyToOne
	@JoinColumn(name="synoptic_model_id")
	private SynopticModel synopticModel;

	//bi-directional many-to-one association to SynopticComponent
	@OneToMany(mappedBy="synoptic")
	private List<SynopticComponent> synopticComponents;

	public Synoptic() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsTemplate() {
		return this.isTemplate;
	}

	public void setIsTemplate(byte isTemplate) {
		this.isTemplate = isTemplate;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Menu addMenus(Menu menus) {
		getMenus().add(menus);
		menus.setSynoptic(this);

		return menus;
	}

	public Menu removeMenus(Menu menus) {
		getMenus().remove(menus);
		menus.setSynoptic(null);

		return menus;
	}

	public List<MenuSynoptic> getMenuSynoptics() {
		return this.menuSynoptics;
	}

	public void setMenuSynoptics(List<MenuSynoptic> menuSynoptics) {
		this.menuSynoptics = menuSynoptics;
	}

	public MenuSynoptic addMenuSynoptic(MenuSynoptic menuSynoptic) {
		getMenuSynoptics().add(menuSynoptic);
		menuSynoptic.setSynoptic(this);

		return menuSynoptic;
	}

	public MenuSynoptic removeMenuSynoptic(MenuSynoptic menuSynoptic) {
		getMenuSynoptics().remove(menuSynoptic);
		menuSynoptic.setSynoptic(null);

		return menuSynoptic;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setSynoptic(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setSynoptic(null);

		return servicePoint;
	}

	public Synoptic getSynoptic() {
		return this.synoptic;
	}

	public void setSynoptic(Synoptic synoptic) {
		this.synoptic = synoptic;
	}

	public List<Synoptic> getSynoptics() {
		return this.synoptics;
	}

	public void setSynoptics(List<Synoptic> synoptics) {
		this.synoptics = synoptics;
	}

	public Synoptic addSynoptic(Synoptic synoptic) {
		getSynoptics().add(synoptic);
		synoptic.setSynoptic(this);

		return synoptic;
	}

	public Synoptic removeSynoptic(Synoptic synoptic) {
		getSynoptics().remove(synoptic);
		synoptic.setSynoptic(null);

		return synoptic;
	}

	public SynopticModel getSynopticModel() {
		return this.synopticModel;
	}

	public void setSynopticModel(SynopticModel synopticModel) {
		this.synopticModel = synopticModel;
	}

	public List<SynopticComponent> getSynopticComponents() {
		return this.synopticComponents;
	}

	public void setSynopticComponents(List<SynopticComponent> synopticComponents) {
		this.synopticComponents = synopticComponents;
	}

	public SynopticComponent addSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().add(synopticComponent);
		synopticComponent.setSynoptic(this);

		return synopticComponent;
	}

	public SynopticComponent removeSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().remove(synopticComponent);
		synopticComponent.setSynoptic(null);

		return synopticComponent;
	}

}