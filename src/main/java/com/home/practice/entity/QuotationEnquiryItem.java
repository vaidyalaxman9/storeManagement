package com.home.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the quotation_enquiry_items database table.
 * 
 */
@Entity
@Table(name="quotation_enquiry_items")
@NamedQuery(name="QuotationEnquiryItem.findAll", query="SELECT q FROM QuotationEnquiryItem q")
public class QuotationEnquiryItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="quotation_item_id")
	private int quotationItemId;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private int quantity;

	@Column(name="unit_price")
	private int unitPrice;

	@Column(name="updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to Offer
	@ManyToOne
	@JoinColumn(name="offer_id")
	private Offer offer;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	//bi-directional many-to-one association to QuotationEnquiry
	@ManyToOne
	@JoinColumn(name="quotation_id")
	private QuotationEnquiry quotationEnquiry;

	public QuotationEnquiryItem() {
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