package com.parkinglot;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.model.*;
import com.parkinglot.service.factory.CostComputationFactory;
import com.parkinglot.service.factory.ParkingManagerFactory;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            if(i<=5){
              parkingSpotList.add(new ParkingSpot(i));
            }else{
                parkingSpotList.add(new ParkingSpot(i));
            }
        }

        ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();
        CostComputationFactory costComputationFactory = new CostComputationFactory();
        EntranceGate entranceGate = new EntranceGate(parkingManagerFactory);
        ExitGate exitGate = new ExitGate(parkingManagerFactory,costComputationFactory);

        Vehicle twoWheeler = new Vehicle(10001, VehicleType.TWO_WHEELER);
        Vehicle fourWheeler = new Vehicle(10002, VehicleType.FOUR_WHEELER);

        ParkingSpot parkingSpot = entranceGate.findParkingSport(twoWheeler,parkingSpotList);
        entranceGate.bookSpot(twoWheeler,parkingSpot);
        Ticket ticket = entranceGate.generateTicket(twoWheeler,parkingSpot);
        long price = exitGate.getPrice(ticket);
        exitGate.removeVehicle(parkingSpotList,ticket);
    }
}
