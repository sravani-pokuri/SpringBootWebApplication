package com.example.signup_signin_functionality.employees.management.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.signup_signin_functionality.employees.management.entity.EmployeesEntity;
import com.example.signup_signin_functionality.employees.management.exceptions.ResourceNotFoundException;
import com.example.signup_signin_functionality.employees.management.service.EmployeesService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeesControler {

	@Autowired
	private EmployeesService employeeService;
	
	@GetMapping
	public ResponseEntity<List<EmployeesEntity>> getAllEmployees(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "6") int size){
		List<EmployeesEntity> returnedList = employeeService.getAllEmployees(page, size);
		return ResponseEntity.ok(returnedList);
	}
	
	@PostMapping
	public ResponseEntity<EmployeesEntity> createEmployee(@Valid @RequestBody EmployeesEntity employee){
		EmployeesEntity createdEmployee = employeeService.createEmployee(employee);
		return ResponseEntity.ok(createdEmployee);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<EmployeesEntity>> getEmployeeById(@PathVariable Long id){
		Optional<EmployeesEntity> retrievedById = employeeService.getEmployeeById(id);
		return ResponseEntity.ok(retrievedById);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployeeById(@PathVariable Long id){
		 employeeService.deleteEmployeeById(id);
	}

	
	@PutMapping("/{id}")
	public EmployeesEntity updateEmployeeById(@PathVariable Long id, @RequestBody EmployeesEntity employee) {
		EmployeesEntity updatedEmployee = employeeService.updateEmployeesById(id, employee);
	     if(updatedEmployee == null) {       
	    	 throw new ResourceNotFoundException("Employee not found with id "+employee.getId());
	     }
	     return updatedEmployee;
	}


}
