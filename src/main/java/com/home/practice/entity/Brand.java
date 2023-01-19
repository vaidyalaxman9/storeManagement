package com.home.practice.entity;

import java.util.Date;

public class Brand {

	private Integer brandId;
	private String brandName;
	private String brandDescription;
	private Integer brandStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	public Brand () {
		
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public Integer getBrandStatus() {
		return brandStatus;
	}

	public void setBrandStatus(Integer brandStatus) {
		this.brandStatus = brandStatus;
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

	public Brand(Integer brandId, String brandName, String brandDescription, Integer brandStatus, Date createdDate,
			Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandDescription = brandDescription;
		this.brandStatus = brandStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	
	
}
