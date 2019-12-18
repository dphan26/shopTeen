package com.example.shopTeen.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Coupons", uniqueConstraints = @UniqueConstraint(columnNames = { "CouponCode" }))
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "CouponCode", nullable = false)
	private String couponCode;
	
	@Column(name = "CouponValue", nullable = false)
	private float couponValue;
	
	@Column(name = "CouponQuantity", nullable = false)
	private int couponQuantity;
	
	
	@Column(name = "StartDate", nullable = false)
	private Date startDate;
	
	@Column(name = "FinishDate", nullable = false)
	private Date finishDate;
	
//	MAP
	
	@OneToMany(mappedBy="couponId")
	private Set<Order> lstOrder;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public float getCouponValue() {
		return couponValue;
	}

	public void setCouponValue(float couponValue) {
		this.couponValue = couponValue;
	}

	public int getCouponQuantity() {
		return couponQuantity;
	}

	public void setCouponQuantity(int couponQuantity) {
		this.couponQuantity = couponQuantity;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Set<Order> getLstOrder() {
		return lstOrder;
	}

	public void setLstOrder(Set<Order> lstOrder) {
		this.lstOrder = lstOrder;
	}
	
	
	
}
