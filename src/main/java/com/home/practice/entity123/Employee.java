package com.home.practice.entity123;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer empId;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String residentialAddress;
	private String communicationAddress;
	private Integer employeeProfile;
	private Integer employeeStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String firstName, Integer employeeProfile, Integer employeeStatus) {
		this.empId = empId;
		this.firstName = firstName;
		this.employeeProfile = employeeProfile;
		this.employeeStatus = employeeStatus;
	}

	public Employee(Integer empId, String firstName, String lastName, String contactNumber, String residentialAddress,
			String communicationAddress, Integer employeeProfile, Integer employeeStatus, Date createdDate,
			Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.residentialAddress = residentialAddress;
		this.communicationAddress = communicationAddress;
		this.employeeProfile = employeeProfile;
		this.employeeStatus = employeeStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "emp_id", unique = true, nullable = false)
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "first_name", nullable = false, length = 15)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 15)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "contact_number", length = 13)
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = " residential_address", length = 100)
	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	@Column(name = " communication_address", length = 100)
	public String getCommunicationAddress() {
		return communicationAddress;
	}

	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public Integer getEmployeeProfile() {
		return employeeProfile;
	}

	public void setEmployeeProfile(Integer employeeProfile) {
		this.employeeProfile = employeeProfile;
	}

	public Integer getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(Integer employeeStatus) {
		this.employeeStatus = employeeStatus;
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
