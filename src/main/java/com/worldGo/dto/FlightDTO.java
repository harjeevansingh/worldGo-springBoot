package com.worldGo.dto;

//import java.time.LocalDate;

import org.springframework.context.annotation.Bean;

public class FlightDTO {
    private int flightId;
    private String airlines;
    private String source;
    private String destination;
    private Double fare;
    //    private LocalDate journeyDate;
    private Integer seatCount;

    //    public FlightDTO(String flightId, String airlines, String source, String destination, Double fare, LocalDate journeyDate, Integer seatCount) {
    public FlightDTO(int flightId, String airlines, String source, String destination, Double fare, Integer seatCount) {
        this.flightId = flightId;
        this.airlines = airlines;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.seatCount = seatCount;
    }

    public FlightDTO() {

    }

    //Getter & Setter Methods
    public int getFlightId() {
        return flightId;
    }

    // setters
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }


    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

//    public LocalDate getJourneyDate(){
//        return journeyDate;
//    }

//    public void setJourneyDate(LocalDate journeyDate){
//        this.journeyDate = journeyDate;
//    }

}
