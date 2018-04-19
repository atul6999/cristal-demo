package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the f3_region_service_point database table.
 * 
 */
@Entity
@Table(name="f3_region_service_point")
@NamedQuery(name="F3RegionServicePoint.findAll", query="SELECT f FROM F3RegionServicePoint f")
public class F3RegionServicePoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to F3Region
	@ManyToOne
	@JoinColumn(name="f3_region_id")
	private F3Region f3Region;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier")
	private ServicePoint servicePoint;

	public F3RegionServicePoint() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public F3Region getF3Region() {
		return this.f3Region;
	}

	public void setF3Region(F3Region f3Region) {
		this.f3Region = f3Region;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

}