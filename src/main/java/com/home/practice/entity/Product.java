package com.home.practice.entity;

import java.util.Date;
@Entity
@Table(name = "Product")
public class Product {

	private Integer productId;
	private String productName;
	private String productDescription;
	private Integer categoryId;
	private Integer brandId;
	private Integer productQuantity;
	private Integer productPrice;
	private Integer catalogPrice;
	private Integer sgstPercentage;
	private Integer cgstPercentage;
	private String productBarcode;
	private String validity;
	private String validityPeriod;
	private Integer productStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	public Product () {
		
	}
        @Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
        @Column
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
        @Column
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column
	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
        @Column
	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
        @Column
	public Integer getCatalogPrice() {
		return catalogPrice;
	}

	public void setCatalogPrice(Integer catalogPrice) {
		this.catalogPrice = catalogPrice;
	}

	@Column
	public Integer getSgstPercentage() {
		return sgstPercentage;
	}

	public void setSgstPercentage(Integer sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	@Column
	public Integer getCgstPercentage() {
		return cgstPercentage;
	}

	public void setCgstPercentage(Integer cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}
        @Column
	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	@Column
	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	@Column
	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	@Column
	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	@Column
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Product(Integer productId, String productName, String productDescription, Integer categoryId,
			Integer brandId, Integer productQuantity, Integer productPrice, Integer catalogPrice,
			Integer sgstPercentage, Integer cgstPercentage, String productBarcode, String validity,
			String validityPeriod, Integer productStatus, Date createdDate, Integer createdBy, Date updatedDate,
			Integer updatedBy) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.categoryId = categoryId;
		this.brandId = brandId;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.catalogPrice = catalogPrice;
		this.sgstPercentage = sgstPercentage;
		this.cgstPercentage = cgstPercentage;
		this.productBarcode = productBarcode;
		this.validity = validity;
		this.validityPeriod = validityPeriod;
		this.productStatus = productStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	
	
}
