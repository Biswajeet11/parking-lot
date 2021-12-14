package model;

import java.util.Date;

public class ParkingTicket {
    private int ticketId;
    private int floorId;
    private Date vehicleEntryTime;
    private Date vehicleExitTime;
    private ParkingSpaceType parkingSpaceType;
    private double  totalParkingCost;
    private ParkingStatus parkingTicketStatus;

}
