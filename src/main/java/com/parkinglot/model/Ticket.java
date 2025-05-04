package com.parkinglot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Ticket {

    private long entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
}
