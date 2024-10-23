package parkinglot.model;

import lombok.Builder;

import java.util.Date;

@Builder
public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private Date entryTime;
    private Gate gate;
    private Operator operator;
    private ParkingSpot parkingSpot;
}
