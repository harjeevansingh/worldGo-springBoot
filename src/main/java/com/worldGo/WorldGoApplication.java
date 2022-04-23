package com.worldGo;

import com.worldGo.dto.FlightDTO;
import com.worldGo.services.FlightService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

@SpringBootApplication
public class WorldGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldGoApplication.class, args);
		FlightService service;
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(WorldGoApplication.class,
				args);
		service = (FlightService) context.getBean("flightService");
		List<FlightDTO> listFlight = service.fetchFlights();

		System.out.println("FlightID" + "   " + "Airlines" + "   " + "Source" + "     " + "Destination" + "     " + "Fare" + "     " + "SeatCount");
		for (FlightDTO flight : listFlight) {
//			System.out.format("%5d%10s%20s%10s", customerDTO2.getPhoneNo(), customerDTO2.getName(),
//					customerDTO2.getEmail(), customerDTO2.getAddress());
			System.out.format("%5d%10s%20s%10s%10f%10d", flight.getFlightId(), flight.getAirlines(),
					flight.getSource(), flight.getDestination(), flight.getFare(), flight.getSeatCount());
			System.out.println();
		}
	}






}
