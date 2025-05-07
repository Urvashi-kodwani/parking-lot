package com.parkinglot.model;

import com.parkinglot.service.ParkingSpotManager;
import com.parkinglot.service.factory.ParkingManagerFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class EntranceGate {
    private ParkingManagerFactory parkingManagerFactory;
    private ParkingSpotManager parkingSpotManager;
    private Ticket ticket;

    public EntranceGate(ParkingManagerFactory parkingManagerFactory) {
        this.parkingManagerFactory = parkingManagerFactory;
    }

    public ParkingSpot findParkingSport(Vehicle vehicle, List<ParkingSpot> parkingSpotList) {
        parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicle, parkingSpotList);
        return parkingSpotManager.findParkingSpot(parkingSpotList);
    }

    public void bookSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpot.parkVehicle(vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(System.currentTimeMillis(), vehicle, parkingSpot);
        return ticket;
    }
}
