package com.home.practice.entity123;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_payment")
public class OrderPayment implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer paymentId;
	private Integer orderItemId;
	private Integer amount;
	private String remarks;
	private Date paymentDate;
	private Integer transactionId;
	private Integer paymentMode;
	private Integer paymentStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public OrderPayment() {
		super();
	}

	public OrderPayment(Integer paymentId, Integer orderItemId, Integer paymentMode, Integer paymentStatus) {
		this.paymentId = paymentId;
		this.orderItemId = orderItemId;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
	}

	public OrderPayment(Integer paymentId, Integer orderItemId, Integer amount, String remarks, Date paymentDate,
			Integer transactionId, Integer paymentMode, Integer paymentStatus, Date createdDate, Integer createdBy,
			Date updatedDate, Integer updatedBy) {
		super();
		this.paymentId = paymentId;
		this.orderItemId = orderItemId;
		this.amount = amount;
		this.remarks = remarks;
		this.paymentDate = paymentDate;
		this.transactionId = transactionId;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "payment_id", unique = true, nullable = false)
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	@Column(name = "order_item_id")
	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	@Column(name = "amount")
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Column(name = "remarks", length = 50)
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "payment_date", length = 26)
	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Column(name = "transaction_id")
	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "payment_mode")
	public Integer getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Integer paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Integer getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
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
