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
@Table(name = "payment_mode")
public class PaymentMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_mode_id", unique = true, nullable = false)
	private int paymentModeId;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Column(name = "payment_mode_description", length = 50)
	private String paymentModeDescription;

	@Column(name = "payment_mode_name", length = 10)
	private String paymentModeName;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@OneToMany(mappedBy = "paymentModeBean")
	private List<OrderPayment> orderPayments;

	@ManyToOne
	@JoinColumn(name = "payment_mode_status")
	private Status status;

	public PaymentMode() {
		super();
	}

	public int getPaymentModeId() {
		return this.paymentModeId;
	}

	public void setPaymentModeId(int paymentModeId) {
		this.paymentModeId = paymentModeId;
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

	public String getPaymentModeDescription() {
		return this.paymentModeDescription;
	}

	public void setPaymentModeDescription(String paymentModeDescription) {
		this.paymentModeDescription = paymentModeDescription;
	}

	public String getPaymentModeName() {
		return this.paymentModeName;
	}

	public void setPaymentModeName(String paymentModeName) {
		this.paymentModeName = paymentModeName;
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

	public List<OrderPayment> getOrderPayments() {
		return this.orderPayments;
	}

	public void setOrderPayments(List<OrderPayment> orderPayments) {
		this.orderPayments = orderPayments;
	}

	public OrderPayment addOrderPayment(OrderPayment orderPayment) {
		getOrderPayments().add(orderPayment);
		orderPayment.setPaymentModeBean(this);

		return orderPayment;
	}

	public OrderPayment removeOrderPayment(OrderPayment orderPayment) {
		getOrderPayments().remove(orderPayment);
		orderPayment.setPaymentModeBean(null);

		return orderPayment;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}