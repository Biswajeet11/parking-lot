package model;

public class Vehicle {
    private String licenseNumber;
    private VehicleType vehicleType;
    private ParkingTicket parkingTicket;

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public ParkingTicket getParkingTicket(){
        return parkingTicket;
    }
}
