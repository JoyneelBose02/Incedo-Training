package com.rental.service;


import com.rental.entity.Vehicle;
import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(String id);
    Vehicle addVehicle(Vehicle vehicle);
    void deleteVehicle(String id);
}
