package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_group database table.
 * 
 */
@Entity
@Table(name="service_group")
@NamedQuery(name="ServiceGroup.findAll", query="SELECT s FROM ServiceGroup s")
public class ServiceGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="display_order")
	private int displayOrder;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to Service
	@OneToMany(mappedBy="serviceGroup")
	private List<Service> services;

	public ServiceGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public Service addService(Service service) {
		getServices().add(service);
		service.setServiceGroup(this);

		return service;
	}

	public Service removeService(Service service) {
		getServices().remove(service);
		service.setServiceGroup(null);

		return service;
	}

}