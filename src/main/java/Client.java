import model.*;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {

        String address = "Forum Mall";
        int numberOfFloors = 3;
        int slotsperFloor = 5;

        ParkingLot parkingLot = new ParkingLot(address,numberOfFloors,slotsperFloor);
        System.out.println("floors: "+parkingLot.getParkingFloors().size() + " slots: "+   parkingLot.getSlotsPerFloor());
        Vehicle vehicle1 = new Vehicle("878hjjhj", VehicleType.TRUCK);
        Vehicle vehicle2 = new Vehicle("878hjj0hj", VehicleType.CAR);

        ParkingSpace space = parkingLot.parkVehicle(vehicle1);
        ParkingSpace space2=  parkingLot.parkVehicle(vehicle2);

        System.out.println("space type..."+space.getParkingSpaceType() + " "+
                space.isSpaceOccupied() + " "+ space.getParkingSpaceType());

        List<ParkingFloor> floors  = parkingLot.getParkingFloors();

        floors.forEach(floor -> System.out.println(
                "floor "+ floor.hasSpace()+
                        " space "+ space.getParkingSpaceType() + " space count "+ floor.getSpaceCount()));

        System.out.println(parkingLot.getCountOfOccupiedParkingSpace());
        System.out.println("getCountOfFreeParkingSpace"+parkingLot.getCountOfFreeParkingSpace());

        parkingLot.freeParking(space);

        System.out.println("getAfterparking space freed for given space"+parkingLot.getCountOfFreeParkingSpace());

    }
}
