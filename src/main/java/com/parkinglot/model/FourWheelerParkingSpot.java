package com.parkinglot.model;

public class FourWheelerParkingSpot extends ParkingSpot{

    public FourWheelerParkingSpot(int id, boolean isEmpty, Vehicle vehicle, long price) {
        super(id, isEmpty, vehicle, price);
    }

    @Override
    public long getPrice(){
        return 20;
    }
}
