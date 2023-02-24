package com.flight.flightapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "flight_status")
public class FlightStatus {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "flight_number")
        private String flightNumber;

        @Column(name = "departure_time")
        private LocalDateTime departureTime;

        @Column(name = "arrival_time")
        private LocalDateTime arrivalTime;

        @Column(name = "status")
        private String status;

    @Override
    public String toString() {
        return "FlightStatus{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", status='" + status + '\'' +
                '}';
    }
}
