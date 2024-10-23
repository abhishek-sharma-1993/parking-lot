package parkinglot.dtos;

import lombok.Getter;
import lombok.Setter;

import parkinglot.model.Ticket;

@Setter
@Getter
public class CreateBillRequest {
    private Ticket ticket;
    private long gateId;
}
