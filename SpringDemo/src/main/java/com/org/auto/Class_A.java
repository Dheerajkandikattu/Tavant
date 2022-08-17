package com.org.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Class_A {
	Class_B b;
	
	public Class_A()
	{
		super();
		System.out.println("Class A constructor");
	}
	public Class_B getb()
	{
		return b;
	}
	public void setb(Class_B b)
	{
		this.b=b;
	}
	void print()
	{
		System.out.println("Inside class A");
	}
	void display()
	{
		print();
		b.print();
	}

}
