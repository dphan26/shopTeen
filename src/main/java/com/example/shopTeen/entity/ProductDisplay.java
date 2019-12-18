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
@Table(name = "ProductDisplays", uniqueConstraints = @UniqueConstraint(columnNames = { "ProductId" }))
public class ProductDisplay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	
	@Column(name = "Position", nullable = false)
	private int position;
	
	@Column(name = "IsActive", nullable = false)
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name = "ProductId", nullable = false)
	private Product productId;
	
	@ManyToOne
	@JoinColumn(name = "DisplayPositionId", nullable = false)
	private DisplayPosition displayPositionId;

	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public DisplayPosition getDisplayPositionId() {
		return displayPositionId;
	}

	public void setDisplayPositionId(DisplayPosition displayPositionId) {
		this.displayPositionId = displayPositionId;
	}

	




	
	
	
	
}


