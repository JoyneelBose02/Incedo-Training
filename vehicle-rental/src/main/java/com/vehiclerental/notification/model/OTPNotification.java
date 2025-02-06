package com.vehiclerental.notification.model;

import java.util.Date;

public class OTPNotification extends Notification {
	String OTPCode;
	Date expiryTime = new Date();
	String notificationMessage;
	String status;
	Date timestamp = new Date();
	
	public String sendOTP() {
		return OTPCode;
	}
	
	public boolean validateOTP(String otp) {
		if(otp == OTPCode) {
			return true;
		}
		return false;
	}
	public String getNotificationDetails() {
		return notificationMessage;
	}
}
