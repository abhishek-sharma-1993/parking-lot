package parkinglot.exceptions;

public class InvalidGateIdException extends RuntimeException {
    public InvalidGateIdException(String message) {
        super(message);
    }
}
