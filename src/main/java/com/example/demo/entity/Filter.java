package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the filter database table.
 * 
 */
@Entity
@Table(name="filter")
@NamedQuery(name="Filter.findAll", query="SELECT f FROM Filter f")
public class Filter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String label;

	@Column(nullable=false, length=255)
	private String name;

	@Column(nullable=false)
	private int visibility;

	public Filter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVisibility() {
		return this.visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

}