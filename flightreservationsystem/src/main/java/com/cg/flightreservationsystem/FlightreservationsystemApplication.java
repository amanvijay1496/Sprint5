package com.cg.flightreservationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cg.flightreservationsystem"})
public class FlightreservationsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightreservationsystemApplication.class, args);
	}

}
