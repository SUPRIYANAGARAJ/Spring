package com.training.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.jpa.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
