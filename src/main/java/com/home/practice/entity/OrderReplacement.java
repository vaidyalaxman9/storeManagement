package com.home.practice.entity;

import java.util.Date;

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

	public Integer getOrderReplacementId() {
		return orderReplacementId;
	}

	public void setOrderReplacementId(Integer orderReplacementId) {
		this.orderReplacementId = orderReplacementId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Date getReplacementDate() {
		return replacementDate;
	}

	public void setReplacementDate(Date replacementDate) {
		this.replacementDate = replacementDate;
	}

	public Integer getReplacementStatus() {
		return replacementStatus;
	}

	public void setReplacementStatus(Integer replacementStatus) {
		this.replacementStatus = replacementStatus;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

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
