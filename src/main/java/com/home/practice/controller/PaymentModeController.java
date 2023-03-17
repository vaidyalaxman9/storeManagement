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

import com.home.practice.bo.PaymentModeBo;
import com.home.practice.entity.PaymentMode;

@RestController
@RequestMapping("/paymentMode")
public class PaymentModeController {

	@Autowired
	PaymentModeBo paymentModeBo;

	@GetMapping(value = "paymentMode", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PaymentMode> getAllPayementMode() {
		return paymentModeBo.getAllPaymentMode();
	}

	@PostMapping(value = "/paymentMode", produces = MediaType.APPLICATION_JSON_VALUE)
	public PaymentMode savePaymentMode(@RequestBody PaymentMode paymentMode) {
		return paymentModeBo.savePaymentMode(paymentMode);
	}

	@PutMapping(value = "/paymentMode", produces = MediaType.APPLICATION_JSON_VALUE)
	public PaymentMode updatePaymentMode(@RequestBody PaymentMode paymentMode) {
		return paymentModeBo.updatePaymentMode(paymentMode);
	}

	@DeleteMapping(value = "/paymentMode/{paymentModeId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deletePaymentMode(@PathVariable("paymentModeId") Integer id) {
		return paymentModeBo.deletePaymentMode(id);
	}
}
