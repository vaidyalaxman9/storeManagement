package com.home.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.OrderItemBo;
import com.home.practice.entity.OrderItem;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

	@Autowired
	OrderItemBo orderItemBo;

	@PostMapping(value = "/orderItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderItem saveOrderItem(@RequestBody OrderItem orderItem) {
		return orderItemBo.saveOrderItem(orderItem);
	}

}
