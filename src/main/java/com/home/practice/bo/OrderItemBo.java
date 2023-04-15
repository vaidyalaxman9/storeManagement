package com.home.practice.bo;

import java.util.List;

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

	public List<OrderItem> getAllOrderItem() {
		return orderItemRepository.findAll();
	}

	public OrderItem updateOrderItem(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
		return orderItem;
	}

	public String deleteOrderItem(Integer id) {
		orderItemRepository.deleteById(id);
		return "{\"status\": true, message: \"OrderItem record deleted successfully\"}";
	}

}
