package com.cg.flightreservationsystem.entity;

public class FlightViewDTO {

	private String source;
	private String destination;
	private String date;
	private String time;
	private String price;
	private String flightID;
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public String getPrice() {
		return price;
	}
	public String getFlightID() {
		return flightID;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	
}
