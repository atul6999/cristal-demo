package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the remedy_incident_type database table.
 * 
 */
@Entity
@Table(name="remedy_incident_type")
@NamedQuery(name="RemedyIncidentType.findAll", query="SELECT r FROM RemedyIncidentType r")
public class RemedyIncidentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=100)
	private String name;

	public RemedyIncidentType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}