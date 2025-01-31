package com.airport.domain.model;

import java.util.StringJoiner;

public class CommercialAircraft extends Aircraft {
    String airlineName;

    public CommercialAircraft(String airlineName) {
        this.airlineName = airlineName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CommercialAircraft.class.getSimpleName() + "[", "]")
                .add("airlineName='" + airlineName + "'")
                .toString();
    }
}
