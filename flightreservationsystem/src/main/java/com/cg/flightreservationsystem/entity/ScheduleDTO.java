package com.cg.flightreservationsystem.entity;

public class ScheduleDTO {

	private String scheduleId;
	private String departureTime;
	private String arrivalTime;
	private String departureDate;
	private String arrivalDate;
	private String price;
	public String getScheduleId() {
		return scheduleId;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public String getPrice() {
		return price;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
