package com.home.practice.entity;

import java.util.Date;

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

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getCatalogPrice() {
		return catalogPrice;
	}

	public void setCatalogPrice(Integer catalogPrice) {
		this.catalogPrice = catalogPrice;
	}

	public Integer getSgstPercentage() {
		return sgstPercentage;
	}

	public void setSgstPercentage(Integer sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	public Integer getCgstPercentage() {
		return cgstPercentage;
	}

	public void setCgstPercentage(Integer cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}

	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

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
