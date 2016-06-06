package org.ze.typedparking.model;

/**
 * Created by dmitry on 6/6/16.
 */
public interface Vehicle {
    int placeOnParking(IParking parking);
    void unpark(IParking parking, int no);
}
