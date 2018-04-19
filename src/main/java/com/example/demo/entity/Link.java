package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the link database table.
 * 
 */
@Entity
@Table(name="link")
@NamedQuery(name="Link.findAll", query="SELECT l FROM Link l")
public class Link implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String filename;

	@Column(nullable=false, length=255)
	private String name;

	//bi-directional many-to-one association to LinkEventType
	@OneToMany(mappedBy="link")
	private List<LinkEventType> linkEventTypes;

	//bi-directional many-to-one association to LinkProfile
	@OneToMany(mappedBy="link")
	private List<LinkProfile> linkProfiles;

	//bi-directional many-to-one association to LinkResource
	@OneToMany(mappedBy="link")
	private List<LinkResource> linkResources;

	public Link() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LinkEventType> getLinkEventTypes() {
		return this.linkEventTypes;
	}

	public void setLinkEventTypes(List<LinkEventType> linkEventTypes) {
		this.linkEventTypes = linkEventTypes;
	}

	public LinkEventType addLinkEventType(LinkEventType linkEventType) {
		getLinkEventTypes().add(linkEventType);
		linkEventType.setLink(this);

		return linkEventType;
	}

	public LinkEventType removeLinkEventType(LinkEventType linkEventType) {
		getLinkEventTypes().remove(linkEventType);
		linkEventType.setLink(null);

		return linkEventType;
	}

	public List<LinkProfile> getLinkProfiles() {
		return this.linkProfiles;
	}

	public void setLinkProfiles(List<LinkProfile> linkProfiles) {
		this.linkProfiles = linkProfiles;
	}

	public LinkProfile addLinkProfile(LinkProfile linkProfile) {
		getLinkProfiles().add(linkProfile);
		linkProfile.setLink(this);

		return linkProfile;
	}

	public LinkProfile removeLinkProfile(LinkProfile linkProfile) {
		getLinkProfiles().remove(linkProfile);
		linkProfile.setLink(null);

		return linkProfile;
	}

	public List<LinkResource> getLinkResources() {
		return this.linkResources;
	}

	public void setLinkResources(List<LinkResource> linkResources) {
		this.linkResources = linkResources;
	}

	public LinkResource addLinkResource(LinkResource linkResource) {
		getLinkResources().add(linkResource);
		linkResource.setLink(this);

		return linkResource;
	}

	public LinkResource removeLinkResource(LinkResource linkResource) {
		getLinkResources().remove(linkResource);
		linkResource.setLink(null);

		return linkResource;
	}

}