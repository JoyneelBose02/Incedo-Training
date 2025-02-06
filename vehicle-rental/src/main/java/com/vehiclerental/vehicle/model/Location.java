package com.vehiclerental.vehicle.model;

import org.springframework.stereotype.Component;

@Component
public class Location {
    private String locationID;
    private String location;
 
    public Location() {}
 
    public Location(String locationID, String location) {
        this.locationID = locationID;
        this.location = location;
    }
 
    public String getLocationID() { return locationID; }
    public void setLocationID(String locationID) { this.locationID = locationID; }
 
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
 
    public String getlocation() { return "Location ID: " + locationID + ", Location: " + location; }
}
 