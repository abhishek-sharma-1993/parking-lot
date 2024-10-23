package parkinglot.model;

import lombok.Builder;

import java.util.Date;

@Builder
public class Bill extends BaseModel{
    private Gate gate;
    private Operator operator;
    private Double amount;
    private Date exitTIme;
    private Ticket ticket;
}
