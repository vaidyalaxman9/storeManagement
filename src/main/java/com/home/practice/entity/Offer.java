package com.home.practice.entity;

import java.util.Date;
@Entity
@Table (name="offer")
public class Offer {

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
		
	}
       @Id
	@GeneratedValue(strategy = IDENTITY)
	@Column
	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}
	 @Column
	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	 @Column
	public Date getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
        @Column
	public Date getOfferEndDate() {
		return offerEndDate;
	}

	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}

        @Column
	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	 @Column
	public String getOfferApprovedBy() {
		return offerApprovedBy;
	}

	public void setOfferApprovedBy(String offerApprovedBy) {
		this.offerApprovedBy = offerApprovedBy;
	}

	 @Column
	public String getBannerLocation() {
		return bannerLocation;
	}

	public void setBannerLocation(String bannerLocation) {
		this.bannerLocation = bannerLocation;
	}

	 @Column
	public Integer getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(Integer offerStatus) {
		this.offerStatus = offerStatus;
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
	
	
}
