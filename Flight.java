package com.xworkz.encapsulation;

public class Flight {
	private String flightName;
	private double price;
	private String from;
	private String destination;

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
