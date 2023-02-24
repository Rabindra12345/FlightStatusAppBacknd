package com.flight.flightapp.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="flight_number")
public class FlightNumber {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;

    @Override
    public String toString() {
        return "FlightNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
