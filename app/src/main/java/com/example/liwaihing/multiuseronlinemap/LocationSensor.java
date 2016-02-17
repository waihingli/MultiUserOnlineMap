package com.example.liwaihing.multiuseronlinemap;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/**
 * Created by WaiHing on 16/2/2016.
 */
public class LocationSensor implements LocationListener {

    private static LocationSensor instance = null;
    private Location currentLocation = null;
    private LocationManager locationManager;
    private boolean findLocation = false;

    protected LocationSensor() {
    }

    public static LocationSensor getInstance() {
        if (instance == null) {
            instance = new LocationSensor();
        }
        return instance;
    }

    public void setLocationListener(LocationManager lm) {
        locationManager = lm;
        String provider = locationManager.getBestProvider(new Criteria(), true);
        locationManager.requestLocationUpdates(provider, 0, 0, this);
    }

    public Location getCurrentLocation(){
        return currentLocation;
    }

    public Location getLastLocation(){
        Location lastLocation = locationManager.getLastKnownLocation(locationManager.getBestProvider(new Criteria(), true));
        return lastLocation;
    }

    @Override
    public void onLocationChanged(Location location) {
        currentLocation = location;
        findLocation = true;
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
