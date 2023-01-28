package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_replacement")
public class OrderReplacement implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
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
		super();
	}

	public OrderReplacement(Integer orderReplacementId, Integer orderId, Integer empId, Integer replacementStatus) {
		this.orderReplacementId = orderReplacementId;
		this.orderId = orderId;
		this.empId = empId;
		this.replacementStatus = replacementStatus;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "order_replacement_id", unique = true, nullable = false)
	public Integer getOrderReplacementId() {
		return orderReplacementId;
	}

	public void setOrderReplacementId(Integer orderReplacementId) {
		this.orderReplacementId = orderReplacementId;
	}

	@Column(name = "order_id")
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "emp_id")
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "replacement_date", length = 26)
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
