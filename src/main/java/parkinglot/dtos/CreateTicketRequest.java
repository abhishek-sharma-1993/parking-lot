package parkinglot.dtos;

import lombok.Getter;
import lombok.Setter;
import parkinglot.model.VehicleType;

@Setter
@Getter
public class CreateTicketRequest {
    private long parkingLotId;
    private String registrationNumber;
    private VehicleType vehicleType;
    private long gateId;
}
