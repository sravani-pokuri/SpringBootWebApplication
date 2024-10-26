package com.example.signup_signin_functionality;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.signup_signin_functionality.employees.management.entity.EmployeesEntity;
import com.example.signup_signin_functionality.employees.management.repository.EmployeesRepository;
import com.example.signup_signin_functionality.employees.management.service.EmployeesServiceImpl;

@SpringBootTest
public class SignupSigninFunctionalityApplicationTests {

	@Mock
	private EmployeesRepository employeeRepository;

	@InjectMocks
	private EmployeesServiceImpl employeesServiceImpl;

	@Test
	public void testGetEmployeesById() {
		EmployeesEntity employee = new EmployeesEntity();
		employee.setId(1L);

		when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));

		Optional<EmployeesEntity> foundEmployee = employeesServiceImpl.getEmployeeById(1L);

		assertTrue(foundEmployee.isPresent());
		assertEquals(1L, foundEmployee.get().getId());
	}

	@Test
	void testCreateEmployee() {
		EmployeesEntity employee = new EmployeesEntity();
		employee.setName("sravani");

		when(employeeRepository.save(employee)).thenReturn(employee);

		EmployeesEntity createdEmployee = employeesServiceImpl.createEmployee(employee);

		assertEquals("sravani", createdEmployee.getName());
	}
}
