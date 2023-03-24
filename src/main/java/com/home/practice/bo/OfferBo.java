package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.Offer;
import com.home.practice.repository.OfferRepository;

@Service
public class OfferBo {

	@Autowired
	OfferRepository offerRepository;

	public Offer saveOffer(Offer offer) {
		offerRepository.save(offer);
		return offer;
	}

	public List<Offer> getAllOffer() {
		return offerRepository.findAll();
	}

	public Offer updateOffer(Offer offer) {
		offerRepository.save(offer);
		return offer;
	}

	public String deleteOffer(Integer id) {
		offerRepository.deleteById(id);
		return "{\"status\": true, message: \"Offer record deleted successfully\"}";
	}
}
