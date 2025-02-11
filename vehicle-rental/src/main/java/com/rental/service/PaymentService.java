package com.rental.service;

import com.rental.entity.Payment;
import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(String id);
    Payment processPayment(Payment payment);
}
