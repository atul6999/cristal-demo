package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Lob
	@Column(name="allowed_grant_types", nullable=false)
	private String allowedGrantTypes;

	@Column(name="random_id", nullable=false, length=255)
	private String randomId;

	@Lob
	@Column(name="redirect_uris", nullable=false)
	private String redirectUris;

	@Column(nullable=false, length=255)
	private String secret;

	//bi-directional many-to-one association to Accesstoken
	@OneToMany(mappedBy="client")
	private List<Accesstoken> accesstokens;

	//bi-directional many-to-one association to Authcode
	@OneToMany(mappedBy="client")
	private List<Authcode> authcodes;

	//bi-directional many-to-one association to Refreshtoken
	@OneToMany(mappedBy="client")
	private List<Refreshtoken> refreshtokens;

	public Client() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAllowedGrantTypes() {
		return this.allowedGrantTypes;
	}

	public void setAllowedGrantTypes(String allowedGrantTypes) {
		this.allowedGrantTypes = allowedGrantTypes;
	}

	public String getRandomId() {
		return this.randomId;
	}

	public void setRandomId(String randomId) {
		this.randomId = randomId;
	}

	public String getRedirectUris() {
		return this.redirectUris;
	}

	public void setRedirectUris(String redirectUris) {
		this.redirectUris = redirectUris;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public List<Accesstoken> getAccesstokens() {
		return this.accesstokens;
	}

	public void setAccesstokens(List<Accesstoken> accesstokens) {
		this.accesstokens = accesstokens;
	}

	public Accesstoken addAccesstoken(Accesstoken accesstoken) {
		getAccesstokens().add(accesstoken);
		accesstoken.setClient(this);

		return accesstoken;
	}

	public Accesstoken removeAccesstoken(Accesstoken accesstoken) {
		getAccesstokens().remove(accesstoken);
		accesstoken.setClient(null);

		return accesstoken;
	}

	public List<Authcode> getAuthcodes() {
		return this.authcodes;
	}

	public void setAuthcodes(List<Authcode> authcodes) {
		this.authcodes = authcodes;
	}

	public Authcode addAuthcode(Authcode authcode) {
		getAuthcodes().add(authcode);
		authcode.setClient(this);

		return authcode;
	}

	public Authcode removeAuthcode(Authcode authcode) {
		getAuthcodes().remove(authcode);
		authcode.setClient(null);

		return authcode;
	}

	public List<Refreshtoken> getRefreshtokens() {
		return this.refreshtokens;
	}

	public void setRefreshtokens(List<Refreshtoken> refreshtokens) {
		this.refreshtokens = refreshtokens;
	}

	public Refreshtoken addRefreshtoken(Refreshtoken refreshtoken) {
		getRefreshtokens().add(refreshtoken);
		refreshtoken.setClient(this);

		return refreshtoken;
	}

	public Refreshtoken removeRefreshtoken(Refreshtoken refreshtoken) {
		getRefreshtokens().remove(refreshtoken);
		refreshtoken.setClient(null);

		return refreshtoken;
	}

}