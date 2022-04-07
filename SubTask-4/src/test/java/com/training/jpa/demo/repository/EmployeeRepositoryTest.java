package com.training.jpa.demo.repository;

import java.util.List;
import java.util.Optional;

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
		
		Employee renee = new Employee("Renee Bauer", "renee_bauer70@hotmail.com");
		Employee raj = new Employee("Raj Chawanda", "raj_chawanda@hotmail.com");
		Employee neil = new Employee("Neil Parks", "neil_parks82@hotmail.com");
		Employee marcia= new Employee("Marcia_Lin", "Marcia_Lin89@hotmail.com");
		Employee ryan = new Employee("Rayan Sato", "ryan.sato@loonycorn.com");
		Employee kyra= new Employee("Kyra Weiss", "kweiss.diallonics@gmail.com");
		
		employeeRepository.save(renee);
		employeeRepository.save(raj);
		employeeRepository.save(neil);
		employeeRepository.save(marcia);
		employeeRepository.save(ryan);
		employeeRepository.save(kyra);
	}
	
	@Test
	public void allRows() {
		
		//retrieve all rows
		System.out.println("\n**********");
		System.out.println("\nRetrieving all employee data...\n");
		for(Employee em : employeeRepository.findAll()) {
			System.out.println(em.toString());
		}
		System.out.println("\n*********");
	}
	
	@Test
	public void specificRow() {
		
		//retrieve specific row
		System.out.println("\n**********");
		System.out.println("\nRetrieving data for one employee...\n");
		Employee em = employeeRepository.findById(35).get();
		System.out.println(em.toString());
		System.out.println("\n********");
	}
	
	@Test
	public void emailBased() {
		
		
		//retrieve an employee based on email address
		System.out.println("\n**********");
		System.out.println("\nRetrieving an employee based on email address...\n");
		Employee employeeByEmail = employeeRepository.findByEmail("raj_chawanda@hotmail.com");
		System.out.println(employeeByEmail.toString());
		System.out.println("\n********");
	}
	
	/*@Test
	public void nameBased() {
		
		employeeRepository.save(new Employee("santosh", "santosh@gmail.com"));
		
		System.out.println("\n**********");
		System.out.println("\nRetrieving employees based on name...\n");
		List<Employee> employeesByName = employeeRepository.findByName("Renee Bauer");
		System.out.println(employeesByName.toString());
		System.out.println("\n********");
	}
		
	@Test
	public void idBased() {
		
		//no matching records found, the name which doesnot exists in the database
		// use optional employee instance
		System.out.println("\n**********");
		System.out.println("\nRetrieving employees based on name...\n");
		Optional<List<Employee>> employeesByName = employeeRepository.findByName("Reethu");
		System.out.println(employeesByName.toString());
		System.out.println("\n********");
		
		
		System.out.println("\n**********");
		System.out.println("\nRetrieving employees based on id...\n");
		Optional<Employee> employeeById = employeeRepository.findById(25);
		System.out.println(employeeById.toString());
		System.out.println("\n********");
	}
	
	@Test
	public void update() {
		
		
		//Update an existing record in a table
		
		Optional<Employee> emp = employeeRepository.findByEmail("raj_chawanda@hotmail.com");
		
		if(emp.isPresent()) {
			
			Employee retrievedEmp = emp.get();
			retrievedEmp.setEmail("raj_chawanda@hotmail.com");
			
			employeeRepository.save(retrievedEmp);
			
			System.out.println("\n**********");
			System.out.println("\nEmployee updated");
			System.out.println(retrievedEmp.toString());
			System.out.println("\n**********");
		}
			
}
		
		//delete records
		@Test
		public void delete() {
		
		Employee emp = employeeRepository.findByEmail("supriya28@gmail.com").get();
		employeeRepository.delete(emp);
		
		employeeRepository.deleteById(18);
		
		//will remove all of the rows in the employee table
		//employeeRepository.deleteAll();
		
		
   }*/
}
