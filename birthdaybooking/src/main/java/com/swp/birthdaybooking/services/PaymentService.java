package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Payment;
import com.swp.birthdaybooking.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public void addNewPayment(Payment payment){
        paymentRepository.save(payment);
    }

    public void deletePayment(Payment payment){
        paymentRepository.delete(payment);
    }
}