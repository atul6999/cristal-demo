package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the link_resource database table.
 * 
 */
@Entity
@Table(name="link_resource")
@NamedQuery(name="LinkResource.findAll", query="SELECT l FROM LinkResource l")
public class LinkResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Resource
	@ManyToOne
	@JoinColumn(name="resource_identifier")
	private Resource resource;

	//bi-directional many-to-one association to Link
	@ManyToOne
	@JoinColumn(name="link_id")
	private Link link;

	public LinkResource() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Link getLink() {
		return this.link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

}