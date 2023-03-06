package com.home.practice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id", unique = true, nullable = false)
	private int empId;

	@Column(name = "communication_address", length = 100)
	private String communicationAddress;

	@Column(name = "contact_number", length = 13)
	private String contactNumber;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Column(name = "first_name", nullable = false, length = 15)
	private String firstName;

	@Column(name = "last_name", length = 15)
	private String lastName;

	@Column(name = "residential_address", length = 100)
	private String residentialAddress;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@ManyToOne
	@JoinColumn(name = "employee_profile")
	private EmployeeProfile employeeProfileBean;

	@ManyToOne
	@JoinColumn(name = "employee_status")
	private Status status;

	@OneToMany(mappedBy = "employee")
	private List<Invoice> invoices;

	@OneToMany(mappedBy = "employee")
	private List<OrderReplacement> orderReplacements;

	@OneToMany(mappedBy = "employee")
	private List<Order> orders;

	@OneToMany(mappedBy = "employee")
	private List<QuotationEnquiry> quotationEnquiries;

	public Employee() {
		super();
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCommunicationAddress() {
		return this.communicationAddress;
	}

	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getResidentialAddress() {
		return this.residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
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

	public EmployeeProfile getEmployeeProfileBean() {
		return this.employeeProfileBean;
	}

	public void setEmployeeProfileBean(EmployeeProfile employeeProfileBean) {
		this.employeeProfileBean = employeeProfileBean;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Invoice addInvoice(Invoice invoice) {
		getInvoices().add(invoice);
		invoice.setEmployee(this);

		return invoice;
	}

	public Invoice removeInvoice(Invoice invoice) {
		getInvoices().remove(invoice);
		invoice.setEmployee(null);

		return invoice;
	}

	public List<OrderReplacement> getOrderReplacements() {
		return this.orderReplacements;
	}

	public void setOrderReplacements(List<OrderReplacement> orderReplacements) {
		this.orderReplacements = orderReplacements;
	}

	public OrderReplacement addOrderReplacement(OrderReplacement orderReplacement) {
		getOrderReplacements().add(orderReplacement);
		orderReplacement.setEmployee(this);

		return orderReplacement;
	}

	public OrderReplacement removeOrderReplacement(OrderReplacement orderReplacement) {
		getOrderReplacements().remove(orderReplacement);
		orderReplacement.setEmployee(null);

		return orderReplacement;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setEmployee(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setEmployee(null);

		return order;
	}

	public List<QuotationEnquiry> getQuotationEnquiries() {
		return this.quotationEnquiries;
	}

	public void setQuotationEnquiries(List<QuotationEnquiry> quotationEnquiries) {
		this.quotationEnquiries = quotationEnquiries;
	}

	public QuotationEnquiry addQuotationEnquiry(QuotationEnquiry quotationEnquiry) {
		getQuotationEnquiries().add(quotationEnquiry);
		quotationEnquiry.setEmployee(this);

		return quotationEnquiry;
	}

	public QuotationEnquiry removeQuotationEnquiry(QuotationEnquiry quotationEnquiry) {
		getQuotationEnquiries().remove(quotationEnquiry);
		quotationEnquiry.setEmployee(null);

		return quotationEnquiry;
	}

}