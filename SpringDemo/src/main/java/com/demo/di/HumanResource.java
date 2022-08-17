package com.demo.di;

import org.springframework.stereotype.Component;


public class HumanResource implements Employee {
	public HumanResource()
	{
		super();
		System.out.println("Human resource comsturctor");
	}

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("working as a human resource manager and convert human into resources");

	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub

		System.out.println("Office paid to HR 60000 rs per month");
	}

}
