package model;

import java.util.UUID;

public class ParkingSpace {

    private String parkingSpaceId;
    private boolean isSpaceOccupied;
    private Vehicle vehicle;
    private ParkingSpaceType parkingSpaceType;



    public ParkingSpace(boolean isSpaceOccupied, ParkingSpaceType parkingSpaceType) {
        this.parkingSpaceId = UUID.randomUUID().toString();
        this.isSpaceOccupied = isSpaceOccupied;
        this.parkingSpaceType = parkingSpaceType;
    }

    public void setSpaceOccupied(boolean spaceOccupied) {
        this.isSpaceOccupied = spaceOccupied;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setParkingSpaceType(ParkingSpaceType parkingSpaceType) {
        this.parkingSpaceType = parkingSpaceType;
    }

    public boolean isSpaceOccupied() {
        return isSpaceOccupied;
    }

    public ParkingSpaceType getParkingSpaceType() {
        return parkingSpaceType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
