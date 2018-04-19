package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the monitoring_equipment database table.
 * 
 */
@Entity
@Table(name="monitoring_equipment")
@NamedQuery(name="MonitoringEquipment.findAll", query="SELECT m FROM MonitoringEquipment m")
public class MonitoringEquipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String IP_address;

	//bi-directional many-to-one association to ServicePoint
	@OneToMany(mappedBy="monitoringEquipment")
	private List<ServicePoint> servicePoints;

	public MonitoringEquipment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIP_address() {
		return this.IP_address;
	}

	public void setIP_address(String IP_address) {
		this.IP_address = IP_address;
	}

	public List<ServicePoint> getServicePoints() {
		return this.servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	public ServicePoint addServicePoint(ServicePoint servicePoint) {
		getServicePoints().add(servicePoint);
		servicePoint.setMonitoringEquipment(this);

		return servicePoint;
	}

	public ServicePoint removeServicePoint(ServicePoint servicePoint) {
		getServicePoints().remove(servicePoint);
		servicePoint.setMonitoringEquipment(null);

		return servicePoint;
	}

}