package com.home.practice.entity123;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer productId;
	private String productName;
	private String productDescription;
	private Integer categoryId;
	private Integer brandId;
	private Integer productQuantity;
	private Integer productPrice;
	private Integer catalogPrice;
	private Integer sgstPercentage;
	private Integer cgstPercentage;
	private String productBarcode;
	private String validity;
	private String validityPeriod;
	private Integer productStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public Product() {
		super();
	}

	public Product(Integer productId, String productName, Integer categoryId, Integer brandId, Integer productQuantity,
			Integer productPrice, Integer catalogPrice, Integer productStatus) {
		this.productId = productId;
		this.productName = productName;
		this.categoryId = categoryId;
		this.brandId = brandId;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.catalogPrice = catalogPrice;
		this.productStatus = productStatus;
	}

	public Product(Integer productId, String productName, String productDescription, Integer categoryId,
			Integer brandId, Integer productQuantity, Integer productPrice, Integer catalogPrice,
			Integer sgstPercentage, Integer cgstPercentage, String productBarcode, String validity,
			String validityPeriod, Integer productStatus, Date createdDate, Integer createdBy, Date updatedDate,
			Integer updatedBy) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.categoryId = categoryId;
		this.brandId = brandId;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.catalogPrice = catalogPrice;
		this.sgstPercentage = sgstPercentage;
		this.cgstPercentage = cgstPercentage;
		this.productBarcode = productBarcode;
		this.validity = validity;
		this.validityPeriod = validityPeriod;
		this.productStatus = productStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "product_id", unique = true, nullable = false)
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "product_name", nullable = false, length = 15)
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "product_description", length = 50)
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Column(name = "category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "brand_id")
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(name = "product_quantity", nullable = false)
	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Column(name = "product_price", nullable = false)
	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	@Column(name = "catalog_price", nullable = false)
	public Integer getCatalogPrice() {
		return catalogPrice;
	}

	public void setCatalogPrice(Integer catalogPrice) {
		this.catalogPrice = catalogPrice;
	}

	@Column(name = "sgst_percentage")
	public Integer getSgstPercentage() {
		return sgstPercentage;
	}

	public void setSgstPercentage(Integer sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	@Column(name = "cgst_percentage")
	public Integer getCgstPercentage() {
		return cgstPercentage;
	}

	public void setCgstPercentage(Integer cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}

	@Column(name = "product_barcode", length = 100)
	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	@Column(name = "validity", length = 1)
	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	@Column(name = "validity_period")
	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
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
