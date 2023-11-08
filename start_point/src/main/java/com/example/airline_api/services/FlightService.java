package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    //Sava a flight in the db
    public void saveFlight(Flight flight){
        flightRepository.save(flight);
    }

    //Get details of all flights
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    //Get details of a specific flight
    //I will need to have the id of the flight
    public Flight getFlightById(long id){
        return flightRepository.findById(id).get();
    }

    // Delete/Cancel a flight
    public void deleteFlight(long id){
        flightRepository.deleteById(id);
    }



} //Last curly bracket
