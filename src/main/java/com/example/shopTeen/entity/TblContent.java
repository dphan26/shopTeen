package com.example.shopTeen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblContents")
public class TblContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "ContentDisplay", nullable = true)
	private String contentDisplay;
	
	@Column(name = "ContentName", nullable = true)
	private String contentName;
	
	@Column(name = "ContentValue", nullable = true)
	private String contentValue;
	
	@Column(name = "ContentLabel", nullable = true)
	private String contentLabel;
	
	@Column(name = "ContentNote", nullable = true)
	private String contentNote;
	
	@Column(name = "Position", nullable = false)
	private int position;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContentDisplay() {
		return contentDisplay;
	}

	public void setContentDisplay(String contentDisplay) {
		this.contentDisplay = contentDisplay;
	}

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public String getContentValue() {
		return contentValue;
	}

	public void setContentValue(String contentValue) {
		this.contentValue = contentValue;
	}

	public String getContentLabel() {
		return contentLabel;
	}

	public void setContentLabel(String contentLabel) {
		this.contentLabel = contentLabel;
	}

	public String getContentNote() {
		return contentNote;
	}

	public void setContentNote(String contentNote) {
		this.contentNote = contentNote;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
}



