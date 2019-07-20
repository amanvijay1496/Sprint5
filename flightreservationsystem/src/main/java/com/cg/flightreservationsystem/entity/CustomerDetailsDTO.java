package com.cg.flightreservationsystem.entity;

public class CustomerDetailsDTO {

	private String source;
	private String destination;
	private String departureDate;
	private int numberOfPassengers;
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	
}
