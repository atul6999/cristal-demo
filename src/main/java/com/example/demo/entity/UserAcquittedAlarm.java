package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_acquitted_alarm database table.
 * 
 */
@Entity
@Table(name="user_acquitted_alarm")
@NamedQuery(name="UserAcquittedAlarm.findAll", query="SELECT u FROM UserAcquittedAlarm u")
public class UserAcquittedAlarm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="acquittment_date")
	private Date acquittmentDate;

	@Column(name="alarm_id", nullable=false)
	private int alarmId;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User user;

	public UserAcquittedAlarm() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAcquittmentDate() {
		return this.acquittmentDate;
	}

	public void setAcquittmentDate(Date acquittmentDate) {
		this.acquittmentDate = acquittmentDate;
	}

	public int getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(int alarmId) {
		this.alarmId = alarmId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}