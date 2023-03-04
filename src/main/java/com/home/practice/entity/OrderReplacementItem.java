package com.home.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the order_replacement_items database table.
 * 
 */
@Entity
@Table(name="order_replacement_items")
@NamedQuery(name="OrderReplacementItem.findAll", query="SELECT o FROM OrderReplacementItem o")
public class OrderReplacementItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_replacement_item_id")
	private int orderReplacementItemId;

	@Column(name="cgst_percentage")
	private int cgstPercentage;

	@Column(name="cgst_price")
	private int cgstPrice;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String notes;

	private int quantity;

	private String remarks;

	@Column(name="replacement_charges")
	private int replacementCharges;

	@Column(name="sgst_percentage")
	private int sgstPercentage;

	@Column(name="sgst_price")
	private int sgstPrice;

	@Column(name="updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	private String validity;

	@Temporal(TemporalType.DATE)
	@Column(name="validity_end_date")
	private Date validityEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="validity_start_date")
	private Date validityStartDate;

	//bi-directional many-to-one association to OrderReplacement
	@ManyToOne
	@JoinColumn(name="order_replacement_id")
	private OrderReplacement orderReplacement;

	public OrderReplacementItem() {
	}

	public int getOrderReplacementItemId() {
		return this.orderReplacementItemId;
	}

	public void setOrderReplacementItemId(int orderReplacementItemId) {
		this.orderReplacementItemId = orderReplacementItemId;
	}

	public int getCgstPercentage() {
		return this.cgstPercentage;
	}

	public void setCgstPercentage(int cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}

	public int getCgstPrice() {
		return this.cgstPrice;
	}

	public void setCgstPrice(int cgstPrice) {
		this.cgstPrice = cgstPrice;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getReplacementCharges() {
		return this.replacementCharges;
	}

	public void setReplacementCharges(int replacementCharges) {
		this.replacementCharges = replacementCharges;
	}

	public int getSgstPercentage() {
		return this.sgstPercentage;
	}

	public void setSgstPercentage(int sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	public int getSgstPrice() {
		return this.sgstPrice;
	}

	public void setSgstPrice(int sgstPrice) {
		this.sgstPrice = sgstPrice;
	}

	public int getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getValidity() {
		return this.validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public Date getValidityEndDate() {
		return this.validityEndDate;
	}

	public void setValidityEndDate(Date validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	public Date getValidityStartDate() {
		return this.validityStartDate;
	}

	public void setValidityStartDate(Date validityStartDate) {
		this.validityStartDate = validityStartDate;
	}

	public OrderReplacement getOrderReplacement() {
		return this.orderReplacement;
	}

	public void setOrderReplacement(OrderReplacement orderReplacement) {
		this.orderReplacement = orderReplacement;
	}

}