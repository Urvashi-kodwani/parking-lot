package com.parkinglot.service.cost;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.model.Ticket;
import com.parkinglot.model.pricingstrategy.PricingStrategy;

public abstract class CostComputation {

    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

   public long computeCost(Ticket ticket) {
        return  pricingStrategy.computePrice(ticket);
    }

}
