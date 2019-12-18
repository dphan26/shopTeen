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
@Table(name = "Provinces")
public class Province {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "ProvinceName", nullable = false)
	private String provinceName;
	
	@Column(name = "TransportFee", nullable = false)
	private float transportFee;

//	MAP
	
	@OneToMany(mappedBy="provinceId")
	private Set<District> lstDistrict;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public float getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(float transportFee) {
		this.transportFee = transportFee;
	}

	public Set<District> getLstDistrict() {
		return lstDistrict;
	}

	public void setLstDistrict(Set<District> lstDistrict) {
		this.lstDistrict = lstDistrict;
	}
	
	
	
	
}
