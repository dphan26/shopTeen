package com.example.shopTeen.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "UserRoles", uniqueConstraints = @UniqueConstraint(columnNames = { "UserId" }))
public class UserRole {
		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "UserId" , nullable = false)
	private TblUser userId;
	
	@ManyToOne
	@JoinColumn(name = "RoleId" , nullable = false)
	private Role roleId;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TblUser getUserId() {
		return userId;
	}

	public void setUserId(TblUser userId) {
		this.userId = userId;
	}

	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}

//	GETTER & SETTER
	


	
	
}
