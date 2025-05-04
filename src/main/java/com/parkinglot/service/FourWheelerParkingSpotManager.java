package com.parkinglot.service;

import com.parkinglot.model.ParkingSpot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
   public ParkingSpot findParkingSpot() {
        //todo: add logic
        return null;
    }
}
