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

	@GetMapping(value = "orderItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderItem> getAllOrderItem() {
		return orderItemBo.getAllOrderItem();
	}

	@PutMapping(value = "/orderItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderItem updateOrderItem(@RequestBody OrderItem orderItem) {
		return orderItemBo.updateOrderItem(orderItem);
	}

	@DeleteMapping(value = "/orderItem/{orderItemId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteOrderItem(@PathVariable("orderItemId") Integer id) {
		return orderItemBo.deleteOrderItem(id);
	}
}
