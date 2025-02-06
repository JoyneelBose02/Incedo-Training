package com.vehiclerental.vehicle.model;

import java.util.*;

public class VehiclePayment {
	private double rentalRate;
	private double peakHourRate;
	private double rentalduration;
	private List<String>paymentMode =new ArrayList<>();
	
	public VehiclePayment () {}
	public VehiclePayment(double rentalRate, double peakHourRate, double rentalduration,
			List<String> paymentMode) {
		this.rentalRate=rentalRate;
		this.peakHourRate=peakHourRate;
		this.rentalduration=rentalduration;
		this.paymentMode=paymentMode;
		
	}
	public double calculatetotalpayment() {
		return rentalRate * rentalduration;
	}
	public boolean ispeakHour() {
		return true;
	}
	
 
}