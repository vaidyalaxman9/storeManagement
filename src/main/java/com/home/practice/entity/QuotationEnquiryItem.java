package com.home.practice.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "quotation_enquiry_items")
public class QuotationEnquiryItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "quotation_item_id", unique = true, nullable = false)
	private int quotationItemId;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "unit_price")
	private int unitPrice;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@ManyToOne
	@JoinColumn(name = "offer_id")
	private Offer offer;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "quotation_id")
	private QuotationEnquiry quotationEnquiry;

	public QuotationEnquiryItem() {
		super();
	}

	public int getQuotationItemId() {
		return this.quotationItemId;
	}

	public void setQuotationItemId(int quotationItemId) {
		this.quotationItemId = quotationItemId;
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

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
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

	public Offer getOffer() {
		return this.offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public QuotationEnquiry getQuotationEnquiry() {
		return this.quotationEnquiry;
	}

	public void setQuotationEnquiry(QuotationEnquiry quotationEnquiry) {
		this.quotationEnquiry = quotationEnquiry;
	}

}