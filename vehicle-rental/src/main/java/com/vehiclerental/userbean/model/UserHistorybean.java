package com.vehiclerental.userbean.model;

import java.util.List;

public class UserHistorybean {
    private List<String> bookingHistory;
    private List<String> paymentHistory;
 
   
    public UserHistorybean(List<String> bookingHistory, List<String> paymentHistory) {
        this.bookingHistory = bookingHistory;
        this.paymentHistory = paymentHistory;
    }
 
    
    public void viewUserBookingHistory() {
        if (bookingHistory == null || bookingHistory.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("User's Booking History:");
            for (String booking : bookingHistory) {
                System.out.println("- " + booking);
            }
        }
    }
 
    public void viewUserPaymentHistory() {
        if (paymentHistory == null || paymentHistory.isEmpty()) {
            System.out.println("No payment records found.");
        } else {
            System.out.println("User's Payment History:");
            for (String payment : paymentHistory) {
                System.out.println("- " + payment);
            }
        }
    }
 
    // Getters
    public List<String> getBookingHistory() {
        return bookingHistory;
    }
 
    public List<String> getPaymentHistory() {
        return paymentHistory;
    }
 
    // Setters
    public void setBookingHistory(List<String> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }
 
    public void setPaymentHistory(List<String> paymentHistory) {
        this.paymentHistory = paymentHistory;
    }
}