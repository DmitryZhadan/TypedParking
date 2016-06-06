package org.ze.typedparking.model;

/**
 * Created by dmitry on 6/6/16.
 */
public class Car implements Vehicle {
    @Override
    public int placeOnParking(IParking parking) {
        if (parking.hasAvailablePlaceForCar()) {
            if (parking.hasAvailablePlaceForCarOnCarGallery()) {
                return parking.getNextPlaceForCar();
            } else {
                return parking.getNextPlaceForTruck();
            }
        }
        return -1;
    }

    @Override
    public void unpark(IParking parking, int no) {
        parking.removeCarOrTruckPlace(no);
    }
}
