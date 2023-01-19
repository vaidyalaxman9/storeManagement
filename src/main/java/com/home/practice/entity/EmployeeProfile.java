package com.home.practice.entity;

import java.util.Date;

public class EmployeeProfile {

	private Integer profileId;
	private String profileName;
	private String profileDescription;
	private Integer profileStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	public EmployeeProfile () {
		
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

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
	
	
}
