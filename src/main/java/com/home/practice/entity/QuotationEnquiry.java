package com.home.practice.entity;

import java.util.Date;

public class QuotationEnquiry {

	private Integer quotationId;
	private Date quotationDate;
	private Integer empId;
	private String customerName;
	private String mobileNumber;
	private String address;
	private String remarks;
	private Integer quotationStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public QuotationEnquiry() {

	}

	public Integer getQuotationId() {
		return quotationId;
	}

	public void setQuotationId(Integer quotationId) {
		this.quotationId = quotationId;
	}

	public Date getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(Date quotationDate) {
		this.quotationDate = quotationDate;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getQuotationStatus() {
		return quotationStatus;
	}

	public void setQuotationStatus(Integer quotationStatus) {
		this.quotationStatus = quotationStatus;
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

	public QuotationEnquiry(Integer quotationId, Date quotationDate, Integer empId, String customerName,
			String mobileNumber, String address, String remarks, Integer quotationStatus, Date createdDate,
			Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.quotationId = quotationId;
		this.quotationDate = quotationDate;
		this.empId = empId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.remarks = remarks;
		this.quotationStatus = quotationStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	
	
}
