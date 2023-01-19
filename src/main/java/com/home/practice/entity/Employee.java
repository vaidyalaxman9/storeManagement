package com.home.practice.entity;

import java.util.Date;

public class Employee {

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
	
	public Employee () {
		
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

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
	
	
}
