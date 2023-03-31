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

import com.home.practice.bo.QuotationEnquiryItemBo;
import com.home.practice.entity.QuotationEnquiryItem;

@RestController
@RequestMapping("/quotationEnquiryItem")
public class QuotationEnquiryItemController {

	@Autowired
	QuotationEnquiryItemBo quotationEnquiryItemBo;

	@PostMapping(value = "/quotationEnquiryItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public QuotationEnquiryItem saveQuotationEnquiryItem(@RequestBody QuotationEnquiryItem quotationEnquiryItem) {
		return quotationEnquiryItemBo.saveQuotationEnquiryItem(quotationEnquiryItem);
	}

	@GetMapping(value = "quotationEnquiryItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<QuotationEnquiryItem> getAllQuotationEnquiryItem() {
		return quotationEnquiryItemBo.getAllQuotationEnquiryItem();
	}

	@PutMapping(value = "/quotationEnquiryItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public QuotationEnquiryItem updateQuotationEnquiryItem(@RequestBody QuotationEnquiryItem quotationEnquiryItem) {
		return quotationEnquiryItemBo.updateQuotationEnquiryItem(quotationEnquiryItem);
	}

	@DeleteMapping(value = "/quotationEnquiryItem/{quotationItemId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteQuotationEnquiryItem(@PathVariable("quotationItemId") Integer id) {
		return quotationEnquiryItemBo.deleteQuotationEnquiryItem(id);
	}

}
