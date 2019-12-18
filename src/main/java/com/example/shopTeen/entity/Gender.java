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
@Table(name = "Genders")
public class Gender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "GenderName", nullable = false)
	private String genderName;

//	MAP
	
	@OneToMany(mappedBy="genderId")
	private Set<TblUser> lstTblUser;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public Set<TblUser> getLstTblUser() {
		return lstTblUser;
	}

	public void setLstTblUser(Set<TblUser> lstTblUser) {
		this.lstTblUser = lstTblUser;
	}
	
	

}
