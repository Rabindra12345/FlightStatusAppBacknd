package com.flight.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flight.flightapp.entity.FlightNumber;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface FlightNumberRepository extends JpaRepository<FlightNumber,String> {

    @Query(value = "SELECT DISTINCT * FROM flight_number", nativeQuery = true)
    List<String> findDistinctFlightNumbers();
}
