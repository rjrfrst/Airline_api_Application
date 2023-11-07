package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightService flightService;

    //Save a passenger in the db
    public Passenger savePassenger(Passenger passenger){
        passengerRepository.save(passenger);
        return passenger;
    }



} //Last curly bracket
