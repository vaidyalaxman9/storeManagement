package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer orderId;
	private Integer customerId;
	private Integer empId;
	private Integer offerId;
	private Integer paidAmount;
	private Integer remainingAmount;
	private Integer totalAmount;
	private Date date;
	private String gstinNumber;
	private String panNumber;
	private String remarks;
	private Integer orderStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public Orders() {
		super();
	}

	public Orders(Integer orderId, Integer customerId, Integer empId, Integer offerId, Integer orderStatus) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.empId = empId;
		this.offerId = offerId;
		this.orderStatus = orderStatus;
	}

	public Orders(Integer orderId, Integer customerId, Integer empId, Integer offerId, Integer paidAmount,
			Integer remainingAmount, Integer totalAmount, Date date, String gstinNumber, String panNumber,
			String remarks, Integer orderStatus, Date createdDate, Integer createdBy, Date updatedDate,
			Integer updatedBy) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.empId = empId;
		this.offerId = offerId;
		this.paidAmount = paidAmount;
		this.remainingAmount = remainingAmount;
		this.totalAmount = totalAmount;
		this.date = date;
		this.gstinNumber = gstinNumber;
		this.panNumber = panNumber;
		this.remarks = remarks;
		this.orderStatus = orderStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "order_id", unique = true, nullable = false)
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "customer_id")
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "emp_id")
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "offer_id")
	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	@Column(name = "paid_amount")
	public Integer getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Column(name = "remaining_amount")
	public Integer getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(Integer remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	@Column(name = "total_amount")
	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "date", length = 26)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "gstin_number", length = 15)
	public String getGstinNumber() {
		return gstinNumber;
	}

	public void setGstinNumber(String gstinNumber) {
		this.gstinNumber = gstinNumber;
	}

	@Column(name = "pan_number", length = 12)
	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	@Column(name = "remarks", length = 50)
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
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
