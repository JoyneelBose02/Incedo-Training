package com.vehiclerental.notification.model;

import java.util.Date;

public class PeriodNotification extends Notification {
	Date periodStart = new Date();
	Date periodEnd = new Date();
	String notificationMessage;
	String status;
	Date timestamp = new Date();
	public void setNotification(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String updateStatus() {
		System.out.println("Status updated at: " + timestamp.getTime());
		return status;
	}
	public String getNotificationDetails() {
		return notificationMessage;
	}
	public void scheduleNotifications() {
		Date date = new Date();
		if(periodEnd == date) {
			System.out.println(notificationMessage);
		}
	}
	
}
