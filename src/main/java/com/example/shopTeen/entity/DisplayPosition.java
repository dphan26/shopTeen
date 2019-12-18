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
@Table(name = "DisplayPositions")
public class DisplayPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "DisplayLabel", nullable = false)
	private String displayLabel;
	
	@Column(name = "DisplayName", nullable = false)
	private String displayName;
	
	@Column(name = "Position", nullable = false)
	private int position;
	
	@Column(name = "IsActive", nullable = false)
	private boolean isActive;
	
	
//	MAP
	
	@OneToMany(mappedBy="displayPositionId")
	private Set<ProductDisplay> lstProductDisplays;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDisplayLabel() {
		return displayLabel;
	}


	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public Set<ProductDisplay> getLstProductDisplays() {
		return lstProductDisplays;
	}


	public void setLstProductDisplays(Set<ProductDisplay> lstProductDisplays) {
		this.lstProductDisplays = lstProductDisplays;
	}


	
	
	
	
}



