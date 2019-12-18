package com.example.shopTeen.entity;


import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "TblUsers", uniqueConstraints = @UniqueConstraint(columnNames = { "email","userName" }))
public class TblUser   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "UserName", nullable = false)
	private String userName;
	
	@Column(name = "FullName", nullable = false)
	private String fullName;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Column(name = "Password", nullable = false)
	private String password;
	
	@Column(name = "RegisterDate", nullable = false)
	private Date registerDate;
	
	@Column(name = "LastLogin", nullable = false)
	private Date lastLogin;
	
	@Column(name = "BirthDay", nullable = true)
	private Date birthDay;
		
	@Column(name = "Phone", nullable = true)
	private String phone;
	
	@Column(name = "Address", nullable = true)
	private String address;
	
	@Column(name = "ImageUrl", nullable = true)
	private String imageUrl;

	
//	MAP
	
	@OneToMany(mappedBy="userId")
	private Set<UserRole> lstUserRole;
	
	@OneToMany(mappedBy="orderById")
	private Set<Order> lstOrder;
	
	@OneToMany(mappedBy="postById")
	private Set<Product> lstProduct;
	
//	FOREIGN KEY
	
	@ManyToOne
	@JoinColumn(name = "GenderId", nullable = true)
	private Gender genderId;
	
	@ManyToOne
	@JoinColumn(name = "StatusId", nullable = false)
	private StatusUser statusId;

	
	
	// Spring Security
//	private Set<Role> roles;


	
//	GETTER & SETTER
	
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	

	public Set<UserRole> getLstUserRole() {
		return lstUserRole;
	}

	public void setLstUserRole(Set<UserRole> lstUserRole) {
		this.lstUserRole = lstUserRole;
	}

	public Set<Order> getLstOrder() {
		return lstOrder;
	}

	public void setLstOrder(Set<Order> lstOrder) {
		this.lstOrder = lstOrder;
	}

	public Set<Product> getLstProduct() {
		return lstProduct;
	}

	public void setLstProduct(Set<Product> lstProduct) {
		this.lstProduct = lstProduct;
	}

	public Gender getGenderId() {
		return genderId;
	}

	public void setGenderId(Gender genderId) {
		this.genderId = genderId;
	}

	public StatusUser getStatusId() {
		return statusId;
	}

	public void setStatusId(StatusUser statusId) {
		this.statusId = statusId;
	}
	
	

}
