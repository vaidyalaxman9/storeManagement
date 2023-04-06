package com.home.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.OrderPaymentBo;
import com.home.practice.entity.OrderPayment;

@RestController
@RequestMapping("/orderPayment")
public class OrderPaymentController {

	@Autowired
	OrderPaymentBo orderPaymentBo;

	@PostMapping(value = "/orderPayment", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderPayment saveOrderPayment(@RequestBody OrderPayment orderPayment) {
		return orderPaymentBo.saveOrderPayment(orderPayment);
	}
}
