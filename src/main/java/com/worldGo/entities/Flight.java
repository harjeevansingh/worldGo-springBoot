package com.worldGo.entities;

import com.worldGo.dto.FlightDTO;

import javax.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flight_Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer flightId;

    @Column(name = "airlines", length = 100)
    private String airlines;

    @Column(name = "source", length = 100)
    private String source;

    @Column(name = "destination", length = 100)
    private String destination;

    @Column(name = "fare")
    private Double fare;

    @Column(name = "seat_count")
    private Integer seatCount;

    public Flight(){}

    public Flight(Integer flightId, String airlines, String source, String destination, Double fare, Integer seatCount){
        this.flightId = flightId;
        this.airlines = airlines;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.seatCount = seatCount;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "flightId = " + flightId + ", " +
                "airlines = " + airlines + ", " +
                "source = " + source + ", " +
                "destination = " + destination + ", " +
                "fare = " + fare + ", " +
                "seatCount = " + seatCount + ")";
    }

    public static FlightDTO prepareFlightDTO(Flight flight) {
        return new FlightDTO(flight.getFlightId(), flight.getAirlines(), flight.getSource(),
                flight.getDestination(), flight.getFare(), flight.getSeatCount());
    }
}