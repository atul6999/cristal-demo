package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the synoptic_model_rule database table.
 * 
 */
@Entity
@Table(name="synoptic_model_rule")
@NamedQuery(name="SynopticModelRule.findAll", query="SELECT s FROM SynopticModelRule s")
public class SynopticModelRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to SynopticRule
	@ManyToOne
	@JoinColumn(name="synoptic_rule_id")
	private SynopticRule synopticRule;

	//bi-directional many-to-one association to SynopticModel
	@ManyToOne
	@JoinColumn(name="synoptic_model_id")
	private SynopticModel synopticModel;

	public SynopticModelRule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SynopticRule getSynopticRule() {
		return this.synopticRule;
	}

	public void setSynopticRule(SynopticRule synopticRule) {
		this.synopticRule = synopticRule;
	}

	public SynopticModel getSynopticModel() {
		return this.synopticModel;
	}

	public void setSynopticModel(SynopticModel synopticModel) {
		this.synopticModel = synopticModel;
	}

}