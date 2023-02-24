package com.flight.flightapp.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="to_address")
public class ToAddress {


    @Id
    @Column(name="toName")
    private String toName;


    @Override
    public String toString() {
        return "ToAddress{" +
                "toName='" + toName + '\'' +
                '}';
    }
}
