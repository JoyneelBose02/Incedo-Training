package com.vehiclerental.vehicle.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_state")
public class VehicleState extends VehicleManagement {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stateID;
    private String vehicleStatus;  // Available, Unavailable, UnderMaintenance
 
    public VehicleState() {}
 
    public VehicleState(Long stateID, String vehicleStatus, Long vehicleID, String vehicleName, String vehicleState, double rentalCost) {
        super(vehicleID, vehicleName, vehicleState, rentalCost);
        this.stateID = stateID;
        this.vehicleStatus = vehicleStatus;
    }
 
    public Long getStateID() { return stateID; }
    public void setStateID(Long stateID) { this.stateID = stateID; }
    public String getVehicleStatus() { return vehicleStatus; }
    public void setVehicleStatus(String vehicleStatus) { this.vehicleStatus = vehicleStatus; }
}
