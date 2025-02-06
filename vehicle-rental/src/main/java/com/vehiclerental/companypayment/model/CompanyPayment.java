package com.vehiclerental.companypayment.model;


import org.springframework.stereotype.Component;
@Component
public class CompanyPayment {
    private String paymentId;
    private int amountReceived;
    private String paymentStatus;
 
    public CompanyPayment() {}
 
    public CompanyPayment(String paymentId, int amountReceived, String paymentStatus) {
        this.paymentId = paymentId;
        this.amountReceived = amountReceived;
        this.paymentStatus = paymentStatus;
    }
 
    public String getPaymentId() {
    	return paymentId;
    	}
    public void setPaymentId(String paymentId) {
    	this.paymentId = paymentId;
    	}
 
    public int getAmountReceived() {
    	return amountReceived;
    	}
    public void setAmountReceived(int amountReceived) {
    	this.amountReceived = amountReceived;
    	}
 
    public String getPaymentStatus() {
    	return paymentStatus;
    	}
    public void setPaymentStatus(String paymentStatus) {
    	this.paymentStatus = paymentStatus;
    	}
 
    public String getyPayment() {
    	return "Payment ID: " + paymentId + ", Amount Received: " + amountReceived;
    	}
    public String getPaymentStatusInfo() {
    	return "Payment Status: " + paymentStatus;
    	}
}