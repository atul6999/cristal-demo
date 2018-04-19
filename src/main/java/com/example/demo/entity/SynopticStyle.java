package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the synoptic_style database table.
 * 
 */
@Entity
@Table(name="synoptic_style")
@NamedQuery(name="SynopticStyle.findAll", query="SELECT s FROM SynopticStyle s")
public class SynopticStyle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String label;

	@Column(length=255)
	private String value;

	//bi-directional many-to-one association to SynopticDictionary
	@OneToMany(mappedBy="synopticStyle")
	private List<SynopticDictionary> synopticDictionaries;

	public SynopticStyle() {
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<SynopticDictionary> getSynopticDictionaries() {
		return this.synopticDictionaries;
	}

	public void setSynopticDictionaries(List<SynopticDictionary> synopticDictionaries) {
		this.synopticDictionaries = synopticDictionaries;
	}

	public SynopticDictionary addSynopticDictionary(SynopticDictionary synopticDictionary) {
		getSynopticDictionaries().add(synopticDictionary);
		synopticDictionary.setSynopticStyle(this);

		return synopticDictionary;
	}

	public SynopticDictionary removeSynopticDictionary(SynopticDictionary synopticDictionary) {
		getSynopticDictionaries().remove(synopticDictionary);
		synopticDictionary.setSynopticStyle(null);

		return synopticDictionary;
	}

}