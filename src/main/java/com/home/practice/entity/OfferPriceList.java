package com.home.practice.entity;

import java.util.Date;

public class OfferPriceList {

	private Integer priceListId;
	private Integer offerId;
	private Integer productId;
	private Integer offerPrice;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	public OfferPriceList() {
		
	}

	public Integer getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(Integer offerPrice) {
		this.offerPrice = offerPrice;
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

	public OfferPriceList(Integer priceListId, Integer offerId, Integer productId, Integer offerPrice, Date createdDate,
			Integer createdBy, Date updatedDate, Integer updatedBy) {
		super();
		this.priceListId = priceListId;
		this.offerId = offerId;
		this.productId = productId;
		this.offerPrice = offerPrice;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	
	
}