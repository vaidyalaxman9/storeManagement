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
@Table(name = "order_replacement")
public class OrderReplacement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_replacement_id", unique = true, nullable = false)
	private int orderReplacementId;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "replacement_date", length = 26)
	private Date replacementDate;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "replacement_status")
	private Status status;

	@OneToMany(mappedBy = "orderReplacement")
	private List<OrderReplacementItem> orderReplacementItems;

	public OrderReplacement() {
		super();
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