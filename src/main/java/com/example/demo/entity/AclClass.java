package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the acl_classes database table.
 * 
 */
@Entity
@Table(name="acl_classes")
@NamedQuery(name="AclClass.findAll", query="SELECT a FROM AclClass a")
public class AclClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="class_type", nullable=false, length=200)
	private String classType;

	//bi-directional many-to-one association to AclEntry
	@OneToMany(mappedBy="aclClass")
	private List<AclEntry> aclEntries;

	public AclClass() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassType() {
		return this.classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public List<AclEntry> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntry> aclEntries) {
		this.aclEntries = aclEntries;
	}

	public AclEntry addAclEntry(AclEntry aclEntry) {
		getAclEntries().add(aclEntry);
		aclEntry.setAclClass(this);

		return aclEntry;
	}

	public AclEntry removeAclEntry(AclEntry aclEntry) {
		getAclEntries().remove(aclEntry);
		aclEntry.setAclClass(null);

		return aclEntry;
	}

}