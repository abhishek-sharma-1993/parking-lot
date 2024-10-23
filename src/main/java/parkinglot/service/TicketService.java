package parkinglot.service;

import parkinglot.dtos.CreateTicketRequest;
import parkinglot.model.Ticket;
import parkinglot.repository.ParkingLotRepository;
import parkinglot.strategies.FindSpotStrategy;

public class TicketService {
    private ParkingLotRepository parkingLotRepository;
    private FindSpotStrategy findSpotStrategy;

    public TicketService(ParkingLotRepository parkingLotRepository, FindSpotStrategy findSpotStrategy) {
        this.parkingLotRepository = parkingLotRepository;
        this.findSpotStrategy = findSpotStrategy;
    }

    public Ticket createTicket(CreateTicketRequest createTicketRequest) {
        return null;
    }
}
