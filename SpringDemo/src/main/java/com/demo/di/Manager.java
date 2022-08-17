package com.demo.di;

import org.springframework.stereotype.Component;


public class Manager implements Employee {
//	int id;
//	String name;
//	
//
//	public Manager(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	Employee emp1;
	Employee emp2;

	public Manager(Employee emp1,Employee emp2) {
		super();
		this.emp1 = emp1;
		this.emp2=emp2;
	}
	
	
	

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("Manage the branch office and other employees too");

	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("Office paid to manager 70000");

	}
	public void callMeeting() {
		emp1.dowork();
		emp2.dowork();
	}

}
