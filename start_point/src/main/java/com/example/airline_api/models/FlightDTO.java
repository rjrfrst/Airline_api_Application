package com.example.airline_api.models;

import java.util.List;

public class FlightDTO {
    //Properties
    private String name;

    private List<Long> passengerIds;

    //Constructors
    public FlightDTO(String inputName, List<Long> inputPassengerIds){
        this.name = inputName;
        this.passengerIds = inputPassengerIds;
    }

    //Default constructor


    public FlightDTO() {
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPassengerIds() {
        return passengerIds;
    }

    public void setPassengerIds(List<Long> passengerIds) {
        this.passengerIds = passengerIds;
    }
} //Last curly bracket
