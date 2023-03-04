package com.home.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@NamedQuery(name="Status.findAll", query="SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="status_id")
	private int statusId;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="status_description")
	private String statusDescription;

	@Column(name="status_name")
	private String statusName;

	@Column(name="updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to Brand
	@OneToMany(mappedBy="status")
	private List<Brand> brands;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="status")
	private List<Customer> customers;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="status")
	private List<Employee> employees;

	//bi-directional many-to-one association to EmployeeProfile
	@OneToMany(mappedBy="status")
	private List<EmployeeProfile> employeeProfiles;

	//bi-directional many-to-one association to Invoice
	@OneToMany(mappedBy="status")
	private List<Invoice> invoices;

	//bi-directional many-to-one association to Offer
	@OneToMany(mappedBy="status")
	private List<Offer> offers;

	//bi-directional many-to-one association to OrderPayment
	@OneToMany(mappedBy="status")
	private List<OrderPayment> orderPayments;

	//bi-directional many-to-one association to OrderReplacement
	@OneToMany(mappedBy="status")
	private List<OrderReplacement> orderReplacements;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="status")
	private List<Order> orders;

	//bi-directional many-to-one association to PaymentMode
	@OneToMany(mappedBy="status")
	private List<PaymentMode> paymentModes;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="status")
	private List<Product> products;

	//bi-directional many-to-one association to ProductCategory
	@OneToMany(mappedBy="status")
	private List<ProductCategory> productCategories;

	//bi-directional many-to-one association to QuotationEnquiry
	@OneToMany(mappedBy="status")
	private List<QuotationEnquiry> quotationEnquiries;

	//bi-directional many-to-one association to StatusGroup
	@ManyToOne
	@JoinColumn(name="status_group_id")
	private StatusGroup statusGroup;

	public Status() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
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

	public String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
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

	public List<Brand> getBrands() {
		return this.brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public Brand addBrand(Brand brand) {
		getBrands().add(brand);
		brand.setStatus(this);

		return brand;
	}

	public Brand removeBrand(Brand brand) {
		getBrands().remove(brand);
		brand.setStatus(null);

		return brand;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setStatus(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setStatus(null);

		return customer;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setStatus(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setStatus(null);

		return employee;
	}

	public List<EmployeeProfile> getEmployeeProfiles() {
		return this.employeeProfiles;
	}

	public void setEmployeeProfiles(List<EmployeeProfile> employeeProfiles) {
		this.employeeProfiles = employeeProfiles;
	}

	public EmployeeProfile addEmployeeProfile(EmployeeProfile employeeProfile) {
		getEmployeeProfiles().add(employeeProfile);
		employeeProfile.setStatus(this);

		return employeeProfile;
	}

	public EmployeeProfile removeEmployeeProfile(EmployeeProfile employeeProfile) {
		getEmployeeProfiles().remove(employeeProfile);
		employeeProfile.setStatus(null);

		return employeeProfile;
	}

	public List<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Invoice addInvoice(Invoice invoice) {
		getInvoices().add(invoice);
		invoice.setStatus(this);

		return invoice;
	}

	public Invoice removeInvoice(Invoice invoice) {
		getInvoices().remove(invoice);
		invoice.setStatus(null);

		return invoice;
	}

	public List<Offer> getOffers() {
		return this.offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public Offer addOffer(Offer offer) {
		getOffers().add(offer);
		offer.setStatus(this);

		return offer;
	}

	public Offer removeOffer(Offer offer) {
		getOffers().remove(offer);
		offer.setStatus(null);

		return offer;
	}

	public List<OrderPayment> getOrderPayments() {
		return this.orderPayments;
	}

	public void setOrderPayments(List<OrderPayment> orderPayments) {
		this.orderPayments = orderPayments;
	}

	public OrderPayment addOrderPayment(OrderPayment orderPayment) {
		getOrderPayments().add(orderPayment);
		orderPayment.setStatus(this);

		return orderPayment;
	}

	public OrderPayment removeOrderPayment(OrderPayment orderPayment) {
		getOrderPayments().remove(orderPayment);
		orderPayment.setStatus(null);

		return orderPayment;
	}

	public List<OrderReplacement> getOrderReplacements() {
		return this.orderReplacements;
	}

	public void setOrderReplacements(List<OrderReplacement> orderReplacements) {
		this.orderReplacements = orderReplacements;
	}

	public OrderReplacement addOrderReplacement(OrderReplacement orderReplacement) {
		getOrderReplacements().add(orderReplacement);
		orderReplacement.setStatus(this);

		return orderReplacement;
	}

	public OrderReplacement removeOrderReplacement(OrderReplacement orderReplacement) {
		getOrderReplacements().remove(orderReplacement);
		orderReplacement.setStatus(null);

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
		order.setStatus(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setStatus(null);

		return order;
	}

	public List<PaymentMode> getPaymentModes() {
		return this.paymentModes;
	}

	public void setPaymentModes(List<PaymentMode> paymentModes) {
		this.paymentModes = paymentModes;
	}

	public PaymentMode addPaymentMode(PaymentMode paymentMode) {
		getPaymentModes().add(paymentMode);
		paymentMode.setStatus(this);

		return paymentMode;
	}

	public PaymentMode removePaymentMode(PaymentMode paymentMode) {
		getPaymentModes().remove(paymentMode);
		paymentMode.setStatus(null);

		return paymentMode;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setStatus(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setStatus(null);

		return product;
	}

	public List<ProductCategory> getProductCategories() {
		return this.productCategories;
	}

	public void setProductCategories(List<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}

	public ProductCategory addProductCategory(ProductCategory productCategory) {
		getProductCategories().add(productCategory);
		productCategory.setStatus(this);

		return productCategory;
	}

	public ProductCategory removeProductCategory(ProductCategory productCategory) {
		getProductCategories().remove(productCategory);
		productCategory.setStatus(null);

		return productCategory;
	}

	public List<QuotationEnquiry> getQuotationEnquiries() {
		return this.quotationEnquiries;
	}

	public void setQuotationEnquiries(List<QuotationEnquiry> quotationEnquiries) {
		this.quotationEnquiries = quotationEnquiries;
	}

	public QuotationEnquiry addQuotationEnquiry(QuotationEnquiry quotationEnquiry) {
		getQuotationEnquiries().add(quotationEnquiry);
		quotationEnquiry.setStatus(this);

		return quotationEnquiry;
	}

	public QuotationEnquiry removeQuotationEnquiry(QuotationEnquiry quotationEnquiry) {
		getQuotationEnquiries().remove(quotationEnquiry);
		quotationEnquiry.setStatus(null);

		return quotationEnquiry;
	}

	public StatusGroup getStatusGroup() {
		return this.statusGroup;
	}

	public void setStatusGroup(StatusGroup statusGroup) {
		this.statusGroup = statusGroup;
	}

}