package com.home.practice.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.OrderPayment;
import com.home.practice.repository.OrderPaymentRepository;

@Service
public class OrderPaymentBo {

	@Autowired
	OrderPaymentRepository orderPaymentRepository;

	public OrderPayment saveOrderPayment(OrderPayment orderPayment) {
		orderPaymentRepository.save(orderPayment);
		return orderPayment;
	}
}
