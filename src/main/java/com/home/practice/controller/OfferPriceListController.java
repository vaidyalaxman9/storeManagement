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

import com.home.practice.bo.OfferPriceListBo;
import com.home.practice.entity.OfferPriceList;

@RestController
@RequestMapping("/offerPriceList")
public class OfferPriceListController {

	@Autowired
	OfferPriceListBo offerPriceListBo;

	@PostMapping(value = "/offerPriceList", produces = MediaType.APPLICATION_JSON_VALUE)
	public OfferPriceList saveOfferPriceList(@RequestBody OfferPriceList offerPriceList) {
		return offerPriceListBo.saveOfferPriceList(offerPriceList);
	}

	@GetMapping(value = "offerPriceList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OfferPriceList> getAllOfferPriceList() {
		return offerPriceListBo.getAllOfferPriceList();
	}

	@PutMapping(value = "/offerPriceList", produces = MediaType.APPLICATION_JSON_VALUE)
	public OfferPriceList updateOfferPriceList(@RequestBody OfferPriceList offerPriceList) {
		return offerPriceListBo.updateOfferPriceList(offerPriceList);
	}

	@DeleteMapping(value = "/offerPriceList/{priceListId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteOfferPriceList(@PathVariable("priceListId") Integer id) {
		return offerPriceListBo.deleteOfferPriceList(id);
	}
}
