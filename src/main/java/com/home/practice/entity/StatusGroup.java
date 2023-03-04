package com.home.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the status_group database table.
 * 
 */
@Entity
@Table(name="status_group")
@NamedQuery(name="StatusGroup.findAll", query="SELECT s FROM StatusGroup s")
public class StatusGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="status_group_id")
	private int statusGroupId;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="status_group_description")
	private String statusGroupDescription;

	@Column(name="status_group_name")
	private String statusGroupName;

	@Column(name="updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to Status
	@OneToMany(mappedBy="statusGroup")
	private List<Status> statuses;

	public StatusGroup() {
	}

	public int getStatusGroupId() {
		return this.statusGroupId;
	}

	public void setStatusGroupId(int statusGroupId) {
		this.statusGroupId = statusGroupId;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatusGroupDescription() {
		return this.statusGroupDescription;
	}

	public void setStatusGroupDescription(String statusGroupDescription) {
		this.statusGroupDescription = statusGroupDescription;
	}

	public String getStatusGroupName() {
		return this.statusGroupName;
	}

	public void setStatusGroupName(String statusGroupName) {
		this.statusGroupName = statusGroupName;
	}

	public int getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<Status> getStatuses() {
		return this.statuses;
	}

	public void setStatuses(List<Status> statuses) {
		this.statuses = statuses;
	}

	public Status addStatus(Status status) {
		getStatuses().add(status);
		status.setStatusGroup(this);

		return status;
	}

	public Status removeStatus(Status status) {
		getStatuses().remove(status);
		status.setStatusGroup(null);

		return status;
	}

}