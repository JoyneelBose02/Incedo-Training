package com.vehiclerental.booking.model;

public class BookingSection {
	private String bookingId;
	private String bookingTimeStamp;
	private String bookedUserID;
	private String vehicleType;
	private String location;
	private int Duration;
	private double rentalRates;
	double cost;
	public BookingSection() {}
	public BookingSection(String bookingId, String bookingTimeStamp, String bookedUserID, String vehicleType, String location,
			int Duration,double rentalRates ) {
		this.bookingId=bookingId;
		this.bookingTimeStamp=bookingTimeStamp;
		this.bookedUserID=bookedUserID;
		this.vehicleType=vehicleType;
		this.location=location;
		this.Duration=Duration;
		this.rentalRates=rentalRates;
	}
	public double calculateTotalCost() {
		return cost;
		
	}
	public boolean isValidBooking() {
		return true;
		
	}
	public void displayBookingSummary() {
		
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicletype(String vehicleType) {
		this.vehicleType=vehicleType;
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int Duration) {
		this.Duration= Duration;
	}
	public double getRentalRates() {
		return rentalRates;
	}
	public void setRentalRates(double rentalRates) {
		this.rentalRates=rentalRates;
	}
	public void cancelBooking() {
		
	}
}