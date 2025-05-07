package com.parkinglot.model;

import com.parkinglot.service.ParkingSpotManager;
import com.parkinglot.service.factory.ParkingSpotManagerFactory;

import java.util.List;

public class ExitGate {
    private Ticket ticket;
   // private CostComputation costComputation;
    private ParkingSpotManager parkingSpotManager;
    private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public  ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public void removeVehicle(List<ParkingSpot> parkingSpotList, Ticket ticket) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(ticket.getVehicle(), parkingSpotList);
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
