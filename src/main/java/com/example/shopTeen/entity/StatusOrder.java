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
@Table(name = "StatusOrders")
public class StatusOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "StatusName", nullable = false)
	private String statusName;

//	MAP
	
	@OneToMany(mappedBy="orderStatusId")
	private Set<Order> lstOrder;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Set<Order> getLstOrder() {
		return lstOrder;
	}

	public void setLstOrder(Set<Order> lstOrder) {
		this.lstOrder = lstOrder;
	}
	
	
}
