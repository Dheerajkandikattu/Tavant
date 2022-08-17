package com.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("Bean.xml");
        Manager mg=con.getBean("manager",Manager.class);
        mg.dowork();
        mg.getsalary();
        mg.callMeeting();
        
    }
}
