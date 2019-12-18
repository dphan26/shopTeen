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
@Table(name = "Colors")
public class Color {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "ColorName", nullable = false)
	private String colorName;
	
	@Column(name = "ColorCode", nullable = false)
	private String colorCode;
	
//	MAP
	
	@OneToMany(mappedBy="colorId")
	private Set<ProductInformation> lstColorProductInformation = null;

	
//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

//	public Set<ProductInformation> getLstColorProductInformation() {
//		return lstColorProductInformation;
//	}
//
//	public void setLstColorProductInformation(Set<ProductInformation> lstColorProductInformation) {
//		this.lstColorProductInformation = lstColorProductInformation;
//	}

	

	
	
	
	
}
