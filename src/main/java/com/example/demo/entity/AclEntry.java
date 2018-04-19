package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acl_entries database table.
 * 
 */
@Entity
@Table(name="acl_entries")
@NamedQuery(name="AclEntry.findAll", query="SELECT a FROM AclEntry a")
public class AclEntry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="ace_order", nullable=false)
	private int aceOrder;

	@Column(name="audit_failure", nullable=false)
	private byte auditFailure;

	@Column(name="audit_success", nullable=false)
	private byte auditSuccess;

	@Column(name="field_name", length=50)
	private String fieldName;

	@Column(nullable=false)
	private byte granting;

	@Column(name="granting_strategy", nullable=false, length=30)
	private String grantingStrategy;

	@Column(nullable=false)
	private int mask;

	//bi-directional many-to-one association to AclObjectIdentity
	@ManyToOne
	@JoinColumn(name="object_identity_id")
	private AclObjectIdentity aclObjectIdentity;

	//bi-directional many-to-one association to AclSecurityIdentity
	@ManyToOne
	@JoinColumn(name="security_identity_id", nullable=false)
	private AclSecurityIdentity aclSecurityIdentity;

	//bi-directional many-to-one association to AclClass
	@ManyToOne
	@JoinColumn(name="class_id", nullable=false)
	private AclClass aclClass;

	public AclEntry() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAceOrder() {
		return this.aceOrder;
	}

	public void setAceOrder(int aceOrder) {
		this.aceOrder = aceOrder;
	}

	public byte getAuditFailure() {
		return this.auditFailure;
	}

	public void setAuditFailure(byte auditFailure) {
		this.auditFailure = auditFailure;
	}

	public byte getAuditSuccess() {
		return this.auditSuccess;
	}

	public void setAuditSuccess(byte auditSuccess) {
		this.auditSuccess = auditSuccess;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public byte getGranting() {
		return this.granting;
	}

	public void setGranting(byte granting) {
		this.granting = granting;
	}

	public String getGrantingStrategy() {
		return this.grantingStrategy;
	}

	public void setGrantingStrategy(String grantingStrategy) {
		this.grantingStrategy = grantingStrategy;
	}

	public int getMask() {
		return this.mask;
	}

	public void setMask(int mask) {
		this.mask = mask;
	}

	public AclObjectIdentity getAclObjectIdentity() {
		return this.aclObjectIdentity;
	}

	public void setAclObjectIdentity(AclObjectIdentity aclObjectIdentity) {
		this.aclObjectIdentity = aclObjectIdentity;
	}

	public AclSecurityIdentity getAclSecurityIdentity() {
		return this.aclSecurityIdentity;
	}

	public void setAclSecurityIdentity(AclSecurityIdentity aclSecurityIdentity) {
		this.aclSecurityIdentity = aclSecurityIdentity;
	}

	public AclClass getAclClass() {
		return this.aclClass;
	}

	public void setAclClass(AclClass aclClass) {
		this.aclClass = aclClass;
	}

}