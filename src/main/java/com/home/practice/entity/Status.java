package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer statusId;
	private String statusName;
	private String statusDescription;
	private Integer statusGroupId;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public Status() {
		super();
	}

	public Status(Integer statusId, String statusName, Integer statusGroupId) {
		this.statusId = statusId;
		this.statusName = statusName;
		this.statusGroupId = statusGroupId;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "status_id", unique = true, nullable = false)
	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Column(name = "status_name", nullable = false, length = 15)
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Column(name = "status_description", length = 50)
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
