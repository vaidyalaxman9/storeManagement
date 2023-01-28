package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer offerId;
	private String offerName;
	private Date offerStartDate;
	private Date offerEndDate;
	private String offerDescription;
	private String offerApprovedBy;
	private String bannerLocation;
	private Integer offerStatus;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public Offer() {
		super();
	}

	public Offer(Integer offerId, String offerName, Integer offerStatus) {
		this.offerId = offerId;
		this.offerName = offerName;
		this.offerStatus = offerStatus;
	}

	public Offer(Integer offerId, String offerName, Date offerStartDate, Date offerEndDate, String offerDescription,
			String offerApprovedBy, String bannerLocation, Integer offerStatus, Date createdDate, Integer createdBy,
			Date updatedDate, Integer updatedBy) {
		super();
		this.offerId = offerId;
		this.offerName = offerName;
		this.offerStartDate = offerStartDate;
		this.offerEndDate = offerEndDate;
		this.offerDescription = offerDescription;
		this.offerApprovedBy = offerApprovedBy;
		this.bannerLocation = bannerLocation;
		this.offerStatus = offerStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "offer_id", unique = true, nullable = false)
	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	@Column(name = "offer_name", nullable = false, length = 20)
	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	@Column(name = "offer_start_date", length = 26)
	public Date getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}

	@Column(name = "offer_end_date", length = 26)
	public Date getOfferEndDate() {
		return offerEndDate;
	}

	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}

	@Column(name = "offer_description", length = 50)
	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	@Column(name = "offer_aprovedby", length = 20)
	public String getOfferApprovedBy() {
		return offerApprovedBy;
	}

	public void setOfferApprovedBy(String offerApprovedBy) {
		this.offerApprovedBy = offerApprovedBy;
	}

	@Column(name = "banner_location", length = 50)
	public String getBannerLocation() {
		return bannerLocation;
	}

	public void setBannerLocation(String bannerLocation) {
		this.bannerLocation = bannerLocation;
	}

	public Integer getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(Integer offerStatus) {
		this.offerStatus = offerStatus;
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
