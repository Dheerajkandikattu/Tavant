package com.org.tav.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository repo;
	
	public Department saveDepartment(Department d)
	{
		return repo.save(d);
	}
	public Department findDepartmentById(Long id)
	{
		return repo.findByDepartmentId(id);
	}
	
	
	

}
