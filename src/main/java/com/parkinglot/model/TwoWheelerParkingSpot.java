package com.parkinglot.model;

public class TwoWheelerParkingSpot extends ParkingSpot{

    public TwoWheelerParkingSpot(int id, boolean isEmpty, Vehicle vehicle, long price) {
        super(id, isEmpty, vehicle, price);
    }

    @Override
    public long getPrice(){
        return 20;
    }
}
