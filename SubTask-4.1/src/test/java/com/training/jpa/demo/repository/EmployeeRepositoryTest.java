package com.training.jpa.demo.repository;

import java.text.ParseException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.jpa.demo.entity.Employee;

@SpringBootTest
public class EmployeeRepositoryTest {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void saveEmployee() throws ParseException {
		
			
		Employee renee = new Employee("Renee_bauer", "renee_bauer70@hotmail.com",2,new SimpleDateFormat("dd/MM/yyyy").parse("12/12/1994"));
		Employee raj = new Employee("Raj Chawanda", "raj_chawanda@hotmail.com",3,new SimpleDateFormat("dd/MM/yyyy").parse("05/09/1988"));
		Employee neil = new Employee("Neil Parks", "neil_parks82@hotmail.com",3,new SimpleDateFormat("dd/MM/yyyy").parse("13/04/1989"));
		Employee marcia = new Employee("Marcia_Lin", "Marcia_Lin89@hotmail.com",4,new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1994"));
		Employee ryan = new Employee("Ryan Sato", "ryan.sato@loonycorn.com",4,new SimpleDateFormat("dd/MM/yyyy").parse("02/12/1987"));
		Employee kweiss = new Employee("Kyra Weiss", "kweiss.diallonics@gmail.com",3,new SimpleDateFormat("dd/MM/yyyy").parse("20/06/1986"));
		Employee marcia1 = new Employee("Marcia_Lin", "Marcia.Linloonycorn.com",2,new SimpleDateFormat("dd/MM/yyyy").parse("12/12/1996"));
		
		
		employeeRepository.save(renee);
		employeeRepository.save(raj);
		employeeRepository.save(neil);
		employeeRepository.save(marcia);
		employeeRepository.save(ryan);
		employeeRepository.save(kweiss);
		employeeRepository.save(marcia1);
	}
		
		@Test
		public void orQuery() {
		
		System.out.println("\n****************");
		System.out.println("\nRetrieving Employees by name or email");
		
		
		System.out.println("\nBoth name and email match");
		List<Employee> empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Parks", "neil_parks82@hotmail.com");
		System.out.println("Returned data: " +empsByNameOrEmail.toString());

		System.out.println("\nonly name matches");
		empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Parks", "neil_parks@looycorn.com");
		System.out.println("Returned data: " +empsByNameOrEmail.toString());
		
		System.out.println("\nonly email matches");
		empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Gardener", "neil_parks82@hotmail.com");
		System.out.println("Returned data: " +empsByNameOrEmail.toString());
		
		System.out.println("\nNeither name nor email match");
		empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Gardener", "neil_parks@looycorn.com");
		System.out.println("Returned data: " +empsByNameOrEmail.toString());
		
		System.out.println("\nName and Email match different people");
		empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Parks", "renee_bauer70@hotmail.com");
		System.out.println("Returned data: " +empsByNameOrEmail.toString());
		
		System.out.println("\n*****************");
	
	}
    @Test
	public void andQuery() {
    	
    	System.out.println("\n****************");
		System.out.println("\nRetrieving Employees by name And email");
		
		
		System.out.println("\nName and level match 1 employees");
		List<Employee> empsByNameAndlevel = employeeRepository.findByNameAndLevel("Marcia_Lin", 4);
		System.out.println("Returned data: " +empsByNameAndlevel.toString());
		
		System.out.println("\nName and level match 0 employees");
		 empsByNameAndlevel = employeeRepository.findByNameAndLevel("Marcia_Lin", 5);
		System.out.println("Returned data: " +empsByNameAndlevel.toString());
		
		System.out.println("\n****************");
		System.out.println("\nRetrieving Employees by Name");
		
		System.out.println("\nfindByName");
		List<Employee> empsByName = employeeRepository.findByName("Raj Chawanda");
		System.out.println("Returned data: " +empsByName.toString());
		
		System.out.println("\nfindByNameIs");
		empsByName = employeeRepository.findByNameIs("Raj Chawanda");
		System.out.println("Returned data: " +empsByName.toString());
		
		System.out.println("\nfindByNameEquals");
		empsByName = employeeRepository.findByNameEquals("Raj Chawanda");
		System.out.println("Returned data: " +empsByName.toString());
		
		System.out.println("\nfindByNameIsNot");
		empsByName = employeeRepository.findByNameEquals("Raj Chawanda");
		System.out.println("Returned data: " +empsByName.toString());
		
		
	}
    
