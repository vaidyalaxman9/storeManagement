package com.home.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the order_replacement database table.
 * 
 */
@Entity
@Table(name="order_replacement")
@NamedQuery(name="OrderReplacement.findAll", query="SELECT o FROM OrderReplacement o")
public class OrderReplacement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_replacement_id")
	private int orderReplacementId;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="replacement_date")
	private Date replacementDate;

	@Column(name="updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="replacement_status")
	private Status status;

	//bi-directional many-to-one association to OrderReplacementItem
	@OneToMany(mappedBy="orderReplacement")
	private List<OrderReplacementItem> orderReplacementItems;

	public OrderReplacement() {
	}

	public int getOrderReplacementId() {
		return this.orderReplacementId;
	}

	public void setOrderReplacementId(int orderReplacementId) {
		this.orderReplacementId = orderReplacementId;
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

	public Date getReplacementDate() {
		return this.replacementDate;
	}

	public void setReplacementDate(Date replacementDate) {
		this.replacementDate = replacementDate;
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

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<OrderReplacementItem> getOrderReplacementItems() {
		return this.orderReplacementItems;
	}

	public void setOrderReplacementItems(List<OrderReplacementItem> orderReplacementItems) {
		this.orderReplacementItems = orderReplacementItems;
	}

	public OrderReplacementItem addOrderReplacementItem(OrderReplacementItem orderReplacementItem) {
		getOrderReplacementItems().add(orderReplacementItem);
		orderReplacementItem.setOrderReplacement(this);

		return orderReplacementItem;
	}

	public OrderReplacementItem removeOrderReplacementItem(OrderReplacementItem orderReplacementItem) {
		getOrderReplacementItems().remove(orderReplacementItem);
		orderReplacementItem.setOrderReplacement(null);

		return orderReplacementItem;
	}

}