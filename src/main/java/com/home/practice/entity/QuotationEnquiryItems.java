package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quotation_enquiry_items")

public class QuotationEnquiryItems implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer quotationItemId;
	private Integer quotationId;
	private Integer productId;
	private Integer offerId;
	private Integer quantity;
	private Integer unitPrice;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public QuotationEnquiryItems() {
		super();
	}

	public QuotationEnquiryItems(Integer quotationItemId, Integer quotationId, Integer productId, Integer offerId) {
		this.quotationItemId = quotationItemId;
		this.quotationId = quotationId;
		this.productId = productId;
		this.offerId = offerId;
	}

	public QuotationEnquiryItems(Integer quotationItemId, Integer quotationId, Integer productId, Integer offerId,
			Integer quantity, Integer unitPrice, Date createdDate, Integer createdBy, Date updatedDate,
			Integer updatedBy) {
		super();
		this.quotationItemId = quotationItemId;
		this.quotationId = quotationId;
		this.productId = productId;
		this.offerId = offerId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "quotation_item_id", unique = true, nullable = false)
	public Integer getQuotationItemId() {
		return quotationItemId;
	}

	public void setQuotationItemId(Integer quotationItemId) {
		this.quotationItemId = quotationItemId;
	}

	@Column(name = "quotation_id")
	public Integer getQuotationId() {
		return quotationId;
	}

	public void setQuotationId(Integer quotationId) {
		this.quotationId = quotationId;
	}

	@Column(name = "product_id")
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "offer_id")
	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "unit_price")
	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
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

}
