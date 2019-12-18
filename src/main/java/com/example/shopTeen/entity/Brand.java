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
@Table(name = "Brands")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "BrandName", nullable = false)
	private String brandName;
	
	@Column(name = "ImageUrl", nullable = true)
	private String imageUrl;
	
	
//	MAP
	
	@OneToMany(mappedBy="brandId")
	private Set<Product> lstProduct;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public Set<Product> getLstProduct() {
		return lstProduct;
	}


	public void setLstProduct(Set<Product> lstProduct) {
		this.lstProduct = lstProduct;
	}
	
	
	
	
}
