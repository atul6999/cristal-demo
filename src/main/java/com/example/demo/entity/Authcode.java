package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the authcode database table.
 * 
 */
@Entity
@Table(name="authcode")
@NamedQuery(name="Authcode.findAll", query="SELECT a FROM Authcode a")
public class Authcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="expires_at")
	private int expiresAt;

	@Lob
	@Column(name="redirect_uri", nullable=false)
	private String redirectUri;

	@Column(length=255)
	private String scope;

	@Column(nullable=false, length=255)
	private String token;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="client_id", nullable=false)
	private Client client;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Authcode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(int expiresAt) {
		this.expiresAt = expiresAt;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}