package org.ze.typedparking.model;

/**
 * Created by dmitry on 6/6/16.
 */
public class Truck implements Vehicle {
    @Override
    public int placeOnParking(IParking parking) {
        if (parking.hasAvailablePlaceForTruck()) {
            return parking.getNextPlaceForTruck();
        }
        return -1;
    }

    @Override
    public void unpark(IParking parking, int no) {
        parking.removeTruckPlace();
    }
}
