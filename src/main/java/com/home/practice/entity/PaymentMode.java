package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_mode")
public class PaymentMode implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer paymentModeId;
	private String paymentModeName;
	private String paymentModeDescription;
	private Integer paymentModeStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public PaymentMode() {

	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "payment_mode_id", unique = true, nullable = false)
	public Integer getPaymentModeId() {
		return paymentModeId;
	}

	public void setPaymentModeId(Integer paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	@Column(name = "payment_mode_name", length = 10)
	public String getPaymentModeName() {
		return paymentModeName;
	}

	public void setPaymentModeName(String paymentModeName) {
		this.paymentModeName = paymentModeName;
	}

	@Column(name = "payment_mode_description", length = 50)
	public String getPaymentModeDescription() {
		return paymentModeDescription;
	}

	public void setPaymentModeDescription(String paymentModeDescription) {
		this.paymentModeDescription = paymentModeDescription;
	}

	public Integer getPaymentModeStatus() {
		return paymentModeStatus;
	}

	public void setPaymentModeStatus(Integer paymentModeStatus) {
		this.paymentModeStatus = paymentModeStatus;
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

	public PaymentMode(Integer paymentModeId, String paymentModeName, String paymentModeDescription,
			Integer paymentModeStatus, Date createdDate, Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.paymentModeId = paymentModeId;
		this.paymentModeName = paymentModeName;
		this.paymentModeDescription = paymentModeDescription;
		this.paymentModeStatus = paymentModeStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

}
