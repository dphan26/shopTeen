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
@Table(name = "Categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "CategoryName", nullable = false)
	private String categoryName;

	@Column(name = "ImageUrl", nullable = true)
	private String imageUrl;
	
	@Column(name = "Discount", nullable = true)
	private float discount;
	
	
//  MAP
	
	@OneToMany(mappedBy="categoryId")
	private Set<ProductCategory> lstProductCategory;
	
//  FOREIGN KEY
	
	@ManyToOne
	@JoinColumn(name = "TopicId" , nullable = false)
	private Topic topicId;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Set<ProductCategory> getLstProductCategory() {
		return lstProductCategory;
	}

	public void setLstProductCategory(Set<ProductCategory> lstProductCategory) {
		this.lstProductCategory = lstProductCategory;
	}

	public Topic getTopicId() {
		return topicId;
	}

	public void setTopicId(Topic topicId) {
		this.topicId = topicId;
	}
	

	
	
}
