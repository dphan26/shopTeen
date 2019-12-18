package com.example.shopTeen.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StatusProducts")
public class StatusProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "StatusName", nullable = false)
	private String statusName;

//	MAP
	
	@OneToMany(mappedBy="statusId")
	private Set<Product> lstProduct;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Set<Product> getLstProduct() {
		return lstProduct;
	}

	public void setLstProduct(Set<Product> lstProduct) {
		this.lstProduct = lstProduct;
	}
	
	
}
