package com.xworkz.encapsulation;

public class FlightTester {
	public static void main(String[] args) {
		
		Flight flight=new Flight();
		flight.setFlightName("Indigo");
		flight.setPrice(5000.00);
		flight .setFrom("India");
		flight.setDestination("London");
		
		System.out.println(flight.getFlightName()+" "+flight.getPrice());
		
	}

}
