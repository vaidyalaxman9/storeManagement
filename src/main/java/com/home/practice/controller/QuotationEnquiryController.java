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

import com.home.practice.bo.QuotationEnquiryBo;
import com.home.practice.entity.QuotationEnquiry;

@RestController
@RequestMapping("/quotationEnquiry")
public class QuotationEnquiryController {

	@Autowired
	QuotationEnquiryBo quotationEnquiryBo;

	@PostMapping(value = "/quotationEnquiry", produces = MediaType.APPLICATION_JSON_VALUE)
	public QuotationEnquiry saveQuotationEnquiry(@RequestBody QuotationEnquiry quotationEnquiry) {
		return quotationEnquiryBo.saveQuotationEnquiry(quotationEnquiry);
	}

	@GetMapping(value = "quotationEnquiry", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<QuotationEnquiry> getAllQuotationEnquiry() {
		return quotationEnquiryBo.getAllQuotationEnquiry();
	}

	@PutMapping(value = "/quotationEnquiry", produces = MediaType.APPLICATION_JSON_VALUE)
	public QuotationEnquiry updateQuotationEnquiry(@RequestBody QuotationEnquiry quotationEnquiry) {
		return quotationEnquiryBo.updateQuotationEnquiry(quotationEnquiry);
	}

	@DeleteMapping(value = "/quotationEnquiry/{quotationId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteQuotationEnquiry(@PathVariable("quotationId") Integer id) {
		return quotationEnquiryBo.deleteQuotationEnquiry(id);
	}
}
