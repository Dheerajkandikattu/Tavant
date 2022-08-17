package com.org.SpringDemo;

import org.springframework.context.ApplicationContext;
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
        
        HelloWorldService he=con.getBean("hellobean",HelloWorldService.class);
        Vendor1 win=con.getBean("win", Vendor1.class);
        Vendor2 door=con.getBean("door", Vendor2.class);
        win.windowDemo();
        door.DoorDemo();

        he.hello();
    }
}
