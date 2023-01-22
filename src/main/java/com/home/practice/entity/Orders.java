package com.home.practice.entity;

import java.util.Date;
@Entity
@Table(name = "orders")
public class Orders {

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

	}
        @Id
	@GeneratedValue(strategy = IDENTITY)
	@Column
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
        @Column
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
        @Column
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
        @Column
	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}
        @Column
	public Integer getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Column
	public Integer getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(Integer remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
        @Column
	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
        @Column
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
        @Column
	public String getGstinNumber() {
		return gstinNumber;
	}

	public void setGstinNumber(String gstinNumber) {
		this.gstinNumber = gstinNumber;
	}

	@Column
	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	@Column
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column
	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
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

}
