package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.QuotationEnquiryItem;
import com.home.practice.repository.QuotationEnquiryItemRepository;

@Service
public class QuotationEnquiryItemBo {

	@Autowired
	QuotationEnquiryItemRepository quotationEnquiryItemRepository;

	public QuotationEnquiryItem saveQuotationEnquiryItem(QuotationEnquiryItem quotationEnquiryItem) {
		quotationEnquiryItemRepository.save(quotationEnquiryItem);
		return quotationEnquiryItem;
	}

	public List<QuotationEnquiryItem> getAllQuotationEnquiryItem() {
		return quotationEnquiryItemRepository.findAll();
	}

	public QuotationEnquiryItem updateQuotationEnquiryItem(QuotationEnquiryItem quotationEnquiryItem) {
		quotationEnquiryItemRepository.save(quotationEnquiryItem);
		return quotationEnquiryItem;
	}

	public String deleteQuotationEnquiryItem(Integer id) {
		quotationEnquiryItemRepository.deleteById(id);
		return "{\"status\": true, message: \"QuotationEnquiryItem record deleted successfully\"}";
	}

}
