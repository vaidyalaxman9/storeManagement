package com.home.practice.entity;

import java.util.Date;
@Entity
@Table(name = "quotation_enquiry_items)

public class QuotationEnquiryItems {

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

	}
        @Id
	@GeneratedValue(strategy = IDENTITY)
	@Column
	public Integer getQuotationItemId() {
		return quotationItemId;
	}

	public void setQuotationItemId(Integer quotationItemId) {
		this.quotationItemId = quotationItemId;
	}
        @Column
	public Integer getQuotationId() {
		return quotationId;
	}

	public void setQuotationId(Integer quotationId) {
		this.quotationId = quotationId;
	}

	@Column
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
        @Column
	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	@Column
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column
	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
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

	
}
