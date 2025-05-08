package com.parkinglot.model.pricingstrategy;

import com.parkinglot.model.Ticket;

public interface PricingStrategy {

    long computePrice(Ticket ticket);
}
