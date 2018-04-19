package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the menu database table.
 * 
 */
@Entity
@Table(name="menu")
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="group_name", length=255)
	private String groupName;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to Synoptic
	@ManyToOne
	@JoinColumn(name="synoptic_id")
	private Synoptic synoptic;

	//bi-directional many-to-one association to MenuServicePoint
	@OneToMany(mappedBy="menu")
	private List<MenuServicePoint> menuServicePoints;

	//bi-directional many-to-one association to MenuSynoptic
	@OneToMany(mappedBy="menu")
	private List<MenuSynoptic> menuSynoptics;

	public Menu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Synoptic getSynoptic() {
		return this.synoptic;
	}

	public void setSynoptic(Synoptic synoptic) {
		this.synoptic = synoptic;
	}

	public List<MenuServicePoint> getMenuServicePoints() {
		return this.menuServicePoints;
	}

	public void setMenuServicePoints(List<MenuServicePoint> menuServicePoints) {
		this.menuServicePoints = menuServicePoints;
	}

	public MenuServicePoint addMenuServicePoint(MenuServicePoint menuServicePoint) {
		getMenuServicePoints().add(menuServicePoint);
		menuServicePoint.setMenu(this);

		return menuServicePoint;
	}

	public MenuServicePoint removeMenuServicePoint(MenuServicePoint menuServicePoint) {
		getMenuServicePoints().remove(menuServicePoint);
		menuServicePoint.setMenu(null);

		return menuServicePoint;
	}

	public List<MenuSynoptic> getMenuSynoptics() {
		return this.menuSynoptics;
	}

	public void setMenuSynoptics(List<MenuSynoptic> menuSynoptics) {
		this.menuSynoptics = menuSynoptics;
	}

	public MenuSynoptic addMenuSynoptic(MenuSynoptic menuSynoptic) {
		getMenuSynoptics().add(menuSynoptic);
		menuSynoptic.setMenu(this);

		return menuSynoptic;
	}

	public MenuSynoptic removeMenuSynoptic(MenuSynoptic menuSynoptic) {
		getMenuSynoptics().remove(menuSynoptic);
		menuSynoptic.setMenu(null);

		return menuSynoptic;
	}

}