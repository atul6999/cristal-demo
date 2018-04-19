package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the remedy_ticket database table.
 * 
 */
@Entity
@Table(name="remedy_ticket")
@NamedQuery(name="RemedyTicket.findAll", query="SELECT r FROM RemedyTicket r")
public class RemedyTicket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=60)
	private String category;

	@Column(name="customer_cr", length=9000)
	private String customerCr;

	@Column(name="customer_name", length=30)
	private String customerName;

	@Column(name="customer_visible", length=10)
	private String customerVisible;

	@Column(length=3200)
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_date", nullable=false)
	private Date endDate;

	@Column(name="first_name", length=30)
	private String firstName;

	@Column(length=30)
	private String impact;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modification")
	private Date lastModification;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_resolution")
	private Date lastResolution;

	@Column(name="long_description", length=9000)
	private String longDescription;

	@Column(length=10)
	private String priority;

	@Column(length=254)
	private String reporter;

	@Column(name="service_point_id_esther", nullable=false, length=15)
	private String servicePointIdEsther;

	@Column(name="service_point_name", nullable=false, length=30)
	private String servicePointName;

	@Column(length=10)
	private String severity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date")
	private Date startDate;

	@Column(length=15)
	private String state;

	@Column(name="tdf_status", length=60)
	private String tdfStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tdf_to")
	private Date tdfTo;

	@Column(name="ticket_number", nullable=false, length=15)
	private String ticketNumber;

	@Column(length=10)
	private String validity;

	public RemedyTicket() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCustomerCr() {
		return this.customerCr;
	}

	public void setCustomerCr(String customerCr) {
		this.customerCr = customerCr;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerVisible() {
		return this.customerVisible;
	}

	public void setCustomerVisible(String customerVisible) {
		this.customerVisible = customerVisible;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getImpact() {
		return this.impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public Date getLastModification() {
		return this.lastModification;
	}

	public void setLastModification(Date lastModification) {
		this.lastModification = lastModification;
	}

	public Date getLastResolution() {
		return this.lastResolution;
	}

	public void setLastResolution(Date lastResolution) {
		this.lastResolution = lastResolution;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getReporter() {
		return this.reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getServicePointIdEsther() {
		return this.servicePointIdEsther;
	}

	public void setServicePointIdEsther(String servicePointIdEsther) {
		this.servicePointIdEsther = servicePointIdEsther;
	}

	public String getServicePointName() {
		return this.servicePointName;
	}

	public void setServicePointName(String servicePointName) {
		this.servicePointName = servicePointName;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTdfStatus() {
		return this.tdfStatus;
	}

	public void setTdfStatus(String tdfStatus) {
		this.tdfStatus = tdfStatus;
	}

	public Date getTdfTo() {
		return this.tdfTo;
	}

	public void setTdfTo(Date tdfTo) {
		this.tdfTo = tdfTo;
	}

	public String getTicketNumber() {
		return this.ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getValidity() {
		return this.validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

}