package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItems implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "order_item_id", unique = true, nullable = false)
	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	@Column(name = "order_id")
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "product_id")
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "order_quantity")
	public Integer getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	@Column(name = "unit_price")
	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "discount_amount")
	public Integer getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Integer discountAmount) {
		this.discountAmount = discountAmount;
	}

	@Column(name = "discount_percentage")
	public Integer getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	@Column(name = "validity", length = 1)
	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	@Column(name = "validity_start_date", length = 26)
	public Date getValidityStartDate() {
		return validityStartDate;
	}

	public void setValidityStartDate(Date validityStartDate) {
		this.validityStartDate = validityStartDate;
	}

	@Column(name = "validity_end_date", length = 26)
	public Date getValidityEndDate() {
		return validityEndDate;
	}

	public void setValidityEndDate(Date validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	@Column(name = "sgst_percentage")
	public Integer getSgstPercentage() {
		return sgstPercentage;
	}

	public void setSgstPercentage(Integer sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	@Column(name = "sgst_price")
	public Integer getSgstPrice() {
		return sgstPrice;
	}

	public void setSgstPrice(Integer sgstPrice) {
		this.sgstPrice = sgstPrice;
	}

	@Column(name = "cgst_percentage")
	public Integer getCgstPercentage() {
		return cgstPercentage;
	}

	public void setCgstPercentage(Integer cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}

	@Column(name = "cgst_price")
	public Integer getCgstPrice() {
		return cgstPrice;
	}

	public void setCgstPrice(Integer cgstPrice) {
		this.cgstPrice = cgstPrice;
	}

	@Column(name = "created_date", length = 26)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "updated_date", length = 26)
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "updated_by")
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
