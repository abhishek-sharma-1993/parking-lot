package parkinglot.strategies;

import parkinglot.model.Ticket;

public interface FeeCalculateStrategy {
    Double calculateFee(Ticket ticket);
}
