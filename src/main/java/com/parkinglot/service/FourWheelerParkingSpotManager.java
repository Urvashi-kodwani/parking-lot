package com.parkinglot.service;

import com.parkinglot.model.ParkingSpot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
   public ParkingSpot findParkingSpot( List<ParkingSpot> parkingSpotList) {
        //todo: add logic
        return parkingSpotList.stream().filter(parkingSpot -> parkingSpot.isEmpty()).findFirst().orElse(null);

    }
}
