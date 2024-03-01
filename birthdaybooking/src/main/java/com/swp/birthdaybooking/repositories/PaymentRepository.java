package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.Date;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    Optional<Payment> findByPaymentId (Integer paymentId);
    Optional<Payment> findByBillId(Integer billId);
    Optional<Payment> findByPaymentDate(Date paymentDate);
    Optional<Payment> findByPaymentTime(Time paymentTime);
}
