package com.home.practice.entity;

import java.util.Date;

public class OrderItems {

	private Integer orderItemId;
	private Integer orderId;
	private Integer productId;
	private Integer orderQuantity;
	private Integer unitPrice;
	private Integer discountAmount;
	private Integer discountPercentage;
	private String validity;
	private Date validityStartDate;
	private Date validityEndDate;
	private Integer sgstPercentage;
	private Integer sgstPrice;
	private Integer cgstPercentage;
	private Integer cgstPrice;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public OrderItems() {

	}

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Integer discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Integer getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public Date getValidityStartDate() {
		return validityStartDate;
	}

	public void setValidityStartDate(Date validityStartDate) {
		this.validityStartDate = validityStartDate;
	}

	public Date getValidityEndDate() {
		return validityEndDate;
	}

	public void setValidityEndDate(Date validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	public Integer getSgstPercentage() {
		return sgstPercentage;
	}

	public void setSgstPercentage(Integer sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	public Integer getSgstPrice() {
		return sgstPrice;
	}

	public void setSgstPrice(Integer sgstPrice) {
		this.sgstPrice = sgstPrice;
	}

	public Integer getCgstPercentage() {
		return cgstPercentage;
	}

	public void setCgstPercentage(Integer cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}

	public Integer getCgstPrice() {
		return cgstPrice;
	}

	public void setCgstPrice(Integer cgstPrice) {
		this.cgstPrice = cgstPrice;
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

	public OrderItems(Integer orderItemId, Integer orderId, Integer productId, Integer orderQuantity, Integer unitPrice,
			Integer discountAmount, Integer discountPercentage, String validity, Date validityStartDate,
			Date validityEndDate, Integer sgstPercentage, Integer sgstPrice, Integer cgstPercentage, Integer cgstPrice,
			Date createdDate, Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.productId = productId;
		this.orderQuantity = orderQuantity;
		this.unitPrice = unitPrice;
		this.discountAmount = discountAmount;
		this.discountPercentage = discountPercentage;
		this.validity = validity;
		this.validityStartDate = validityStartDate;
		this.validityEndDate = validityEndDate;
		this.sgstPercentage = sgstPercentage;
		this.sgstPrice = sgstPrice;
		this.cgstPercentage = cgstPercentage;
		this.cgstPrice = cgstPrice;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	
}
