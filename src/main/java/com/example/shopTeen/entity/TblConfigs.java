package com.example.shopTeen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblConfigs")
public class TblConfigs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "ConfigName", nullable = false)
	private String configName;
	
	@Column(name = "ConfigDisplay", nullable = true)
	private String configDisplay;
	
	@Column(name = "ConfigValue", nullable = true)
	private String configValue;
	
	@Column(name = "ConfigLabel", nullable = true)
	private String configLabel;
	
	@Column(name = "ConfigNote", nullable = true)
	private String configNote;
	
	@Column(name = "Position", nullable = true)
	private int position;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfigDisplay() {
		return configDisplay;
	}

	public void setConfigDisplay(String configDisplay) {
		this.configDisplay = configDisplay;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public String getConfigLabel() {
		return configLabel;
	}

	public void setConfigLabel(String configLabel) {
		this.configLabel = configLabel;
	}

	public String getConfigNote() {
		return configNote;
	}

	public void setConfigNote(String configNote) {
		this.configNote = configNote;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
