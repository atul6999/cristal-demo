package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the menu_synoptic database table.
 * 
 */
@Entity
@Table(name="menu_synoptic")
@NamedQuery(name="MenuSynoptic.findAll", query="SELECT m FROM MenuSynoptic m")
public class MenuSynoptic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="group_name", length=255)
	private String groupName;

	//bi-directional many-to-one association to Synoptic
	@ManyToOne
	@JoinColumn(name="synoptic_id")
	private Synoptic synoptic;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menu menu;

	//bi-directional many-to-one association to MenuSynopticProfile
	@OneToMany(mappedBy="menuSynoptic")
	private List<MenuSynopticProfile> menuSynopticProfiles;

	public MenuSynoptic() {
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

	public Synoptic getSynoptic() {
		return this.synoptic;
	}

	public void setSynoptic(Synoptic synoptic) {
		this.synoptic = synoptic;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<MenuSynopticProfile> getMenuSynopticProfiles() {
		return this.menuSynopticProfiles;
	}

	public void setMenuSynopticProfiles(List<MenuSynopticProfile> menuSynopticProfiles) {
		this.menuSynopticProfiles = menuSynopticProfiles;
	}

	public MenuSynopticProfile addMenuSynopticProfile(MenuSynopticProfile menuSynopticProfile) {
		getMenuSynopticProfiles().add(menuSynopticProfile);
		menuSynopticProfile.setMenuSynoptic(this);

		return menuSynopticProfile;
	}

	public MenuSynopticProfile removeMenuSynopticProfile(MenuSynopticProfile menuSynopticProfile) {
		getMenuSynopticProfiles().remove(menuSynopticProfile);
		menuSynopticProfile.setMenuSynoptic(null);

		return menuSynopticProfile;
	}

}