package com.example.shopTeen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProductInformations")
public class ProductInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
		
	@Column(name = "ProductCode", nullable = true)
	private String ProductCode;
	
	@Column(name = "QuantityStock", nullable = false)
	private int quantityStock;
//	FOREIGN KEY

	@ManyToOne
	@JoinColumn(name = "ProductId", nullable = false)
	private Product productId;
	
	@ManyToOne
	@JoinColumn(name = "SizeId", nullable = false)
	private Size sizeId;
	
	
	@ManyToOne
	
	@JoinColumn(name = "ColorId", nullable = false)
	private Color colorId;

	
//	GETTER & SETTER
	
	

	public int getId() {
		return id;
	}

	




	public Color getColorId() {
		return colorId;
	}






	public void setColorId(Color colorId) {
		this.colorId = colorId;
	}






	public void setId(int id) {
		this.id = id;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Size getSizeId() {
		return sizeId;
	}

	public void setSizeId(Size sizeId) {
		this.sizeId = sizeId;
	}






	public int getQuantityStock() {
		return quantityStock;
	}






	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}


	


	
	



	
	
	
	
}
