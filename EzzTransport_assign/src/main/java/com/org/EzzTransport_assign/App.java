package com.org.EzzTransport_assign;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
    	TransportService ts=context.getBean("transportService",TransportService.class);
    	Booking book=context.getBean("booking",Booking.class);
    	book.setCustomername("Dheeraj");
    	book.setDestination("Bangalore");
    	book.setMobileNumber(9493086480L);
        book.setDateOfJourney("25-06-2000");
    	ts.registerBooking(book);
    	ts.calculateTravelCost("Chennai", "Pune", "26-07-2001");
    	System.out.println(ts.checkAvailableDateForTravel("25-06-2001"));
    	System.out.println("The total cost is "+ts.getCost("Hyderabad"));
    	
    	
    }
}
