package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the synoptic_component_library database table.
 * 
 */
@Entity
@Table(name="synoptic_component_library")
@NamedQuery(name="SynopticComponentLibrary.findAll", query="SELECT s FROM SynopticComponentLibrary s")
public class SynopticComponentLibrary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="is_link", nullable=false)
	private byte isLink;

	@Column(length=255)
	private String label;

	@Column(name="svg_file", length=255)
	private String svgFile;

	@Column(length=10)
	private String version;

	//bi-directional many-to-one association to SynopticComponent
	@OneToMany(mappedBy="synopticComponentLibrary")
	private List<SynopticComponent> synopticComponents;

	//bi-directional many-to-one association to SynopticDictionary
	@OneToMany(mappedBy="synopticComponentLibrary")
	private List<SynopticDictionary> synopticDictionaries;

	//bi-directional many-to-one association to SynopticRule
	@OneToMany(mappedBy="synopticComponentLibrary")
	private List<SynopticRule> synopticRules;

	public SynopticComponentLibrary() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsLink() {
		return this.isLink;
	}

	public void setIsLink(byte isLink) {
		this.isLink = isLink;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSvgFile() {
		return this.svgFile;
	}

	public void setSvgFile(String svgFile) {
		this.svgFile = svgFile;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<SynopticComponent> getSynopticComponents() {
		return this.synopticComponents;
	}

	public void setSynopticComponents(List<SynopticComponent> synopticComponents) {
		this.synopticComponents = synopticComponents;
	}

	public SynopticComponent addSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().add(synopticComponent);
		synopticComponent.setSynopticComponentLibrary(this);

		return synopticComponent;
	}

	public SynopticComponent removeSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().remove(synopticComponent);
		synopticComponent.setSynopticComponentLibrary(null);

		return synopticComponent;
	}

	public List<SynopticDictionary> getSynopticDictionaries() {
		return this.synopticDictionaries;
	}

	public void setSynopticDictionaries(List<SynopticDictionary> synopticDictionaries) {
		this.synopticDictionaries = synopticDictionaries;
	}

	public SynopticDictionary addSynopticDictionary(SynopticDictionary synopticDictionary) {
		getSynopticDictionaries().add(synopticDictionary);
		synopticDictionary.setSynopticComponentLibrary(this);

		return synopticDictionary;
	}

	public SynopticDictionary removeSynopticDictionary(SynopticDictionary synopticDictionary) {
		getSynopticDictionaries().remove(synopticDictionary);
		synopticDictionary.setSynopticComponentLibrary(null);

		return synopticDictionary;
	}

	public List<SynopticRule> getSynopticRules() {
		return this.synopticRules;
	}

	public void setSynopticRules(List<SynopticRule> synopticRules) {
		this.synopticRules = synopticRules;
	}

	public SynopticRule addSynopticRule(SynopticRule synopticRule) {
		getSynopticRules().add(synopticRule);
		synopticRule.setSynopticComponentLibrary(this);

		return synopticRule;
	}

	public SynopticRule removeSynopticRule(SynopticRule synopticRule) {
		getSynopticRules().remove(synopticRule);
		synopticRule.setSynopticComponentLibrary(null);

		return synopticRule;
	}

}