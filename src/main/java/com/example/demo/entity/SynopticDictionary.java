package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the synoptic_dictionary database table.
 * 
 */
@Entity
@Table(name="synoptic_dictionary")
@NamedQuery(name="SynopticDictionary.findAll", query="SELECT s FROM SynopticDictionary s")
public class SynopticDictionary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="current_value", length=255)
	private String currentValue;

	//bi-directional many-to-one association to SynopticComponentLibrary
	@ManyToOne
	@JoinColumn(name="synoptic_component_library_id")
	private SynopticComponentLibrary synopticComponentLibrary;

	//bi-directional many-to-one association to SynopticStyle
	@ManyToOne
	@JoinColumn(name="synoptic_style_id")
	private SynopticStyle synopticStyle;

	//bi-directional many-to-one association to EventType
	@ManyToOne
	@JoinColumn(name="event_type_identifier")
	private EventType eventType;

	public SynopticDictionary() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	public SynopticComponentLibrary getSynopticComponentLibrary() {
		return this.synopticComponentLibrary;
	}

	public void setSynopticComponentLibrary(SynopticComponentLibrary synopticComponentLibrary) {
		this.synopticComponentLibrary = synopticComponentLibrary;
	}

	public SynopticStyle getSynopticStyle() {
		return this.synopticStyle;
	}

	public void setSynopticStyle(SynopticStyle synopticStyle) {
		this.synopticStyle = synopticStyle;
	}

	public EventType getEventType() {
		return this.eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

}