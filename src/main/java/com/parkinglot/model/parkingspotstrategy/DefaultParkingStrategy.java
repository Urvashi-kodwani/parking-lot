package com.parkinglot.model.parkingspotstrategy;

import com.parkinglot.model.ParkingSpot;

import java.util.List;

public class DefaultParkingStrategy implements ParkingSpotStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return parkingSpotList.stream().filter(parkingSpot -> parkingSpot.isEmpty()).findFirst().orElse(null);
    }
}
