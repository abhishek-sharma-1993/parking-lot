package parkinglot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ParkingSpot extends BaseModel{
    private int number;
    private VehicleType vehicleType;
    private ParkingSpotStatus status;
}
