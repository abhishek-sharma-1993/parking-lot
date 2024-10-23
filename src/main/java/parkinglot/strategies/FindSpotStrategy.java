package parkinglot.strategies;

import parkinglot.model.ParkingLot;
import parkinglot.model.ParkingSpot;

public interface FindSpotStrategy {
    ParkingSpot findSpot(ParkingLot parkingLot);
}
