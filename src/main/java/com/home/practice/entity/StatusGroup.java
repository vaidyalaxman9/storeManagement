package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status_group")
public class StatusGroup implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer statusGroupId;
	private String statusGroupName;
	private String statusGroupDescription;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public StatusGroup() {

	}

	public StatusGroup(String statusGroupName) {
		super();
		this.statusGroupName = statusGroupName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "status_group_id", unique = true, nullable = false)
	public Integer getStatusGroupId() {
		return statusGroupId;
	}

	public void setStatusGroupId(Integer statusGroupId) {
		this.statusGroupId = statusGroupId;
	}

	@Column(name = "status_group_name", nullable = false, length = 15)
	public String getStatusGroupName() {
		return statusGroupName;
	}

	public void setStatusGroupName(String statusGroupName) {
		this.statusGroupName = statusGroupName;
	}

	@Column(name = "status_group_description", length = 30)
	public String getStatusGroupDescription() {
		return statusGroupDescription;
	}

	public void setStatusGroupDescription(String statusGroupDescription) {
		this.statusGroupDescription = statusGroupDescription;
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
