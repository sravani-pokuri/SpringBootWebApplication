package com.example.relationship.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.relationship.entities.Order;
import com.example.relationship.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/adding")
	public Order createOrder(@RequestBody Order order) {
		return orderService.save(order);
	}
	
	@GetMapping("/all")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

}
