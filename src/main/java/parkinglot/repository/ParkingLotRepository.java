package parkinglot.repository;

import parkinglot.model.*;

import java.util.List;

public class ParkingLotRepository {
    private static final ParkingLot INSTANCE = getParkingLot();
    private static ParkingLot getParkingLot() {
        ParkingFloor floor1 = new ParkingFloor(
                1,
                List.of(new ParkingSpot(1, VehicleType.BIKE, ParkingSpotStatus.AVAILABLE),
                        new ParkingSpot(2, VehicleType.CAR, ParkingSpotStatus.AVAILABLE)),
                FloorStatus.WORKING
        );

        ParkingFloor floor2 = new ParkingFloor(
                2,
                List.of(new ParkingSpot(1, VehicleType.BIKE, ParkingSpotStatus.AVAILABLE),
                        new ParkingSpot(2, VehicleType.CAR, ParkingSpotStatus.AVAILABLE)),
                FloorStatus.WORKING
        );

        Gate ENTRY = new Gate(GateType.ENTRY,
                new Operator("Abhishek","ID123","1234","xzy@gmail.com"),
                1
        );

        Gate EXIT = new Gate(GateType.EXIT,
                new Operator("Abhishek","ID123","1234","xzy@gmail.com"),
                2
        );

        return ParkingLot.builder()
                .parkingFloors(List.of(floor1, floor2))
                .name("Parking Lot")
                .address("btm layout")
                .gates(List.of(ENTRY,EXIT))
                .build();
    }

    public static ParkingLot getInstance() {
        return INSTANCE;
    }
}
