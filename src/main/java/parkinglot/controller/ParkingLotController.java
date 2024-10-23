package parkinglot.controller;

import parkinglot.dtos.*;
import parkinglot.model.Bill;
import parkinglot.model.Ticket;
import parkinglot.service.BillService;
import parkinglot.service.TicketService;

public class ParkingLotController {
    private final BillService billService;
    private final TicketService ticketService;

    public ParkingLotController(BillService billService, TicketService ticketService) {
        this.billService = billService;
        this.ticketService = ticketService;
    }

    public CreateTicketResponse createTicket(CreateTicketRequest createTicketRequest){
        CreateTicketResponse response = new CreateTicketResponse();
        try{
            Ticket ticket = ticketService.createTicket(createTicketRequest);
            response.setTicket(ticket);
            response.setMessage("Ticket created");
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(e.getMessage());
        }
        return response;
    }

    public CreateBillResponse createBill(CreateBillRequest createBillRequest){
        CreateBillResponse response = new CreateBillResponse();
        try{
            Bill bill = billService.createBill(createBillRequest);
            response.setBill(bill);
            response.setMessage("Bill created");
            response.setStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            response.setMessage(e.getMessage());
            response.setStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
