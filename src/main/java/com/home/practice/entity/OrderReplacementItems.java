package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_replacement_items")
public class OrderReplacementItems implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer orderReplacementItemId;
	private String validity;
	private Date validityStartDate;
	private Date validityEndDate;
	private Integer orderReplacementId;
	private Integer replacementCharges;
	private Integer quantity;
	private Integer sgstPercentage;
	private Integer sgstPrice;
	private Integer cgstPercentage;
	private Integer cgstPrice;
	private String remarks;
	private String notes;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public OrderReplacementItems() {

	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "order_replacement_item_id", unique = true, nullable = false)
	public Integer getOrderReplacementItemId() {
		return orderReplacementItemId;
	}

	public void setOrderReplacementItemId(Integer orderReplacementItemId) {
		this.orderReplacementItemId = orderReplacementItemId;
	}

	@Column(name = "validity", length = 26)
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

	@Column(name = "order_replacement_id")
	public Integer getOrderReplacementId() {
		return orderReplacementId;
	}

	public void setOrderReplacementId(Integer orderReplacementId) {
		this.orderReplacementId = orderReplacementId;
	}

	@Column(name = "replacement_charges")
	public Integer getReplacementCharges() {
		return replacementCharges;
	}

	public void setReplacementCharges(Integer replacementCharges) {
		this.replacementCharges = replacementCharges;
	}

	@Column(name = " quantity ")
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	@Column(name = "remarks", length = 50)
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "notes", length = 50)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public OrderReplacementItems(Integer orderReplacementItemId, String validity, Date validityStartDate,
			Date validityEndDate, Integer orderReplacementId, Integer replacementCharges, Integer quantity,
			Integer sgstPercentage, Integer sgstPrice, Integer cgstPercentage, Integer cgstPrice, String remarks,
			String notes, Date createdDate, Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.orderReplacementItemId = orderReplacementItemId;
		this.validity = validity;
		this.validityStartDate = validityStartDate;
		this.validityEndDate = validityEndDate;
		this.orderReplacementId = orderReplacementId;
		this.replacementCharges = replacementCharges;
		this.quantity = quantity;
		this.sgstPercentage = sgstPercentage;
		this.sgstPrice = sgstPrice;
		this.cgstPercentage = cgstPercentage;
		this.cgstPrice = cgstPrice;
		this.remarks = remarks;
		this.notes = notes;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

}
