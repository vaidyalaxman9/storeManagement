package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.PaymentMode;
import com.home.practice.repository.PaymentModeRepository;

@Service
public class PaymentModeBo {

	@Autowired
	PaymentModeRepository paymentModeRepository;

	public List<PaymentMode> getAllPaymentMode() {
		return paymentModeRepository.findAll();
	}

	public PaymentMode savePaymentMode(PaymentMode paymentMode) {
		paymentModeRepository.save(paymentMode);
		return paymentMode;
	}

	public PaymentMode updatePaymentMode(PaymentMode paymentMode) {
		paymentModeRepository.save(paymentMode);
		return paymentMode;
	}

	public String deletePaymentMode(Integer id) {
		paymentModeRepository.deleteById(id);
		return "{\"status\": true, message: \"paymentMode record deleted successfully\"}";
	}
}
