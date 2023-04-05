package com.flight.flightapp.controller;

import com.flight.flightapp.entity.FlightStatus;
import com.flight.flightapp.repository.FlightStatusRepository;
import com.flight.flightapp.repository.FlightNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/")
public class FlightStatusController {

    @Autowired
    private FlightStatusRepository flightStatusRepository;

    private final FlightNumberRepository flightRepository;

    @Autowired
    public FlightStatusController(FlightNumberRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/flight-status")
    public ResponseEntity<FlightStatus> createFlightStatus(@RequestBody FlightStatus flightStatus) {
        FlightStatus savedFlightStatus = flightStatusRepository.save(flightStatus);
        return ResponseEntity.ok(savedFlightStatus);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/flight-status")
    public ResponseEntity<List<FlightStatus>> getAllFlightStatuses() {
        List<FlightStatus> flightStatuses = flightStatusRepository.findAllByOrderByDepartureTimeAsc();
        return ResponseEntity.ok(flightStatuses);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/flight-statusByLatest")
    public ResponseEntity<FlightStatus> getAllFlightStatusesByLST() {
        List<FlightStatus> flightStatuses = flightStatusRepository.findByLatestSubmissionTime();

        FlightStatus fs = flightStatuses.get(0);
        return ResponseEntity.ok(fs);
    }



    @CrossOrigin("http://localhost:4200")
    @GetMapping("/flight-numbers")
    public List<String> getFlightNumbers() {

        return flightRepository.findDistinctFlightNumbers();
    }

}

