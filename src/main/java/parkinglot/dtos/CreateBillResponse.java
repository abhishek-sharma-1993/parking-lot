package parkinglot.dtos;

import lombok.Getter;
import lombok.Setter;
import parkinglot.model.Bill;

@Getter
@Setter
public class CreateBillResponse {
    private Bill bill;
    private ResponseStatus status;
    private String message;
}
