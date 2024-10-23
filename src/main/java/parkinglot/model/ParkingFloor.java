package parkinglot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private FloorStatus status;
}
