package com.example.signup_signin_functionality.employees.management.service;

import java.util.List;
import java.util.Optional;
import com.example.signup_signin_functionality.employees.management.entity.EmployeesEntity;
import jakarta.validation.Valid;


public interface EmployeesService {

	public List<EmployeesEntity> getAllEmployees(int page, int size) ;
		public EmployeesEntity createEmployee(@Valid EmployeesEntity employee);
		public Optional<EmployeesEntity> getEmployeeById(Long id);
		public void deleteEmployeeById(Long id);
		public EmployeesEntity updateEmployeesById(Long id, EmployeesEntity employee);
		
	}
	
	

