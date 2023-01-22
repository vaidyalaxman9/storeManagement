package com.home.practice.entity;

import java.util.Date;
@Entity
@Table (name="order_payment")
public class OrderPayment {

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

	}

	@Id
	@GeneratedValue(strategy= IDENTITY)
	@Column
	public Integer getPaymentId() {
		return paymentId;
	}

	
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
        @Column
	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	@Column
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Column
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column
	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
        @Column
	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
        @Column
	public Integer getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Integer paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Column
	public Integer getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Column
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
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
	
	
}
