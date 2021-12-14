package model;

public class ParkingSpace {
    
    private int parkingSpaceId;
    private boolean isSpaceOccupied;
    private Vehicle vehicle;
    private ParkingSpaceType parkingSpaceType;

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

    public Vehicle getVehicle() {
        return vehicle;
    }
}
