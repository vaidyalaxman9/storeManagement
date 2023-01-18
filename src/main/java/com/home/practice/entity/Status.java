package com.home.practice.entity;

import java.util.Date;

public class Status {

	private Integer statusId;
	private String statusName;
	private String statusDescription;
	private Integer statusGroupId;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	public Status () {
		
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Integer getStatusGroupId() {
		return statusGroupId;
	}

	public void setStatusGroupId(Integer statusGroupId) {
		this.statusGroupId = statusGroupId;
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

	public Status(Integer statusId, String statusName, String statusDescription, Integer statusGroupId,
			Date createdDate, Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
		this.statusDescription = statusDescription;
		this.statusGroupId = statusGroupId;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	
	
}
