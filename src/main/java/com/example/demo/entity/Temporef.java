package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the temporef database table.
 * 
 */
@Entity
@Table(name="temporef")
@NamedQuery(name="Temporef.findAll", query="SELECT t FROM Temporef t")
public class Temporef implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="external_desc", length=255)
	private String externalDesc;

	@Column(length=255)
	private String identifier;

	public Temporef() {
	}

	public String getExternalDesc() {
		return this.externalDesc;
	}

	public void setExternalDesc(String externalDesc) {
		this.externalDesc = externalDesc;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

}