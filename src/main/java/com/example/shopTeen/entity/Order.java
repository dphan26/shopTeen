package com.example.shopTeen.entity;

import java.util.Date;
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
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "CustomerName", nullable = false)
	private String customerName;
	
	@Column(name = "CustomerPhone", nullable = false)
	private String customerPhone;
	
	@Column(name = "CustomerAddress", nullable = false)
	private String customerAddress;
	
	@Column(name = "TransportFee", nullable = false)
	private float transportFee;
	
	@Column(name = "OrderDate", nullable = false)
	private Date orderDate;

	@Column(name = "OrderNote", nullable = true)
	private String orderNote;

//	MAP
	
	@OneToMany(mappedBy="orderId")
	private Set<OrderDetail> lstOrderDetail;
	
//	FOREIGN KEY
	
	@ManyToOne
	@JoinColumn(name = "PaymentId" , nullable = false)
	private Payment paymentId;
	
	@ManyToOne
	@JoinColumn(name = "OrderById" , nullable = false)
	private TblUser orderById;
	
	@ManyToOne
	@JoinColumn(name = "DistrictId" , nullable = false)
	private District districtId;
	
	@ManyToOne
	@JoinColumn(name = "OrderStatusId" , nullable = false)
	private StatusOrder orderStatusId;
	
	@ManyToOne
	@JoinColumn(name = "CouponId" , nullable = true)
	private Coupon couponId;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public float getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(float transportFee) {
		this.transportFee = transportFee;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderNote() {
		return orderNote;
	}

	public void setOrderNote(String orderNote) {
		this.orderNote = orderNote;
	}

	public Set<OrderDetail> getLstOrderDetail() {
		return lstOrderDetail;
	}

	public void setLstOrderDetail(Set<OrderDetail> lstOrderDetail) {
		this.lstOrderDetail = lstOrderDetail;
	}

	public Payment getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}

	public TblUser getOrderById() {
		return orderById;
	}

	public void setOrderById(TblUser orderById) {
		this.orderById = orderById;
	}

	public District getDistrictId() {
		return districtId;
	}

	public void setDistrictId(District districtId) {
		this.districtId = districtId;
	}

	public StatusOrder getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(StatusOrder orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public Coupon getCouponId() {
		return couponId;
	}

	public void setCouponId(Coupon couponId) {
		this.couponId = couponId;
	}
	
	


	
}
