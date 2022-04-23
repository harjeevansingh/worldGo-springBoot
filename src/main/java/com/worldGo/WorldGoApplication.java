package com.worldGo;

import com.worldGo.dto.FlightDTO;
import com.worldGo.services.FlightService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class WorldGoApplication {

	public static void main(String[] args) {
		FlightService service;
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(WorldGoApplication.class,
				args);
		service = (FlightService) context.getBean("flightService");

		// Show all flights
		List<FlightDTO> listFlight = service.fetchFlights();
		System.out.format("%10s%20s%20s%20s%10s%10s", "FlightID", "Airlines", "Source", "Destination", "Fare", "SeatCount");
		System.out.println();
		for (FlightDTO flight : listFlight) {
			System.out.format("%10d%20s%20s%20s%10.2f%10d", flight.getFlightId(), flight.getAirlines(),
					flight.getSource(), flight.getDestination(), flight.getFare(), flight.getSeatCount());
			System.out.println();
		}
		System.out.println();


		// add new flight
		System.out.println("***********   Add your flight details  ***********");
		FlightDTO flight = new FlightDTO();
		Scanner scan = new Scanner(System.in);
		flight.setFlightId(0);
		System.out.println("Enter Airlines name - ");
		flight.setAirlines(scan.nextLine());
		System.out.println("Enter Departure country name - ");
		flight.setSource(scan.nextLine());
		System.out.println("Enter Destination country name - ");
		flight.setDestination(scan.nextLine());
		System.out.println("Enter journey fare amount - ");
		flight.setFare(scan.nextDouble());
		System.out.println("Enter number of passengers - ");
		flight.setSeatCount(scan.nextInt());
		String addFlight = service.addFlight(flight);
		System.out.println(addFlight);

		// Show updated flights
		System.out.println("***********   Updated Flights  ***********");
		List<FlightDTO> listFlight2 = service.fetchFlights();
		System.out.format("%10s%20s%20s%20s%10s%10s", "FlightID", "Airlines", "Source", "Destination", "Fare", "SeatCount");
		System.out.println();
		for (FlightDTO flight2 : listFlight2) {
			System.out.format("%10d%20s%20s%20s%10.2f%10d", flight2.getFlightId(), flight2.getAirlines(),
					flight2.getSource(), flight2.getDestination(), flight2.getFare(), flight2.getSeatCount());
			System.out.println();
		}


	}






}
