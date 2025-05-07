package com.parkinglot.service;

import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.Vehicle;

import java.util.List;

public abstract class ParkingSpotManager {

    private List<ParkingSpot> parkingSpotList;

    ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

   public abstract ParkingSpot findParkingSpot( List<ParkingSpot> parkingSpotList);

  public   void addParkingSpace(ParkingSpot parkingSpot) {
        this.parkingSpotList.add(parkingSpot);
    }

    public   void removeParkingSpace(ParkingSpot parkingSpot) {
        for (ParkingSpot parkingSpots : parkingSpotList) {
            if (parkingSpots.equals(parkingSpot)) {
                parkingSpotList.remove(parkingSpot);
            }
        }
    }

    public  void parkVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpot(parkingSpotList);
        parkingSpot.parkVehicle(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.getVehicle() != null && parkingSpot.getVehicle().equals(vehicle)) {
                parkingSpot.removeVehicle(vehicle);
            }
        }
    }
}
