package com.home.practice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", unique = true, nullable = false)
	private int productId;

	@Column(name = "catalog_price", nullable = false)
	private int catalogPrice;

	@Column(name = "cgst_percentage")
	private int cgstPercentage;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Column(name = "product_barcode", length = 100)
	private String productBarcode;

	@Column(name = "product_description", length = 50)
	private String productDescription;

	@Column(name = "product_name", nullable = false, length = 15)
	private String productName;

	@Column(name = "product_price", nullable = false)
	private int productPrice;

	@Column(name = "product_quantity", nullable = false)
	private int productQuantity;

	@Column(name = "sgst_percentage")
	private int sgstPercentage;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@Column(name = "validity", length = 1)
	private String validity;

	@Column(name = "validity_period")
	private int validityPeriod;

	@OneToMany(mappedBy = "product")
	private List<OfferPriceList> offerPriceLists;

	@OneToMany(mappedBy = "product")
	private List<OrderItem> orderItems;

	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private ProductCategory productCategory;

	@ManyToOne
	@JoinColumn(name = "product_status")
	private Status status;

	@OneToMany(mappedBy = "product")
	private List<QuotationEnquiryItem> quotationEnquiryItems;

	public Product() {
		super();
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCatalogPrice() {
		return this.catalogPrice;
	}

	public void setCatalogPrice(int catalogPrice) {
		this.catalogPrice = catalogPrice;
	}

	public int getCgstPercentage() {
		return this.cgstPercentage;
	}

	public void setCgstPercentage(int cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
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

	public String getProductBarcode() {
		return this.productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getSgstPercentage() {
		return this.sgstPercentage;
	}

	public void setSgstPercentage(int sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
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

	public int getValidityPeriod() {
		return this.validityPeriod;
	}

	public void setValidityPeriod(int validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public List<OfferPriceList> getOfferPriceLists() {
		return this.offerPriceLists;
	}

	public void setOfferPriceLists(List<OfferPriceList> offerPriceLists) {
		this.offerPriceLists = offerPriceLists;
	}

	public OfferPriceList addOfferPriceList(OfferPriceList offerPriceList) {
		getOfferPriceLists().add(offerPriceList);
		offerPriceList.setProduct(this);

		return offerPriceList;
	}

	public OfferPriceList removeOfferPriceList(OfferPriceList offerPriceList) {
		getOfferPriceLists().remove(offerPriceList);
		offerPriceList.setProduct(null);

		return offerPriceList;
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setProduct(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setProduct(null);

		return orderItem;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public ProductCategory getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<QuotationEnquiryItem> getQuotationEnquiryItems() {
		return this.quotationEnquiryItems;
	}

	public void setQuotationEnquiryItems(List<QuotationEnquiryItem> quotationEnquiryItems) {
		this.quotationEnquiryItems = quotationEnquiryItems;
	}

	public QuotationEnquiryItem addQuotationEnquiryItem(QuotationEnquiryItem quotationEnquiryItem) {
		getQuotationEnquiryItems().add(quotationEnquiryItem);
		quotationEnquiryItem.setProduct(this);

		return quotationEnquiryItem;
	}

	public QuotationEnquiryItem removeQuotationEnquiryItem(QuotationEnquiryItem quotationEnquiryItem) {
		getQuotationEnquiryItems().remove(quotationEnquiryItem);
		quotationEnquiryItem.setProduct(null);

		return quotationEnquiryItem;
	}

}