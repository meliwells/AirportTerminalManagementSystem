package com.airport.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.StringJoiner;

public class Flight {
    String flightNumber;
    LocalDate departureDate;
    BigDecimal ticketPrice;
    String aircraft;

    public Flight(String flightNumber, LocalDate departureDate, BigDecimal ticketPrice, String aircraft) {
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.ticketPrice = ticketPrice;
        this.aircraft = aircraft;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public String getAircraft() {
        return aircraft;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Flight.class.getSimpleName() + "[", "]")
                .add("flightNumber='" + flightNumber + "'")
                .add("departureDate=" + departureDate)
                .add("ticketPrice=" + ticketPrice)
                .add("aircraft='" + aircraft + "'")
                .toString();
    }
}
