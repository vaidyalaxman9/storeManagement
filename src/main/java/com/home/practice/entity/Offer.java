package com.home.practice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "offer")
public class Offer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "offer_id", unique = true, nullable = false)
	private int offerId;

	@Column(name = "banner_location", length = 50)
	private String bannerLocation;

	@Column(name = "created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 26)
	private Date createdDate;

	@Column(name = "offer_approvedby", length = 20)
	private String offerApprovedby;

	@Column(name = "offer_description", length = 50)
	private String offerDescription;

	@Temporal(TemporalType.DATE)
	@Column(name = "offer_end_date", length = 26)
	private Date offerEndDate;

	@Column(name = "offer_name", nullable = false, length = 20)
	private String offerName;

	@Temporal(TemporalType.DATE)
	@Column(name = "offer_start_date", length = 26)
	private Date offerStartDate;

	@Column(name = "updated_by")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 26)
	private Date updatedDate;

	@ManyToOne
	@JoinColumn(name = "offer_status")
	private Status status;

	@JsonIgnore
	@OneToMany(mappedBy = "offer", fetch = FetchType.LAZY)
	private List<OfferPriceList> offerPriceLists;

	public Offer() {
		super();
	}

	public int getOfferId() {
		return this.offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getBannerLocation() {
		return this.bannerLocation;
	}

	public void setBannerLocation(String bannerLocation) {
		this.bannerLocation = bannerLocation;
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

	public String getOfferApprovedby() {
		return this.offerApprovedby;
	}

	public void setOfferApprovedby(String offerApprovedby) {
		this.offerApprovedby = offerApprovedby;
	}

	public String getOfferDescription() {
		return this.offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public Date getOfferEndDate() {
		return this.offerEndDate;
	}

	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}

	public String getOfferName() {
		return this.offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public Date getOfferStartDate() {
		return this.offerStartDate;
	}

	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
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

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<OfferPriceList> getOfferPriceLists() {
		return this.offerPriceLists;
	}

	public void setOfferPriceLists(List<OfferPriceList> offerPriceLists) {
		this.offerPriceLists = offerPriceLists;
	}

	public OfferPriceList addOfferPriceList(OfferPriceList offerPriceList) {
		getOfferPriceLists().add(offerPriceList);
		offerPriceList.setOffer(this);

		return offerPriceList;
	}

	public OfferPriceList removeOfferPriceList(OfferPriceList offerPriceList) {
		getOfferPriceLists().remove(offerPriceList);
		offerPriceList.setOffer(null);

		return offerPriceList;
	}

}