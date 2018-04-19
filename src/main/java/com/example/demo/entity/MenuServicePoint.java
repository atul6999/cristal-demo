package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the menu_service_point database table.
 * 
 */
@Entity
@Table(name="menu_service_point")
@NamedQuery(name="MenuServicePoint.findAll", query="SELECT m FROM MenuServicePoint m")
public class MenuServicePoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier")
	private ServicePoint servicePoint;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menu menu;

	public MenuServicePoint() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}