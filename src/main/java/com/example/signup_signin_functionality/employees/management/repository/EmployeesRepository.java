package com.example.signup_signin_functionality.employees.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.signup_signin_functionality.employees.management.entity.EmployeesEntity;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Long>{

	

	

}