    @Test
    public void likeOperator() {
    	
    	System.out.println("\n***********");
    	System.out.println("\nRetrieving Employees by name");
    	
    	System.out.println("\nfindByNameStartsWith");
    	List<Employee> empsByName = employeeRepository.findByNameStartsWith("R");
    	System.out.println("Returned data: "+empsByName.toString());
    	
    	System.out.println("\nfindByNameEndingWith");
    	empsByName = employeeRepository.findByNameEndingWith("Lin");
    	System.out.println("Returned data: "+empsByName.toString());
    	
    	System.out.println("\nfindByNameIgnoreCase");
    	empsByName = employeeRepository.findByNameIgnoreCase("reneE_baUer");
    	System.out.println("Returned data: "+empsByName.toString());
    	
    	System.out.println("\nfindByNameLike");
    	empsByName = employeeRepository.findByNameLike("%Weis%");
    	System.out.println("Returned data: "+empsByName.toString());
    	
    	System.out.println("\nfindFirstByName");
    	Employee emp = employeeRepository.findFirstByName("Marcia_Lin");
    	System.out.println("Returned data: "+emp.toString());
    	
    	System.out.println("\nfindFirstByNameOrderByLevelAsc");
    	emp = employeeRepository.findFirstByNameOrderByLevelAsc("Marcia_Lin");
    	System.out.println("Returned data: "+emp.toString());
    	
    	System.out.println("\n***********");
    	System.out.println("\nRetrieving Employees by email");
    	
    	System.out.println("\nfindByEmailContaining");
    	List<Employee> empsByEmail = employeeRepository.findByEmailContaining("ar");
    	System.out.println("Returned data: "+empsByEmail.toString());
    	
    	System.out.println("\nfindFirstByOrderByEmail");
    	Employee empByEmail = employeeRepository.findFirstByOrderByEmail();
    	System.out.println("Returned data: "+empByEmail.toString());
    	
    }
    
    @Test
    public void ranges() throws ParseException {
    	
    	System.out.println("\n***********");
    	System.out.println("\nRetrieving Employees by level");
    	
    	System.out.println("\nfindByLevelLessThan");
    	List<Employee> emps = employeeRepository.findByLevelLessThan(3);
    	System.out.println("Returned data : "+emps.toString());
    	
    	System.out.println("\nfindByLevelLessThanEqual");
    	 emps = employeeRepository.findByLevelLessThanEqual(3);
    	System.out.println("Returned data : "+emps.toString());
    	
    	System.out.println("\nfindByLevelGreaterThan");
   	    emps = employeeRepository.findByLevelGreaterThan(3);
   	    System.out.println("Returned data : "+emps.toString());
   	    
   	    System.out.println("\nfindFirst2ByLevelOrderByBirthDateDesc");
	    emps = employeeRepository.findFirst2ByLevelOrderByBirthDateDesc(3);
	    System.out.println("Returned data : "+emps.toString());
	    
	    System.out.println("\n***********");
    	System.out.println("\nRetrieving Employees by birth date");
    	
    	Date refDate = new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1994");
    	
    	System.out.println("\nfindByBirthDateBefore");
   	     emps = employeeRepository.findByBirthDateBefore(refDate);
   	    System.out.println("Returned data : "+emps.toString());
   	
   	    System.out.println("\nfindByBirthDateAfter");
	     emps = employeeRepository.findByBirthDateAfter(refDate);
	    System.out.println("Returned data : "+emps.toString());
	    
	    System.out.println("\nfindByBirthDateBetween");
	    Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1988");
	     emps = employeeRepository.findByBirthDateBetween(startDate,refDate);
	    System.out.println("Returned data : "+emps.toString());
	    
	    System.out.println("\nfindTopByOrderByBirthDateDesc");
	     Employee emp = employeeRepository.findTopByOrderByBirthDateDesc();
	    System.out.println("Returned data : "+emp.toString());
	     	
    }
}
