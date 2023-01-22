package com.home.practice.entity;

import java.util.Date;
@Entity
@Table (name = "order_replacement")
public class OrderReplacement {

	private Integer orderReplacementId;
	private Integer orderId;
	private Integer empId;
	private Date replacementDate;
	private Integer replacementStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public OrderReplacement() {

	}
       @Id
       @GeneratedValue(strategy= IDENTITY)
       @Column
	public Integer getOrderReplacementId() {
		return orderReplacementId;
	}

	public void setOrderReplacementId(Integer orderReplacementId) {
		this.orderReplacementId = orderReplacementId;
	}

	@Column
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column
	public Date getReplacementDate() {
		return replacementDate;
	}

	public void setReplacementDate(Date replacementDate) {
		this.replacementDate = replacementDate;
	}

	@Column
	public Integer getReplacementStatus() {
		return replacementStatus;
	}

	public void setReplacementStatus(Integer replacementStatus) {
		this.replacementStatus = replacementStatus;
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

	public OrderReplacement(Integer orderReplacementId, Integer orderId, Integer empId, Date replacementDate,
			Integer replacementStatus, Date createdDate, Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.orderReplacementId = orderReplacementId;
		this.orderId = orderId;
		this.empId = empId;
		this.replacementDate = replacementDate;
		this.replacementStatus = replacementStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

}
