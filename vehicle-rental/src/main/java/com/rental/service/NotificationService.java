package com.rental.service;

public interface NotificationService {
    void sendEmail(String to, String subject, String body);
}
