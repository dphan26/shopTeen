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
@Table(name = "Sizes")
public class Size {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "SizeName", nullable = false)
	private String sizeName;
	
	@Column(name = "Position", nullable = false)
	private int position;

//	MAP
	
	@OneToMany(mappedBy="sizeId")
	private Set<ProductInformation> lstProductInformation;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Set<ProductInformation> getLstProductInformation() {
		return lstProductInformation;
	}

	public void setLstProductInformation(Set<ProductInformation> lstProductInformation) {
		this.lstProductInformation = lstProductInformation;
	}

	



	
	
}
