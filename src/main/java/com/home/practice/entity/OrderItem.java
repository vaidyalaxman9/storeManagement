package com.home.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the order_items database table.
 * 
 */
@Entity
@Table(name="order_items")
@NamedQuery(name="OrderItem.findAll", query="SELECT o FROM OrderItem o")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_item_id")
	private int orderItemId;

	@Column(name="cgst_percentage")
	private int cgstPercentage;

	@Column(name="cgst_price")
	private int cgstPrice;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="discount_amount")
	private int discountAmount;

	@Column(name="discount_percentage")
	private int discountPercentage;

	@Column(name="order_quantity")
	private int orderQuantity;

	@Column(name="sgst_percentage")
	private int sgstPercentage;

	@Column(name="sgst_price")
	private int sgstPrice;

	@Column(name="unit_price")
	private int unitPrice;

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

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	//bi-directional many-to-one association to OrderPayment
	@OneToMany(mappedBy="orderItem")
	private List<OrderPayment> orderPayments;

	public OrderItem() {
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