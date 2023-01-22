package com.home.practice.entity;

import java.util.Date;
@Entity
@Table
public class OrderReplacementItems {

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
       @GeneratedValue(strategy= IDENTITY)
       @Column
	public Integer getOrderReplacementItemId() {
		return orderReplacementItemId;
	}

	public void setOrderReplacementItemId(Integer orderReplacementItemId) {
		this.orderReplacementItemId = orderReplacementItemId;
	}
        @Column
	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	@Column
	public Date getValidityStartDate() {
		return validityStartDate;
	}

	public void setValidityStartDate(Date validityStartDate) {
		this.validityStartDate = validityStartDate;
	}

	@Column
	public Date getValidityEndDate() {
		return validityEndDate;
	}

	public void setValidityEndDate(Date validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	@Column
	public Integer getOrderReplacementId() {
		return orderReplacementId;
	}

	public void setOrderReplacementId(Integer orderReplacementId) {
		this.orderReplacementId = orderReplacementId;
	}

	@Column
	public Integer getReplacementCharges() {
		return replacementCharges;
	}

	public void setReplacementCharges(Integer replacementCharges) {
		this.replacementCharges = replacementCharges;
	}

	@Column
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
        @Column
	public Integer getSgstPercentage() {
		return sgstPercentage;
	}

	public void setSgstPercentage(Integer sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	@Column
	public Integer getSgstPrice() {
		return sgstPrice;
	}

	public void setSgstPrice(Integer sgstPrice) {
		this.sgstPrice = sgstPrice;
	}

	@Column
	public Integer getCgstPercentage() {
		return cgstPercentage;
	}

	public void setCgstPercentage(Integer cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}

	@Column
	public Integer getCgstPrice() {
		return cgstPrice;
	}

	public void setCgstPrice(Integer cgstPrice) {
		this.cgstPrice = cgstPrice;
	}
        @Column
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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
