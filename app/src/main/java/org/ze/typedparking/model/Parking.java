package org.ze.typedparking.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 6/6/16.
 */
public class Parking implements IParking {
    private Vehicle[] mVehiclePlaces;
    private int mTotalTruckPlaces, mCurrentTruckPlaces, mCurrentCarPlaces;

    public Parking(int totalPlaces, int placesForTrucks) {
        mVehiclePlaces=new Vehicle[totalPlaces]; mTotalTruckPlaces=placesForTrucks; mCurrentTruckPlaces=mCurrentCarPlaces=0;
    }

    public int park(Vehicle vehicle) {
        int placeNum=vehicle.placeOnParking(this);

        if (placeNum!=-1) {
            mVehiclePlaces[placeNum]=vehicle;
        }
        return placeNum;
    }

    public Vehicle unpark(int placeNo) {
        Vehicle ret=null;

        if (placeNo>=0) {
            ret=mVehiclePlaces[placeNo]; mVehiclePlaces[placeNo]=null;
            ret.unpark(this,placeNo);
        }
        return ret;
    }

    public boolean hasAvailablePlaceForCar() {
        return mCurrentTruckPlaces+mCurrentCarPlaces<mVehiclePlaces.length;
    }

    public boolean hasAvailablePlaceForCarOnCarGallery() {
        return mCurrentCarPlaces<mVehiclePlaces.length-mTotalTruckPlaces;
    }

    public boolean hasAvailablePlaceForTruck() {
        return mCurrentTruckPlaces<mTotalTruckPlaces;
    }

    public int getNextPlaceForTruck() {
        int ret=-1;

        for (int i=mVehiclePlaces.length-mTotalTruckPlaces; i<mVehiclePlaces.length; i++) {
            if (mVehiclePlaces[i]==null) {
                ret=i; mCurrentTruckPlaces++; break;
            }
        }
        return ret;
    }

    public int getNextPlaceForCar() {
        int ret=-1;

        for (int i=0; i<mVehiclePlaces.length-mTotalTruckPlaces; i++) {
            if (mVehiclePlaces[i]==null) {
                ret=i; mCurrentCarPlaces++; break;
            }
        }
        return ret;
    }

    @Override
    public void removeTruckPlace() {
        mCurrentTruckPlaces--;
    }

    @Override
    public void removeCarOrTruckPlace(int placeNo) {
        if (placeNo<mVehiclePlaces.length-mTotalTruckPlaces) {
            mCurrentCarPlaces--;
        } else {
            mCurrentTruckPlaces--;
        }
    }
}
