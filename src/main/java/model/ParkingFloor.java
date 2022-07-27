package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParkingFloor {
    private int floorId;
    private boolean isFull;
    private int slotsPerFloor;
    private List<ParkingSpace> parkingSpaces;

    public ParkingFloor(int slotsPerFloor) {
        this.slotsPerFloor = slotsPerFloor;
        this.parkingSpaces = new ArrayList<>(slotsPerFloor);
        this.isFull = false;

        Random random=new Random();
        ParkingSpaceType[] values= ParkingSpaceType.values();
        int size = values.length;

        for(int i=0;i< slotsPerFloor;i++){
            parkingSpaces.add(new ParkingSpace(false, values[random.nextInt(size)]));
        }
    }


    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
    public boolean hasSpace() {
        for(int i=0;i<parkingSpaces.size();i++){
            if(parkingSpaces.get(i).isSpaceOccupied()){
                return false;
            }
        }
        return true;
    }


    public ParkingSpace setParking(Vehicle vehicle) throws Exception {
        if(!hasSpace()){
            throw new Exception("Space not available");
        }

        int k = 0;
        for( int i=0;i<parkingSpaces.size();i++){
            if(!parkingSpaces.get(i).isSpaceOccupied() && parkingSpaces.get(i).getParkingSpaceType().toString().equals(vehicle.getVehicleType().toString())){

                parkingSpaces.get(i).setSpaceOccupied(true);
                parkingSpaces.get(i).setParkingSpaceType(parkingSpaces.get(i).getParkingSpaceType());
                k = i;
                break;
            }
        }
        ParkingTicket ticket = new ParkingTicket();
        ticket.generateTicket(parkingSpaces.get(k));
        return parkingSpaces.get(k);

    }


    public boolean hasCurrentSpace(ParkingSpace space) {
        return space.isSpaceOccupied();
    }

    public ParkingSpace freeSpace(ParkingSpace space) {
        int index  = parkingSpaces.indexOf(space);
        parkingSpaces.get(index).setSpaceOccupied(false);
        return space;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public int getSpaceCount() {
        int count = 0;
       for(ParkingSpace parkingSpace: parkingSpaces){
           if(!parkingSpace.isSpaceOccupied()){
               count ++;
           }
       }
       return count;
    }

    public int getOccupiedCount(){
        int count = 0;
        for(ParkingSpace parkingSpace: parkingSpaces){
            if(parkingSpace.isSpaceOccupied()){
                count ++;
            }
        }
        return count;

    }
}
