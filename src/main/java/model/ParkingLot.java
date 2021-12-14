package model;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String address;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;
    private List<ParkingFloor> parkingFloors;
}
