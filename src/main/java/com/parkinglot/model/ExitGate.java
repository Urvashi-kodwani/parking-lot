package com.parkinglot.model;

import com.parkinglot.service.ParkingSpotManager;
import com.parkinglot.service.factory.ParkingSpotManagerFactory;

public class ExitGate {
    private Ticket ticket;
   // private CostComputation costComputation;
    private ParkingSpotManager parkingSpotManager;
    private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public  ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public void removeVehicle(Ticket ticket) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(ticket.getVehicle(), null);
        parkingSpotManager.removeVehicle(ticket.getVehicle());
    }

    public long getPrice(Ticket ticket){
        //add computation logic
        return 10L;
    }

    public void doPayment(){
        //todo: check and add payment
    }
}
