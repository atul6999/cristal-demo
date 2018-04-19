package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the synoptic_rule database table.
 * 
 */
@Entity
@Table(name="synoptic_rule")
@NamedQuery(name="SynopticRule.findAll", query="SELECT s FROM SynopticRule s")
public class SynopticRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to SynopticModelRule
	@OneToMany(mappedBy="synopticRule")
	private List<SynopticModelRule> synopticModelRules;

	//bi-directional many-to-one association to SynopticComponentLibrary
	@ManyToOne
	@JoinColumn(name="synoptic_component_library_id")
	private SynopticComponentLibrary synopticComponentLibrary;

	public SynopticRule() {
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

	public List<SynopticModelRule> getSynopticModelRules() {
		return this.synopticModelRules;
	}

	public void setSynopticModelRules(List<SynopticModelRule> synopticModelRules) {
		this.synopticModelRules = synopticModelRules;
	}

	public SynopticModelRule addSynopticModelRule(SynopticModelRule synopticModelRule) {
		getSynopticModelRules().add(synopticModelRule);
		synopticModelRule.setSynopticRule(this);

		return synopticModelRule;
	}

	public SynopticModelRule removeSynopticModelRule(SynopticModelRule synopticModelRule) {
		getSynopticModelRules().remove(synopticModelRule);
		synopticModelRule.setSynopticRule(null);

		return synopticModelRule;
	}

	public SynopticComponentLibrary getSynopticComponentLibrary() {
		return this.synopticComponentLibrary;
	}

	public void setSynopticComponentLibrary(SynopticComponentLibrary synopticComponentLibrary) {
		this.synopticComponentLibrary = synopticComponentLibrary;
	}

}