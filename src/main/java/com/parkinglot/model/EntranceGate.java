package com.parkinglot.model;

import com.parkinglot.service.ParkingSpotManager;
import com.parkinglot.service.factory.ParkingSpotManagerFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class EntranceGate {
    private ParkingSpotManagerFactory parkingSpotManagerFactory;
    private Ticket ticket;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public ParkingSpot findParkingSport(Vehicle vehicle, List<ParkingSpot> parkingSpotList) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle, parkingSpotList);
        return parkingSpotManager.findParkingSpot(  parkingSpotList);
    }

    public void bookSpot(Vehicle vehicle,ParkingSpot parkingSpot) {
        parkingSpot.parkVehicle(vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(System.currentTimeMillis(), vehicle, parkingSpot);
        return ticket;
    }
}
