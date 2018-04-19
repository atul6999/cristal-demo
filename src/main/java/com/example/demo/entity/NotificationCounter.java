package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notification_counter database table.
 * 
 */
@Entity
@Table(name="notification_counter")
@NamedQuery(name="NotificationCounter.findAll", query="SELECT n FROM NotificationCounter n")
public class NotificationCounter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="current_value", nullable=false)
	private int currentValue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_date", nullable=false)
	private Date endDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exceeding_date")
	private Date exceedingDate;

	@Column(name="notification_type", nullable=false, length=10)
	private String notificationType;

	@Column(nullable=false, length=10)
	private String periodicity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date", nullable=false)
	private Date startDate;

	public NotificationCounter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getExceedingDate() {
		return this.exceedingDate;
	}

	public void setExceedingDate(Date exceedingDate) {
		this.exceedingDate = exceedingDate;
	}

	public String getNotificationType() {
		return this.notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getPeriodicity() {
		return this.periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}