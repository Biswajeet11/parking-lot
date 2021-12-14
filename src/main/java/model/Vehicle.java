package model;

public class Vehicle {
    private String licenseNumber;
    private VehicleType vehicleType;

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    Vehicle(String licenseNumber, VehicleType vehicleType){
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }
}
