package com.example.shopTeen.entity;

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

@Entity
@Table(name = "Districts")
public class District {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	@Column(name = "DistrictName", nullable = false)
	private String districtName;
	
//	MAP
	
	@OneToMany(mappedBy="districtId")
	private Set<Order> lstOrder;
	
//	FOREIGN KEY
	
	@ManyToOne
	@JoinColumn(name = "ProvinceId" , nullable = false)
	private Province provinceId;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Set<Order> getLstOrder() {
		return lstOrder;
	}

	public void setLstOrder(Set<Order> lstOrder) {
		this.lstOrder = lstOrder;
	}

	public Province getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Province provinceId) {
		this.provinceId = provinceId;
	}
	
	
}
