package com.worldGo.services;

import com.worldGo.dao.FlightDAO;
import com.worldGo.dto.FlightDTO;
import com.worldGo.entities.Flight;
import com.worldGo.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("flightService")
public class FlightService {

    @Autowired
    public FlightDAO flightDAO;

    @Autowired
    public FlightRepository flightRepository;

    public String addFlight(FlightDTO flight) {
//        flightDAO.createFlight(flight);
        flightRepository.saveAndFlush(FlightDTO.prepareFlightEntity(flight));
        return "Customer with to " + flight.getDestination() + " is added successfully";
    }

    public List<FlightDTO> fetchFlights(){
        return flightRepository.findAll().stream().map(Flight::prepareFlightDTO).toList();
    }
}
