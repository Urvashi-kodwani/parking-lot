package com.parkinglot.model;

import com.parkinglot.service.ParkingSpotManager;
import com.parkinglot.service.factory.ParkingManagerFactory;

import java.util.List;

public class ExitGate {
    private Ticket ticket;
   // private CostComputation costComputation;
    private ParkingSpotManager parkingSpotManager;
    private ParkingManagerFactory parkingManagerFactory;

    public  ExitGate(ParkingManagerFactory parkingManagerFactory){
        this.parkingManagerFactory = parkingManagerFactory;
    }

    public void removeVehicle(List<ParkingSpot> parkingSpotList, Ticket ticket) {
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingSpotManager(ticket.getVehicle(), parkingSpotList);
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
