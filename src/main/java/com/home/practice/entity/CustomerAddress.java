package com.home.practice.entity;

import java.util.Date;

public class CustomerAddress {

	private Integer addressId;
	private String addressType;
	private String line1;
	private String line2;
	private String line3;
	private Integer pincode;
	private String state;
	private Integer customerId;
	private String overallDefault;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	public CustomerAddress () {
		
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getOverallDefault() {
		return overallDefault;
	}

	public void setOverallDefault(String overallDefault) {
		this.overallDefault = overallDefault;
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

	public CustomerAddress(Integer addressId, String addressType, String line1, String line2, String line3,
			Integer pincode, String state, Integer customerId, String overallDefault, Date createdDate,
			Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.pincode = pincode;
		this.state = state;
		this.customerId = customerId;
		this.overallDefault = overallDefault;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	
	
}
