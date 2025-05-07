package com.parkinglot.model.parkingspotstrategy;

import com.parkinglot.model.ParkingSpot;

import java.util.List;

public interface ParkingSpotStrategy {
    ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) ;
}
