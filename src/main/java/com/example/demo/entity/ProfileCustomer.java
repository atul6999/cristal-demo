package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile_customer database table.
 * 
 */
@Entity
@Table(name="profile_customer")
@NamedQuery(name="ProfileCustomer.findAll", query="SELECT p FROM ProfileCustomer p")
public class ProfileCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customer_identifier", nullable=false)
	private Customer customer;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id", nullable=false)
	private Profile profile;

	public ProfileCustomer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}