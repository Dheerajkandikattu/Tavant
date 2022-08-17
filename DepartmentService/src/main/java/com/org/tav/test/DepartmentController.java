package com.org.tav.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")

public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@PostMapping
	public Department saveDepartment(@RequestBody Department d)
	{
		return service.saveDepartment(d);
	}
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long id)
	{
		return service.findDepartmentById(id);
	}
	
	
}
