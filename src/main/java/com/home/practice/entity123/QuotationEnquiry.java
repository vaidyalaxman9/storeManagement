package com.home.practice.entity123;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quotation_enquiry")
public class QuotationEnquiry implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
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
		super();
	}

	public QuotationEnquiry(Integer quotationId, Integer empId, Integer quotationStatus) {
		this.quotationId = quotationId;
		this.empId = empId;
		this.quotationStatus = quotationStatus;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "quotation_id", unique = true, nullable = false)
	public Integer getQuotationId() {
		return quotationId;
	}

	public void setQuotationId(Integer quotationId) {
		this.quotationId = quotationId;
	}

	@Column(name = "quotation_date", length = 26)
	public Date getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(Date quotationDate) {
		this.quotationDate = quotationDate;
	}

	@Column(name = "emp_id")
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "customer_name", length = 15)
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "mobile_number", length = 13)
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "address", length = 50)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "remarks", length = 50)
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
