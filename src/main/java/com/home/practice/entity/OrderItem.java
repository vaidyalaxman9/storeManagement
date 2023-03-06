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
@Table(name = "order_items")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_item_id", unique = true, nullable = false)
	private int orderItemId;

	@Column(name = "cgst_percentage")
	private int cgstPercentage;

	@Column(name = "cgst_price")
	private int cgstPrice;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Column(name = "discount_amount")
	private int discountAmount;

	@Column(name = "discount_percentage")
	private int discountPercentage;

	@Column(name = "order_quantity")
	private int orderQuantity;

	@Column(name = "sgst_percentage")
	private int sgstPercentage;

	@Column(name = "sgst_price")
	private int sgstPrice;

	@Column(name = "unit_price")
	private int unitPrice;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@Column(name = "validity", length = 1)
	private String validity;

	@Temporal(TemporalType.DATE)
	@Column(name = "validity_end_date", length = 26)
	private Date validityEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "validity_start_date", length = 26)
	private Date validityStartDate;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@OneToMany(mappedBy = "orderItem")
	private List<OrderPayment> orderPayments;

	public OrderItem() {
		super();
	}

	public int getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
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

	public int getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getDiscountPercentage() {
		return this.discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public int getOrderQuantity() {
		return this.orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
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

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<OrderPayment> getOrderPayments() {
		return this.orderPayments;
	}

	public void setOrderPayments(List<OrderPayment> orderPayments) {
		this.orderPayments = orderPayments;
	}

	public OrderPayment addOrderPayment(OrderPayment orderPayment) {
		getOrderPayments().add(orderPayment);
		orderPayment.setOrderItem(this);

		return orderPayment;
	}

	public OrderPayment removeOrderPayment(OrderPayment orderPayment) {
		getOrderPayments().remove(orderPayment);
		orderPayment.setOrderItem(null);

		return orderPayment;
	}

}