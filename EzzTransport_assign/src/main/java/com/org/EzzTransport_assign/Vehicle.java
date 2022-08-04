package com.org.EzzTransport_assign;

import java.util.HashMap;
import java.util.Map;

public class Vehicle {
	private String source;
	private Map<String,Double> destinationMap=new HashMap<>();
	public Vehicle()
	{
		
	}
	public Vehicle(String source)
	{
		this.source=source;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Map<String, Double> getDestinationMap() {
		return destinationMap;
	}
	public void setDestinationMap(Map<String, Double> destinationMap) {
		this.destinationMap = destinationMap;
	}
	
	
	

}
