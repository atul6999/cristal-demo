package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the synoptic_model database table.
 * 
 */
@Entity
@Table(name="synoptic_model")
@NamedQuery(name="SynopticModel.findAll", query="SELECT s FROM SynopticModel s")
public class SynopticModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to Synoptic
	@OneToMany(mappedBy="synopticModel")
	private List<Synoptic> synoptics;

	//bi-directional many-to-one association to SynopticModelRule
	@OneToMany(mappedBy="synopticModel")
	private List<SynopticModelRule> synopticModelRules;

	public SynopticModel() {
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

	public List<Synoptic> getSynoptics() {
		return this.synoptics;
	}

	public void setSynoptics(List<Synoptic> synoptics) {
		this.synoptics = synoptics;
	}

	public Synoptic addSynoptic(Synoptic synoptic) {
		getSynoptics().add(synoptic);
		synoptic.setSynopticModel(this);

		return synoptic;
	}

	public Synoptic removeSynoptic(Synoptic synoptic) {
		getSynoptics().remove(synoptic);
		synoptic.setSynopticModel(null);

		return synoptic;
	}

	public List<SynopticModelRule> getSynopticModelRules() {
		return this.synopticModelRules;
	}

	public void setSynopticModelRules(List<SynopticModelRule> synopticModelRules) {
		this.synopticModelRules = synopticModelRules;
	}

	public SynopticModelRule addSynopticModelRule(SynopticModelRule synopticModelRule) {
		getSynopticModelRules().add(synopticModelRule);
		synopticModelRule.setSynopticModel(this);

		return synopticModelRule;
	}

	public SynopticModelRule removeSynopticModelRule(SynopticModelRule synopticModelRule) {
		getSynopticModelRules().remove(synopticModelRule);
		synopticModelRule.setSynopticModel(null);

		return synopticModelRule;
	}

}