package com.home.practice.entity;

import java.util.Date;
@Entity
@Table (name ="invoice")
public class Invoice {

	private Integer invoiceId;
	private Integer orderId;
	private Integer empId;
	private Date invoiceDate;
	private Integer invoiceStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public Invoice() {

	}
      @Id
      @GeneratedValue(strategy= IDENTITY)
      @Column
	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
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
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	 @Column
	public Integer getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(Integer invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
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

	public Invoice(Integer invoiceId, Integer orderId, Integer empId, Date invoiceDate, Integer invoiceStatus,
			Date createdDate, Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.invoiceId = invoiceId;
		this.orderId = orderId;
		this.empId = empId;
		this.invoiceDate = invoiceDate;
		this.invoiceStatus = invoiceStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	
}
