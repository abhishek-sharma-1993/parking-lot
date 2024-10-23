package parkinglot.dtos;

import lombok.Getter;
import lombok.Setter;
import parkinglot.model.Ticket;

@Getter
@Setter
public class CreateTicketResponse {
    private Ticket ticket;
    private ResponseStatus responseStatus;
    private String message;
}
