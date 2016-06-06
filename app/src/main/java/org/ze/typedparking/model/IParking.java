package org.ze.typedparking.model;

/**
 * Created by dmitry on 6/6/16.
 */
public interface IParking {
    boolean hasAvailablePlaceForCar();
    boolean hasAvailablePlaceForCarOnCarGallery();
    boolean hasAvailablePlaceForTruck();
    int getNextPlaceForTruck();
    int getNextPlaceForCar();
    void removeTruckPlace();
    void removeCarOrTruckPlace(int placeNo);
}
