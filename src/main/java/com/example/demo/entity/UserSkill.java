package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_skills database table.
 * 
 */
@Entity
@Table(name="user_skills")
@NamedQuery(name="UserSkill.findAll", query="SELECT u FROM UserSkill u")
public class UserSkill implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(nullable=false)
	private int id;

	@Column(name="skill_id", nullable=false)
	private int skillId;

	@Column(name="user_id", nullable=false)
	private int userId;

	public UserSkill() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSkillId() {
		return this.skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}