package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the skill database table.
 * 
 */
@Entity
@Table(name="skill")
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_id", unique=true, nullable=false)
	private int skillId;

	@Column(name="skill_name", length=255)
	private String skillName;

	@Column(name="user_id")
	private int userId;

	//bi-directional many-to-many association to User
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST )
	@JoinColumn(name="skill_id", nullable=false, insertable=false, updatable=false)
	private List<User> users;

	public Skill() {
	}

	public Skill(String name) {
		this.skillName = name;
	}
	
	public Skill(String name,List<User> users) {
		this.skillName = name;
		this.users = null;
	}

	public int getSkillId() {
		return this.skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}