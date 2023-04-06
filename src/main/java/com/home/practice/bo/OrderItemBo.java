package com.home.practice.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.OrderItem;
import com.home.practice.repository.OrderItemRepository;

@Service
public class OrderItemBo {

	@Autowired
	OrderItemRepository orderItemRepository;

	public OrderItem saveOrderItem(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
		return orderItem;
	}
}
