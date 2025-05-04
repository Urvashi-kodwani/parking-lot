package com.parkinglot.model;

import com.parkinglot.service.ParkingSpotManager;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private long price;

    public ParkingSpot(int id){
        this.id = id;
        isEmpty=true;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isEmpty=false;
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isEmpty=false;
    }

}
