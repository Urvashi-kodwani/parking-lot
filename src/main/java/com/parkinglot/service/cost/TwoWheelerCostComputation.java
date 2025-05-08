package com.parkinglot.service.cost;

import com.parkinglot.model.Ticket;
import com.parkinglot.model.pricingstrategy.FixedPricingStrategy;
import com.parkinglot.model.pricingstrategy.PricingStrategy;

public class TwoWheelerCostComputation extends CostComputation {

    public TwoWheelerCostComputation() {
        super(new FixedPricingStrategy());
    }

}
