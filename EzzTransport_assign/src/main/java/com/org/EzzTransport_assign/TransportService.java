package com.org.EzzTransport_assign;

import java.text.ParseException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;


public class TransportService {
	private Vehicle vehicle;
	private ArrayList<Booking> bookings=new ArrayList<>();
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void registerBooking(Booking booking) 
	{
		
		bookings.add(booking);
		
	}
	public void calculateTravelCost(String source,String destination,String doj)
	{
		if(checkAvailableDateForTravel(doj))
			System.out.println("Total travel cost is "+getCost(destination));
	}
	public boolean checkAvailableDateForTravel(String doj)
	{
		for(Booking b:bookings)
		{
			if(doj.equals(b.getDateOfJourney()))
				return false;
		}
		return true;
	}
	public double getCost(String destination)
	{
		return vehicle.getDestinationMap().get(destination);
	}
	
	

}
