package com.home.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.OrderBo;
import com.home.practice.entity.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderBo orderBo;

	@PostMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE)
	public Order saveOrder(@RequestBody Order order) {
		return orderBo.saveOrder(order);
	}

	@GetMapping(value = "order", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Order> getAllOrder() {
		return orderBo.getAllOrder();
	}
}
