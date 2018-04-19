package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the acl_object_identities database table.
 * 
 */
@Entity
@Table(name="acl_object_identities")
@NamedQuery(name="AclObjectIdentity.findAll", query="SELECT a FROM AclObjectIdentity a")
public class AclObjectIdentity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="class_id", nullable=false)
	private int classId;

	@Column(name="entries_inheriting", nullable=false)
	private byte entriesInheriting;

	@Column(name="object_identifier", nullable=false, length=100)
	private String objectIdentifier;

	//bi-directional many-to-one association to AclEntry
	@OneToMany(mappedBy="aclObjectIdentity")
	private List<AclEntry> aclEntries;

	//bi-directional many-to-one association to AclObjectIdentity
	@ManyToOne
	@JoinColumn(name="parent_object_identity_id")
	private AclObjectIdentity aclObjectIdentity;

	//bi-directional many-to-one association to AclObjectIdentity
	@OneToMany(mappedBy="aclObjectIdentity")
	private List<AclObjectIdentity> aclObjectIdentities1;

	//bi-directional many-to-many association to AclObjectIdentity
	@ManyToMany
	@JoinTable(
		name="acl_object_identity_ancestors"
		, joinColumns={
			@JoinColumn(name="ancestor_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="object_identity_id", nullable=false)
			}
		)
	private List<AclObjectIdentity> aclObjectIdentities2;

	//bi-directional many-to-many association to AclObjectIdentity
	@ManyToMany(mappedBy="aclObjectIdentities2")
	private List<AclObjectIdentity> aclObjectIdentities3;

	public AclObjectIdentity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public byte getEntriesInheriting() {
		return this.entriesInheriting;
	}

	public void setEntriesInheriting(byte entriesInheriting) {
		this.entriesInheriting = entriesInheriting;
	}

	public String getObjectIdentifier() {
		return this.objectIdentifier;
	}

	public void setObjectIdentifier(String objectIdentifier) {
		this.objectIdentifier = objectIdentifier;
	}

	public List<AclEntry> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntry> aclEntries) {
		this.aclEntries = aclEntries;
	}

	public AclEntry addAclEntry(AclEntry aclEntry) {
		getAclEntries().add(aclEntry);
		aclEntry.setAclObjectIdentity(this);

		return aclEntry;
	}

	public AclEntry removeAclEntry(AclEntry aclEntry) {
		getAclEntries().remove(aclEntry);
		aclEntry.setAclObjectIdentity(null);

		return aclEntry;
	}

	public AclObjectIdentity getAclObjectIdentity() {
		return this.aclObjectIdentity;
	}

	public void setAclObjectIdentity(AclObjectIdentity aclObjectIdentity) {
		this.aclObjectIdentity = aclObjectIdentity;
	}

	public List<AclObjectIdentity> getAclObjectIdentities1() {
		return this.aclObjectIdentities1;
	}

	public void setAclObjectIdentities1(List<AclObjectIdentity> aclObjectIdentities1) {
		this.aclObjectIdentities1 = aclObjectIdentities1;
	}

	public AclObjectIdentity addAclObjectIdentities1(AclObjectIdentity aclObjectIdentities1) {
		getAclObjectIdentities1().add(aclObjectIdentities1);
		aclObjectIdentities1.setAclObjectIdentity(this);

		return aclObjectIdentities1;
	}

	public AclObjectIdentity removeAclObjectIdentities1(AclObjectIdentity aclObjectIdentities1) {
		getAclObjectIdentities1().remove(aclObjectIdentities1);
		aclObjectIdentities1.setAclObjectIdentity(null);

		return aclObjectIdentities1;
	}

	public List<AclObjectIdentity> getAclObjectIdentities2() {
		return this.aclObjectIdentities2;
	}

	public void setAclObjectIdentities2(List<AclObjectIdentity> aclObjectIdentities2) {
		this.aclObjectIdentities2 = aclObjectIdentities2;
	}

	public List<AclObjectIdentity> getAclObjectIdentities3() {
		return this.aclObjectIdentities3;
	}

	public void setAclObjectIdentities3(List<AclObjectIdentity> aclObjectIdentities3) {
		this.aclObjectIdentities3 = aclObjectIdentities3;
	}

}