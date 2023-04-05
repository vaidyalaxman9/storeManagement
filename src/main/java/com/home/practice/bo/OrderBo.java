package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.Order;
import com.home.practice.repository.OrderRepository;

@Service
public class OrderBo {

	@Autowired
	OrderRepository orderRepository;

	public Order saveOrder(Order order) {
		orderRepository.save(order);
		return order;
	}

	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}
}
