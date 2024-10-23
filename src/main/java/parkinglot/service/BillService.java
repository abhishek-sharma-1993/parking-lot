package parkinglot.service;

import parkinglot.dtos.CreateBillRequest;
import parkinglot.model.Bill;
import parkinglot.repository.ParkingLotRepository;
import parkinglot.strategies.FeeCalculateStrategy;

public class BillService {
    private ParkingLotRepository parkingLotRepository;
    private FeeCalculateStrategy feeCalculateStrategy;

    public BillService(ParkingLotRepository parkingLotRepository, FeeCalculateStrategy feeCalculateStrategy) {
        this.parkingLotRepository = parkingLotRepository;
        this.feeCalculateStrategy = feeCalculateStrategy;
    }

    public Bill createBill(CreateBillRequest createBillRequest) {
        return null;
    }
}
