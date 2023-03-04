package com.home.practice.entity123;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_profile")
public class EmployeeProfile implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer profileId;
	private String profileName;
	private String profileDescription;
	private Integer profileStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public EmployeeProfile() {
		super();
	}

	public EmployeeProfile(Integer profileId, String profileName, Integer profileStatus) {
		this.profileId = profileId;
		this.profileName = profileName;
		this.profileStatus = profileStatus;
	}

	public EmployeeProfile(Integer profileId, String profileName, String profileDescription, Integer profileStatus,
			Date createdDate, Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.profileDescription = profileDescription;
		this.profileStatus = profileStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "profile_id", unique = true, nullable = false)
	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	@Column(name = "profile_name", nullable = false, length = 15)
	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Column(name = "status_group_description", length = 50)
	public String getProfileDescription() {
		return profileDescription;
	}

	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}

	public Integer getProfileStatus() {
		return profileStatus;
	}

	public void setProfileStatus(Integer profileStatus) {
		this.profileStatus = profileStatus;
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
