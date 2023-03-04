package com.home.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;

	@Column(name="catalog_price")
	private int catalogPrice;

	@Column(name="cgst_percentage")
	private int cgstPercentage;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="product_barcode")
	private String productBarcode;

	@Column(name="product_description")
	private String productDescription;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_price")
	private int productPrice;

	@Column(name="product_quantity")
	private int productQuantity;

	@Column(name="sgst_percentage")
	private int sgstPercentage;

	@Column(name="updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	private String validity;

	@Column(name="validity_period")
	private int validityPeriod;

	//bi-directional many-to-one association to OfferPriceList
	@OneToMany(mappedBy="product")
	private List<OfferPriceList> offerPriceLists;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="product")
	private List<OrderItem> orderItems;

	//bi-directional many-to-one association to Brand
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brand brand;

	//bi-directional many-to-one association to ProductCategory
	@ManyToOne
	@JoinColumn(name="category_id")
	private ProductCategory productCategory;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="product_status")
	private Status status;

	//bi-directional many-to-one association to QuotationEnquiryItem
	@OneToMany(mappedBy="product")
	private List<QuotationEnquiryItem> quotationEnquiryItems;

	public Product() {
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