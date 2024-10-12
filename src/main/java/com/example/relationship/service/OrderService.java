package com.example.relationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationship.entities.Order;
import com.example.relationship.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order save(Order order) {
		
		return orderRepository.save(order);
	}

	public List<Order> getAllOrders() {
		
		return orderRepository.findAll();
	}

}
