package com.parkinglot.service.factory;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.Vehicle;
import com.parkinglot.service.FourWheelerParkingSpotManager;
import com.parkinglot.service.ParkingSpotManager;
import com.parkinglot.service.TwoWheelerParkingSpotManager;

import java.util.List;

public class ParkingManagerFactory {

   public ParkingSpotManager getParkingSpotManager(Vehicle vehicle, List<ParkingSpot> parkingSpotList) {
        if (vehicle.getVehicleType().equals(VehicleType.TWO_WHEELER)) {
            return new TwoWheelerParkingSpotManager(parkingSpotList);
        } else if (vehicle.getVehicleType().equals(VehicleType.FOUR_WHEELER)) {
            return new FourWheelerParkingSpotManager(parkingSpotList);
        } else {
            //todo : error handling
            return null;
        }
    }
}
