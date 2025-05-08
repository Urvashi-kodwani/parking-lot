package com.parkinglot.model;

import com.parkinglot.service.ParkingSpotManager;
import com.parkinglot.service.factory.CostComputationFactory;
import com.parkinglot.service.factory.ParkingManagerFactory;

import java.util.List;

public class ExitGate {
    private Ticket ticket;
    private ParkingSpotManager parkingSpotManager;
    private ParkingManagerFactory parkingManagerFactory;
    private CostComputationFactory costComputationFactory;

    public  ExitGate(ParkingManagerFactory parkingManagerFactory, CostComputationFactory costComputationFactory){
        this.parkingManagerFactory = parkingManagerFactory;
        this.costComputationFactory = costComputationFactory;
    }

    public void removeVehicle(List<ParkingSpot> parkingSpotList, Ticket ticket) {
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingSpotManager(ticket.getVehicle(), parkingSpotList);
        parkingSpotManager.removeVehicle(ticket.getVehicle());
    }

    public long getPrice(Ticket ticket){
        return costComputationFactory.computePrice(ticket);
    }

    public void doPayment(){
        //todo: check and add payment
    }
}
