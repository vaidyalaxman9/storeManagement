package com.home.practice.entity;

import java.util.Date;

public class StatusGroup {

	private Integer statusGroupId;
	private String statusGroupName;
	private String statusGroupDescription;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	public StatusGroup() {
		
	}

	public Integer getStatusGroupId() {
		return statusGroupId;
	}

	public void setStatusGroupId(Integer statusGroupId) {
		this.statusGroupId = statusGroupId;
	}

	public String getStatusGroupName() {
		return statusGroupName;
	}

	public void setStatusGroupName(String statusGroupName) {
		this.statusGroupName = statusGroupName;
	}

	public String getStatusGroupDescription() {
		return statusGroupDescription;
	}

	public void setStatusGroupDescription(String statusGroupDescription) {
		this.statusGroupDescription = statusGroupDescription;
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

	public StatusGroup(Integer statusGroupId, String statusGroupName, String statusGroupDescription, Date createdDate,
			Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.statusGroupId = statusGroupId;
		this.statusGroupName = statusGroupName;
		this.statusGroupDescription = statusGroupDescription;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	
	
	
	
}

