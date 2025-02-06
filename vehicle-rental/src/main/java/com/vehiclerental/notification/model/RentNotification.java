package com.vehiclerental.notification.model;

import java.util.Date;

public class RentNotification extends Notification {
	String notificationMessage;
	String status;
	Date timestamp;
	
	
	public String getNotifications() {
		return notificationMessage;
	}
	
	public String updateStatus() {
		System.out.println("Status Updated at: " + timestamp.getTime()); 
		return status;
	}
	
}
