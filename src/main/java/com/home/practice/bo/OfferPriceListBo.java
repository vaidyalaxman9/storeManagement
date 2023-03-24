package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.OfferPriceList;
import com.home.practice.repository.OfferPriceListRepository;

@Service
public class OfferPriceListBo {

	@Autowired
	OfferPriceListRepository offerPriceListRepository;

	public OfferPriceList saveOfferPriceList(OfferPriceList offerPriceList) {
		offerPriceListRepository.save(offerPriceList);
		return offerPriceList;
	}

	public List<OfferPriceList> getAllOfferPriceList() {
		return offerPriceListRepository.findAll();
	}

	public OfferPriceList updateOfferPriceList(OfferPriceList offerPriceList) {
		offerPriceListRepository.save(offerPriceList);
		return offerPriceList;
	}

	public String deleteOfferPriceList(Integer id) {
		offerPriceListRepository.deleteById(id);
		return "{\"status\": true, message: \"OfferPriceList record deleted successfully\"}";
	}
}
