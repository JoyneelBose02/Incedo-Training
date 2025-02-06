package com.vehiclerental.vehicle.model;
import jakarta.persistence.*;
import java.util.List;
 
@Entity
@Table(name = "vehicle_type")
public class VehicleType extends VehicleManagement {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeID;
    private String typeName;
    
    @ElementCollection
    private List<String> availableTypes;  // Example: "Car", "Bike", "Scooty"
 
    public VehicleType() {}
 
    public VehicleType(Long typeID, String typeName, List<String> availableTypes, Long vehicleID, String vehicleName, String vehicleState, double rentalCost) {
        super(vehicleID, vehicleName, vehicleState, rentalCost);
        this.typeID = typeID;
        this.typeName = typeName;
        this.availableTypes = availableTypes;
    }
 
    public List<String> getVehicleType() {
        return availableTypes;
    }
 
    public Long getTypeID() { return typeID; }
    public void setTypeID(Long typeID) { this.typeID = typeID; }
    public String getTypeName() { return typeName; }
    public void setTypeName(String typeName) { this.typeName = typeName; }
    public List<String> getAvailableTypes() { return availableTypes; }
    public void setAvailableTypes(List<String> availableTypes) { this.availableTypes = availableTypes; }
}