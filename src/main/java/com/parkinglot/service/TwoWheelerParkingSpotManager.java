package com.parkinglot.service;

import com.parkinglot.model.ParkingSpot;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
   public  ParkingSpot findParkingSpot( List<ParkingSpot> parkingSpotList) {
        //todo:  we can add stratgeies later
        return parkingSpotList.stream().filter(parkingSpot -> parkingSpot.isEmpty()).findFirst().orElse(null);
    }
}
