package com.rental.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "payer_id", nullable = false)
    private User payer;

    private double paymentAmount;
    private String paymentMode;
    private String paymentStatus;
    private LocalDateTime paymentDate;
}
