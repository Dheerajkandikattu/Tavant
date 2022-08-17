package com.org.tav.emp;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeContoller {
	
	@GetMapping("/employee")
	public Employee firstPage()
	{
		Employee emp=new Employee();
		emp.setName("Dheeraj");
		emp.setDesignation("Manager");
		emp.setEmpId("101");
		emp.setSalary(10000);
		return emp;
	}
	
	

}
