package com.home.practice.entity;

import java.util.Date;
@Entity
@Table(name = "Payment_mode)
public class PaymentMode {

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
	@Column
	public Integer getPaymentModeId() {
		return paymentModeId;
	}

	public void setPaymentModeId(Integer paymentModeId) {
		this.paymentModeId = paymentModeId;
	}
        @Column
	public String getPaymentModeName() {
		return paymentModeName;
	}

	public void setPaymentModeName(String paymentModeName) {
		this.paymentModeName = paymentModeName;
	}

	@Column
	public String getPaymentModeDescription() {
		return paymentModeDescription;
	}

	public void setPaymentModeDescription(String paymentModeDescription) {
		this.paymentModeDescription = paymentModeDescription;
	}

	@Column
	public Integer getPaymentModeStatus() {
		return paymentModeStatus;
	}

	public void setPaymentModeStatus(Integer paymentModeStatus) {
		this.paymentModeStatus = paymentModeStatus;
	}

	@Column
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column
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
