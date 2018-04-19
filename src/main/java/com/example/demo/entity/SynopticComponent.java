package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the synoptic_component database table.
 * 
 */
@Entity
@Table(name="synoptic_component")
@NamedQuery(name="SynopticComponent.findAll", query="SELECT s FROM SynopticComponent s")
public class SynopticComponent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int height;

	@Column(name="image_file", length=255)
	private String imageFile;

	@Column(length=255)
	private String label;

	@Column(length=255)
	private String param;

	@Column(name="pos_x")
	private int posX;

	@Column(name="pos_y")
	private int posY;

	private int style;

	private int width;

	//bi-directional many-to-one association to Resource
	@ManyToOne
	@JoinColumn(name="resource_identifier")
	private Resource resource;

	//bi-directional many-to-one association to SynopticComponentLibrary
	@ManyToOne
	@JoinColumn(name="synoptic_component_library_id")
	private SynopticComponentLibrary synopticComponentLibrary;

	//bi-directional many-to-one association to ServicePoint
	@ManyToOne
	@JoinColumn(name="service_point_identifier")
	private ServicePoint servicePoint;

	//bi-directional many-to-one association to Synoptic
	@ManyToOne
	@JoinColumn(name="synoptic_id", nullable=false)
	private Synoptic synoptic;

	public SynopticComponent() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getImageFile() {
		return this.imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public int getPosX() {
		return this.posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return this.posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getStyle() {
		return this.style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public SynopticComponentLibrary getSynopticComponentLibrary() {
		return this.synopticComponentLibrary;
	}

	public void setSynopticComponentLibrary(SynopticComponentLibrary synopticComponentLibrary) {
		this.synopticComponentLibrary = synopticComponentLibrary;
	}

	public ServicePoint getServicePoint() {
		return this.servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	public Synoptic getSynoptic() {
		return this.synoptic;
	}

	public void setSynoptic(Synoptic synoptic) {
		this.synoptic = synoptic;
	}

}