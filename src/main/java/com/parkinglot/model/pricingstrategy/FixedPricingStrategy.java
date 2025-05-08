package com.parkinglot.model.pricingstrategy;

import com.parkinglot.model.Ticket;

public class FixedPricingStrategy implements PricingStrategy {

    @Override
    public long computePrice(Ticket ticket) {
        return 10;
    }
}
