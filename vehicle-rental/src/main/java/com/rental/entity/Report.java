package com.rental.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "report")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Report {

    @Id
    private String id;

    private String name;
    private String vehicleName;

    @OneToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    private int bookingDuration;

    @ManyToOne
    @JoinColumn(name = "rental_price", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "total_amount", nullable = false)
    private Payment payment;

    private String paymentStatus;
}
