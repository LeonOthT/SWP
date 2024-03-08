package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Payment;
import com.swp.birthdaybooking.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.findAll();
    }

    @PostMapping
    public void addNewPayment(@RequestBody Payment payment){
        paymentService.addNewPayment(payment);
    }

    @PostMapping
    public void deletePayment(@RequestBody Payment payment){
        paymentService.deletePayment(payment);
    }
}
