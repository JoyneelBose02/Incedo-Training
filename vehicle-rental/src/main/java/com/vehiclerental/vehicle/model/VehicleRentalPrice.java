package com.vehiclerental.vehicle.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_rental_price")
public class VehicleRentalPrice extends VehicleManagement {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentalPriceID;
    private double rentalPricePerHour;
    private double rentalPricePerDay;
 
    public VehicleRentalPrice() {}
 
    public VehicleRentalPrice(Long rentalPriceID, double rentalPricePerHour, double rentalPricePerDay, Long vehicleID, String vehicleName, String vehicleState, double rentalCost) {
        super(vehicleID, vehicleName, vehicleState, rentalCost);
        this.rentalPriceID = rentalPriceID;
        this.rentalPricePerHour = rentalPricePerHour;
        this.rentalPricePerDay = rentalPricePerDay;
    }
 
    public double getRentalPricePerHour() { return rentalPricePerHour; }
    public void setRentalPricePerHour(double rentalPricePerHour) { this.rentalPricePerHour = rentalPricePerHour; }
 
    public double getRentalPricePerDay() { return rentalPricePerDay; }
    public void setRentalPricePerDay(double rentalPricePerDay) { this.rentalPricePerDay = rentalPricePerDay; }
 
    public Long getRentalPriceID() { return rentalPriceID; }
    public void setRentalPriceID(Long rentalPriceID) { this.rentalPriceID = rentalPriceID; }
}