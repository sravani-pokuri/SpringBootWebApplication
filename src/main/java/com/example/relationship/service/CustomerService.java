package com.example.relationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.relationship.entities.Customer;
import com.example.relationship.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer customer) {
		customerRepository.save(customer);
		
	}

	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	
}
