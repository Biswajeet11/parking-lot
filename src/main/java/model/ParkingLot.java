package model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel{
    private String address;
    private List<ParkingFloor> parkingFloors;
    private int slotsPerFloor;



    public ParkingLot(String address, int numberOfFloors, int slotsPerFloor ){
        this.address = address;
        this.parkingFloors = new ArrayList<>(numberOfFloors);
        this.slotsPerFloor = slotsPerFloor;

        for(int i=0;i<numberOfFloors;i++){
            this.parkingFloors.add(i,new ParkingFloor(slotsPerFloor));
            System.out.println(parkingFloors.get(i));
        }
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public int getSlotsPerFloor() {
        return slotsPerFloor;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingSpace parkVehicle(Vehicle vehicle) throws Exception {
        ParkingSpace space = null;
        for(ParkingFloor floor: parkingFloors) {
           if(floor.hasSpace()){
               space =  floor.setParking(vehicle);
               break;
           }
        }
        return  space;
    }


    public ParkingSpace freeParking(ParkingSpace space) {

        for(ParkingFloor floor: parkingFloors) {
              return  floor.freeSpace(space);
        }
        throw new RuntimeException("Space not found");
    }

    public int getCountOfFreeParkingSpace(){
        int count = 0;
        for(ParkingFloor floor: parkingFloors){
                count += floor.getSpaceCount();
        }
        return count;
    }
    public int getCountOfOccupiedParkingSpace() {
        int count = 0;
        for(ParkingFloor floor: parkingFloors) {
                count += floor.getOccupiedCount();
        }
        System.out.println("count0-00"+count);
        return count;
    }




}
