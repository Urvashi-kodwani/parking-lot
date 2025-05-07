package com.parkinglot.service;

import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.parkingspotstrategy.DefaultParkingStrategy;
import com.parkinglot.model.parkingspotstrategy.ParkingSpotStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {

    private ParkingSpotStrategy parkingSpotStrategy;

    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        parkingSpotStrategy = new DefaultParkingStrategy();
        return parkingSpotStrategy.findParkingSpot(parkingSpotList);
    }
}
