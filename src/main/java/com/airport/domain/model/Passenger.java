package com.airport.domain.model;

import java.util.StringJoiner;

public class Passenger {
    String name;
    String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Passenger.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("passportNumber='" + passportNumber + "'")
                .toString();
    }
}
