package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.QuotationEnquiry;
import com.home.practice.repository.QuotationEnquiryRepository;

@Service
public class QuotationEnquiryBo {

	@Autowired
	QuotationEnquiryRepository quotationEnquiryRepository;

	public QuotationEnquiry saveQuotationEnquiry(QuotationEnquiry quotationEnquiry) {
		quotationEnquiryRepository.save(quotationEnquiry);
		return quotationEnquiry;
	}

	public List<QuotationEnquiry> getAllQuotationEnquiry() {
		return quotationEnquiryRepository.findAll();
	}

	public QuotationEnquiry updateQuotationEnquiry(QuotationEnquiry quotationEnquiry) {
		quotationEnquiryRepository.save(quotationEnquiry);
		return quotationEnquiry;
	}

	public String deleteQuotationEnquiry(Integer id) {
		quotationEnquiryRepository.deleteById(id);
		return "{\"status\": true, message: \"QuotationEnquiry record deleted successfully\"}";
	}
}
