package com.org.Autowiring_assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
        Employee emp=context.getBean("employee",Employee.class);
        emp.getPassport().setPassNum(123456);
        emp.getPassport().setDateOfIssue("25/06/2022");
        emp.getPassport().setDateOfExpiry("25/06/2046");
        emp.setEmpId(12);
        emp.setEmpName("Dheeraj");
        System.out.println(emp.toString());
    }
}
