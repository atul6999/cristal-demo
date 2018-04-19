package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the link_event_type database table.
 * 
 */
@Entity
@Table(name="link_event_type")
@NamedQuery(name="LinkEventType.findAll", query="SELECT l FROM LinkEventType l")
public class LinkEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to EventType
	@ManyToOne
	@JoinColumn(name="event_type_identifier")
	private EventType eventType;

	//bi-directional many-to-one association to Link
	@ManyToOne
	@JoinColumn(name="link_id")
	private Link link;

	public LinkEventType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EventType getEventType() {
		return this.eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public Link getLink() {
		return this.link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

}