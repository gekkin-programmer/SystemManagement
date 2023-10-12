package com.SchoolManagement.SystemManagement.Repository;

import com.SchoolManagement.SystemManagement.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}
