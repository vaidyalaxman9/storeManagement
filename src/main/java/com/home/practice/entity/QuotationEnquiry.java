package com.home.practice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "quotation_enquiry")
public class QuotationEnquiry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "quotation_id", unique = true, nullable = false)
	private int quotationId;

	@Column(name = "address", length = 50)
	private String address;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Column(name = "customer_name", length = 15)
	private String customerName;

	@Column(name = "mobile_number", length = 13)
	private String mobileNumber;

	@Temporal(TemporalType.DATE)
	@Column(name = "quotation_date", length = 26)
	private Date quotationDate;

	@Column(name = "remarks", length = 50)
	private String remarks;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "quotation_status")
	private Status status;

	@JsonIgnore
	@OneToMany(mappedBy = "quotationEnquiry", fetch = FetchType.LAZY)
	private List<QuotationEnquiryItem> quotationEnquiryItems;

	public QuotationEnquiry() {
		super();
	}

	public int getQuotationId() {
		return this.quotationId;
	}

	public void setQuotationId(int quotationId) {
		this.quotationId = quotationId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getQuotationDate() {
		return this.quotationDate;
	}

	public void setQuotationDate(Date quotationDate) {
		this.quotationDate = quotationDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<QuotationEnquiryItem> getQuotationEnquiryItems() {
		return this.quotationEnquiryItems;
	}

	public void setQuotationEnquiryItems(List<QuotationEnquiryItem> quotationEnquiryItems) {
		this.quotationEnquiryItems = quotationEnquiryItems;
	}

	public QuotationEnquiryItem addQuotationEnquiryItem(QuotationEnquiryItem quotationEnquiryItem) {
		getQuotationEnquiryItems().add(quotationEnquiryItem);
		quotationEnquiryItem.setQuotationEnquiry(this);

		return quotationEnquiryItem;
	}

	public QuotationEnquiryItem removeQuotationEnquiryItem(QuotationEnquiryItem quotationEnquiryItem) {
		getQuotationEnquiryItems().remove(quotationEnquiryItem);
		quotationEnquiryItem.setQuotationEnquiry(null);

		return quotationEnquiryItem;
	}

}