package com.home.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.OfferBo;
import com.home.practice.entity.Offer;

@RestController
@RequestMapping("/offer")
public class OfferController {

	@Autowired
	OfferBo offerBo;

	@PostMapping(value = "/offer", produces = MediaType.APPLICATION_JSON_VALUE)
	public Offer saveOffer(@RequestBody Offer offer) {
		return offerBo.saveOffer(offer);
	}

	@GetMapping(value = "offer", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Offer> getAllOffer() {
		return offerBo.getAllOffer();
	}

	@PutMapping(value = "/offer", produces = MediaType.APPLICATION_JSON_VALUE)
	public Offer updateOffer(@RequestBody Offer offer) {
		return offerBo.updateOffer(offer);
	}

	@DeleteMapping(value = "/offer/{offerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteOffer(@PathVariable("offerId") Integer id) {
		return offerBo.deleteOffer(id);
	}
}
