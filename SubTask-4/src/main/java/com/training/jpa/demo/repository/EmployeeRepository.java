package com.training.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.jpa.demo.entity.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {
	
	Employee findByEmail(String email);
	Employee findByName(String name);
	
	//List<Employee> findByName(String name);
	
	//set this to return either single instance or none at all
	//Optional<Employee> findByEmail(String email);
	//it will return list of employee objects or no employee objects
	//Optional<List<Employee>> findByName(String name);
}
