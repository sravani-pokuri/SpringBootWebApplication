package com.example.signup_signin_functionality.employees.management.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.signup_signin_functionality.employees.management.entity.EmployeesEntity;
import com.example.signup_signin_functionality.employees.management.exceptions.ResourceNotFoundException;
import com.example.signup_signin_functionality.employees.management.repository.EmployeesRepository;
import jakarta.validation.Valid;

@Service
public class EmployeesServiceImpl implements EmployeesService{
	@Autowired
	private EmployeesRepository employeesRepository;
	@Override
	@Cacheable("employees")
	public List<EmployeesEntity> getAllEmployees(int page, int size) {
		Pageable paging = PageRequest.of(page,size);
		Page<EmployeesEntity> pagedResult = employeesRepository.findAll(paging);
		return pagedResult.toList();
	}

	@Override
	public EmployeesEntity createEmployee(@Valid EmployeesEntity employee) {
		
		return employeesRepository.save(employee);
	}

	@Override
	public Optional<EmployeesEntity> getEmployeeById(Long id) {
		
		return employeesRepository.findById(id);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeesRepository.deleteById(id);
		
	}

	@Override
	public EmployeesEntity updateEmployeesById(Long id, EmployeesEntity employee) {
		EmployeesEntity existingemployee = employeesRepository.findById(id)
				                         .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
		
			
		existingemployee.setAddress(employee.getAddress());
		existingemployee.setAge(employee.getAge());
		existingemployee.setCity(employee.getCity());
		
		return employeesRepository.save(existingemployee);
	}

	
	


}
