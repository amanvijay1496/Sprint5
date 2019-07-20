package com.cg.flightreservationsystem.entity;

public class RouteDTO {

	private String routeId;
	private String sourceCity;
	private String destinationCity;
	public String getRouteId() {
		return routeId;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	
}
