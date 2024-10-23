package parkinglot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Operator extends BaseModel{
    private String name;
    private String employeeID;
    private String mobile;
    private String email;
}
