package com.worldGo.services;

import com.worldGo.dao.FlightDAO;
import com.worldGo.dto.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("flightService")
public class FlightService {

    @Autowired
    public FlightDAO flightDAO;

    public String addFlight(FlightDTO flight) {
        flightDAO.createFlight(flight);
        return "Customer with to " + flight.getDestination() + " is added successfully";
    }

    public List<FlightDTO> fetchFlights(){
        return flightDAO.fetchFlights();
    }
}
