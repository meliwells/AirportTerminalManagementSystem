package com.airport.domain.model;

import java.util.StringJoiner;

public class PrivateJet extends Aircraft {
    String hasLuxuryService;
    int maxSpeed;

    public PrivateJet(String hasLuxuryService, int maxSpeed) {
        this.hasLuxuryService = hasLuxuryService;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PrivateJet.class.getSimpleName() + "[", "]")
                .add("hasLuxuryService='" + hasLuxuryService + "'")
                .add("maxSpeed=" + maxSpeed)
                .toString();
    }
}
