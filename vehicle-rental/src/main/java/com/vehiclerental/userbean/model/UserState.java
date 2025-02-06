package com.vehiclerental.userbean.model;

public class UserState {
    private String rentalStatus;
    private int totalRentals;

    // Constructors
    public UserState() {}

    public UserState(String rentalStatus, int totalRentals) {
        this.rentalStatus = rentalStatus;
        this.totalRentals = totalRentals;
    }

    // Getters and Setters
    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public int getTotalRentals() {
        return totalRentals;
    }

    public void setTotalRentals(int totalRentals) {
        this.totalRentals = totalRentals;
    }

 
    public UserState getUserState(String userID) {
        return null;
    }

    public void updateRentalStatus(String userID, String newStatus) {
       
    }
}