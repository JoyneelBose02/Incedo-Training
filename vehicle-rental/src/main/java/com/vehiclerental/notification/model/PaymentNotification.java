package com.vehiclerental.notification.model;

import java.util.Date;

public class PaymentNotification extends Notification {
	String paymentId;
	float amount;
	String paymentStatus;
	String notificationMessage;
	String status;
	Date timestamp = new Date();
	
	public void setNotification(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}
	
	public String updateStatus() {
		System.out.println("Status Updated at: " + timestamp.getTime());
		return status;
	}
	
	public String getNotificationDetails() {
		return notificationMessage;
	}
	public void logPaymentDetails() {
		
	}
}
