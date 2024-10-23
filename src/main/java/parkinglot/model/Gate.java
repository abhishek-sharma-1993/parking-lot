package parkinglot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class Gate extends BaseModel{
    private GateType gateType;
    private Operator operator;
    private int gateNumber;
}
