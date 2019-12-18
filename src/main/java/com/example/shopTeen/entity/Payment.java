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
@Table(name = "Payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "PaymentName", nullable = false)
	private String paymentName;

//	MAP
	
	@OneToMany(mappedBy="paymentId")
	private Set<Order> lstOrder;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public Set<Order> getLstOrder() {
		return lstOrder;
	}

	public void setLstOrder(Set<Order> lstOrder) {
		this.lstOrder = lstOrder;
	}
	
	
}
