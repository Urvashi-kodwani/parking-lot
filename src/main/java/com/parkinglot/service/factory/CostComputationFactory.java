package com.parkinglot.service.factory;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.model.Ticket;
import com.parkinglot.service.cost.CostComputation;
import com.parkinglot.service.cost.FourWheelerCostComputation;
import com.parkinglot.service.cost.TwoWheelerCostComputation;

public class CostComputationFactory {

 //   private CostComputation costComputation;

    public long computePrice(Ticket ticket) {
        if (ticket.getVehicle().getVehicleType().equals(VehicleType.TWO_WHEELER)) {
            return new TwoWheelerCostComputation().computeCost(ticket);
        } else if (ticket.getVehicle().getVehicleType().equals(VehicleType.FOUR_WHEELER)) {
            return new FourWheelerCostComputation().computeCost(ticket);
        } else {
            return -1;
        }
    }
}
