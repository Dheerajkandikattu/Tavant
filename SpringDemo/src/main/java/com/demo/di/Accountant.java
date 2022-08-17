package com.demo.di;

import org.springframework.stereotype.Component;


public class Accountant implements Employee {
	public Accountant()
	{
		super();
		System.out.println("Accountant constructor !!!");
	}

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("Do all the accounting work");

	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("Office paid to accountant 50000");

	}

}
