package com.rental.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "company_payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyPayment {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    private String amountReceived;
    private String paymentStatus;
}
