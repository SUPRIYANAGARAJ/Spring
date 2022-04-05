package com.training.jpa.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.jpa.demo.entity.Employee;


@SpringBootTest
public class EmployeeRepositoryTest {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void saveEmployee() {
		Employee richard = new Employee("Richard", 2);
		Employee supriya = new Employee("Supriya", 4);
		employeeRepository.save(richard);
		employeeRepository.save(supriya);
		
	}


}
