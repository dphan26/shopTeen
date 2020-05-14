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
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "ProductName", nullable = false)
	private String productName;
	
	@Column(name = "UnitPrice", nullable = false)
	private float unitPrice;
	
	@Column(name = "QuantityStock", nullable = false)
	private int quantityStock;
	
	@Column(name = "PostDate", nullable = false)
	private Date postDate;
		
	@Column(name = "Discount", nullable = true)
	private Float discount;
	
	@Column(name = "DiscountExpiryDate", nullable = true)
	private Date discountExpiryDate;
	
	@Column(name = "Description", nullable = true)
	private String description;
	
	@Column(name = "KeywordSeo", nullable = true)
	private String keywordSeo;

	
	
//	MAP
	//OneToMany: 1 doi tuong product se co nhieu doi tuong OrderDetail, (co the la list, set)
	//mappingBy: duoc hieu la se mapping voi bang OrderDetail thong qua thuoc tinh productId trong class Product
	
	@OneToMany(mappedBy="productId")//1 product co nhieu orderdetail
	private Set<OrderDetail> lstOrderDetail;
	
	@OneToMany(mappedBy="productId")
	private Set<Picture> lstPicture;

	@OneToMany(mappedBy="productId")
	private Set<ProductCategory> lstProductCategory;
	
	@OneToMany(mappedBy="productId")
	private Set<ProductInformation> lstProductInformation;
	
	@OneToMany(mappedBy="productId")
	private Set<Visitor> lstVisitor;
	
	@OneToMany(mappedBy="productId")
	private Set<ProductDisplay> lstProductDisplay;
	
//	FOREIGN KEY
	
	@ManyToOne
	@JoinColumn(name = "PostById", nullable = false)
	private TblUser postById;

	@ManyToOne
	@JoinColumn(name = "StatusId", nullable = false)
	private StatusProduct statusId;
	
	@ManyToOne
	@JoinColumn(name = "PictureId", nullable = true)
	private Picture pictureId;
	
	@ManyToOne
	@JoinColumn(name = "BrandId", nullable = true)
	private Brand brandId;

//	GETTER & SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	
	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Date getDiscountExpiryDate() {
		return discountExpiryDate;
	}

	public void setDiscountExpiryDate(Date discountExpiryDate) {
		this.discountExpiryDate = discountExpiryDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywordSeo() {
		return keywordSeo;
	}

	public void setKeywordSeo(String keywordSeo) {
		this.keywordSeo = keywordSeo;
	}

	public Set<OrderDetail> getLstOrderDetail() {
		return lstOrderDetail;
	}

	public void setLstOrderDetail(Set<OrderDetail> lstOrderDetail) {
		this.lstOrderDetail = lstOrderDetail;
	}

	public Set<Picture> getLstPicture() {
		return lstPicture;
	}

	public void setLstPicture(Set<Picture> lstPicture) {
		this.lstPicture = lstPicture;
	}

	public Set<ProductCategory> getLstProductCategory() {
		return lstProductCategory;
	}

	public void setLstProductCategory(Set<ProductCategory> lstProductCategory) {
		this.lstProductCategory = lstProductCategory;
	}



	public Set<ProductInformation> getLstProductInformation() {
		return lstProductInformation;
	}

	public void setLstProductInformation(Set<ProductInformation> lstProductInformation) {
		this.lstProductInformation = lstProductInformation;
	}

	public Set<Visitor> getLstVisitor() {
		return lstVisitor;
	}

	public void setLstVisitor(Set<Visitor> lstVisitor) {
		this.lstVisitor = lstVisitor;
	}

	public TblUser getPostById() {
		return postById;
	}

	public void setPostById(TblUser postById) {
		this.postById = postById;
	}

	public StatusProduct getStatusId() {
		return statusId;
	}

	public void setStatusId(StatusProduct statusId) {
		this.statusId = statusId;
	}

	public Picture getPictureId() {
		return pictureId;
	}

	public void setPictureId(Picture pictureId) {
		this.pictureId = pictureId;
	}

	public Brand getBrandId() {
		return brandId;
	}

	public void setBrandId(Brand brandId) {
		this.brandId = brandId;
	}

	public Set<ProductDisplay> getLstProductDisplay() {
		return lstProductDisplay;
	}

	public void setLstProductDisplay(Set<ProductDisplay> lstProductDisplay) {
		this.lstProductDisplay = lstProductDisplay;
	}
	
	
}
