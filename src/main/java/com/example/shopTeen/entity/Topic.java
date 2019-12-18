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
@Table(name = "Topics")
public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "TopicName", nullable = false)
	private String topicName;
	
	@Column(name = "ImageUrl", nullable = true)
	private String imageUrl;
	
//	MAP
	
	@OneToMany(mappedBy="topicId")
	private Set<Category> lstCategory;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Set<Category> getLstCategory() {
		return lstCategory;
	}

	public void setLstCategory(Set<Category> lstCategory) {
		this.lstCategory = lstCategory;
	}

	
	
	
}
