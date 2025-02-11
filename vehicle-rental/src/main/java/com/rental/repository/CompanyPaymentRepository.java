package com.rental.repository;

import com.rental.entity.CompanyPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CompanyPaymentRepository extends JpaRepository<CompanyPayment, String> {
}
