package com.example.relationship.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.relationship.entities.Customer;
import com.example.relationship.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		customerService.save(customer);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(customer);
				
	}
	
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
}
