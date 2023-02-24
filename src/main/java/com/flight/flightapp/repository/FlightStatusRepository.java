package com.flight.flightapp.repository;

import com.flight.flightapp.entity.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface FlightStatusRepository extends JpaRepository<FlightStatus, Long> {

    List<FlightStatus> findAllByOrderByDepartureTimeAsc();

}

