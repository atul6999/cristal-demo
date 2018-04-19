package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the acl_security_identities database table.
 * 
 */
@Entity
@Table(name="acl_security_identities")
@NamedQuery(name="AclSecurityIdentity.findAll", query="SELECT a FROM AclSecurityIdentity a")
public class AclSecurityIdentity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=200)
	private String identifier;

	@Column(nullable=false)
	private byte username;

	//bi-directional many-to-one association to AclEntry
	@OneToMany(mappedBy="aclSecurityIdentity")
	private List<AclEntry> aclEntries;

	public AclSecurityIdentity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public byte getUsername() {
		return this.username;
	}

	public void setUsername(byte username) {
		this.username = username;
	}

	public List<AclEntry> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntry> aclEntries) {
		this.aclEntries = aclEntries;
	}

	public AclEntry addAclEntry(AclEntry aclEntry) {
		getAclEntries().add(aclEntry);
		aclEntry.setAclSecurityIdentity(this);

		return aclEntry;
	}

	public AclEntry removeAclEntry(AclEntry aclEntry) {
		getAclEntries().remove(aclEntry);
		aclEntry.setAclSecurityIdentity(null);

		return aclEntry;
	}

}