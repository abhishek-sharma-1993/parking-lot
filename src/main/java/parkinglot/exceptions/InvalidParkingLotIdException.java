package parkinglot.exceptions;

public class InvalidParkingLotIdException extends RuntimeException {
    public InvalidParkingLotIdException(String message) {
        super(message);
    }
}
