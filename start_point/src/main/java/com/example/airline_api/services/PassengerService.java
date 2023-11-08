package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.PassengerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;



    //Find all passengers
    public List<Passenger> findAllPassengers(){
        return passengerRepository.findAll();
    }

    //Find specific passenger by ID
    public Passenger findPassenger(long id){
        return passengerRepository.findById(id).get();
    }

    //Add a new passenger
    public void addPassenger(Passenger passenger){
        passengerRepository.save(passenger);

    }



} //Last curly bracket
