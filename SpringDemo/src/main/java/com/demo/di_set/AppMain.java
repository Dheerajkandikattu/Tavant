package com.demo.di_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext con=new ClassPathXmlApplicationContext("Bean.xml");
		 Employee e=con.getBean("emp1", Employee.class);
		 System.out.println(e);

	}

}
