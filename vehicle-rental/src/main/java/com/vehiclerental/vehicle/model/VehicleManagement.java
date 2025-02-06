package com.vehiclerental.vehicle.model;

import java.util.*;
import jakarta.persistence.*;
 
@Entity
@Table(name = "vehicle_management")
@Inheritance(strategy = InheritanceType.JOINED)
public class VehicleManagement {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleID;
    private String vehicleName;
    private String vehicleState;
    private double rentalCost;
 
    public VehicleManagement() {}
 
    public VehicleManagement(Long vehicleID, String vehicleName, String vehicleState, double rentalCost) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleState = vehicleState;
        this.rentalCost = rentalCost;
    }
 
    public void addVehicle() {
        System.out.println("Vehicle added: " + vehicleName);
    }
 
    public void removeVehicle() {
        System.out.println("Vehicle removed: " + vehicleName);
    }
 
    public void updateAvailableState(List<VehicleManagement> vehicleManagementList) {
        System.out.println("Updating vehicle availability...");
    }
 
    public Long getVehicleID() { return vehicleID; }
    public void setVehicleID(Long vehicleID) { this.vehicleID = vehicleID; }
    public String getVehicleName() { return vehicleName; }
    public void setVehicleName(String vehicleName) { this.vehicleName = vehicleName; }
    public String getVehicleState() { return vehicleState; }
    public void setVehicleState(String vehicleState) { this.vehicleState = vehicleState; }
    public double getRentalCost() { return rentalCost; }
    public void setRentalCost(double rentalCost) { this.rentalCost = rentalCost; }
}