package com.example.shopTeen.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Roles", uniqueConstraints = @UniqueConstraint(columnNames = { "RoleName" }))
public class Role{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "RoleName", nullable = false)
	private String roleName;
	
//	MAP	
	@OneToMany(mappedBy="roleId")
	private Set<UserRole> lstUserRole;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserRole> getLstUserRole() {
		return lstUserRole;
	}

	public void setLstUserRole(Set<UserRole> lstUserRole) {
		this.lstUserRole = lstUserRole;
	}

//	GETTER & SETTER
	

	
	
	
	
}
