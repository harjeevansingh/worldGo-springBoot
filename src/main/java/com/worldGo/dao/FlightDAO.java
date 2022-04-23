package com.worldGo.dao;

import com.worldGo.dto.FlightDTO;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightDAO {
    List<FlightDTO> flights = null;
    private static int flightId;

    public FlightDAO(){

    }

    @PostConstruct
    public void initializer(){
        FlightDTO flight = new FlightDTO();
        flight.setFlightId(1000);
        flight.setAirlines("Emirates");
        flight.setDestination("Dubai");
        flight.setFare(199999.0);
        flight.setSource("Delhi");

        flights = new ArrayList<>();
        flights.add(flight);
    }

    // Add new flight
    public void createFlight(FlightDTO flight){
        flightId += 1;
        flight.setFlightId(flightId);
        flights.add(flight);
    }

    // return list of flights
    public List<FlightDTO> fetchFlights(){
        return flights;
    }
}
