package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;
    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{

        //Flights Europe
        //One
        Flight flightOne = new Flight(
                "Paris",
                5,
                "November-10",
                "2000"
                );
        flightRepository.save(flightOne);

        //Two
        Flight flightTwo = new Flight(
                "Madrid",
                120,
                "November-16",
                "2100"
        );
        flightRepository.save(flightTwo);

        //Three
        Flight flightThree = new Flight(
                "Munich",
                10,
                "November-13",
                "1800"
        );
        flightRepository.save(flightThree);


        //Passengers
        //One
        Passenger John = new Passenger(
                "John",
                "John@mail"
        );
        passengerRepository.save(John);

        //Two
        Passenger Jason = new Passenger(
                "Jason",
                "Jason@mail"
        );
        passengerRepository.save(Jason);

        //Three
        Passenger James = new Passenger(
                "James",
                "James@mail"
        );
        passengerRepository.save(James);





    }





} //Last curly bracket
