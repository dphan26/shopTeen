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
@Table(name = "Pictures")
public class Picture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
		
	@Column(name = "ImageUrl", nullable = false)
	private String imageUrl;
	
	@Column(name = "Position", nullable = true)
	private int position;
	
	
//	MAP
	
	@OneToMany(mappedBy="pictureId")
	private Set<Product> lstProduct;
	
//	FOREIGN KEY
	
	@ManyToOne
	@JoinColumn(name = "ProductId" , nullable = false)
	private Product productId;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Set<Product> getLstProduct() {
		return lstProduct;
	}

	public void setLstProduct(Set<Product> lstProduct) {
		this.lstProduct = lstProduct;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}
	
	
	
}
