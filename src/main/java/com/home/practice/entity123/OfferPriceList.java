package com.home.practice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offer_price_list")
public class OfferPriceList implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer priceListId;
	private Integer offerId;
	private Integer productId;
	private Integer offerPrice;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public OfferPriceList() {
		super();
	}

	public OfferPriceList(Integer priceListId, Integer offerId, Integer productId) {
		this.priceListId = priceListId;
		this.offerId = offerId;
		this.productId = productId;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "offer_price_list_id", unique = true, nullable = false)
	public Integer getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}

	@Column(name = "order_id")
	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	@Column(name = "product_id")
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "offer_price")
	public Integer getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(Integer offerPrice) {
		this.offerPrice = offerPrice;
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
