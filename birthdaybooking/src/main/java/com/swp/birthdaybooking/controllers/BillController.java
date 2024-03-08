package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Bill;
import com.swp.birthdaybooking.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bill")
public class BillController {

    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping
    public List<Bill> getAllBills() {
        return billService.findAll();
    }

    @PostMapping
    public void addNewBill(@RequestBody Bill bill){
        billService.addNewBill(bill);
    }

    @PostMapping
    public void deleteBill(@RequestBody Bill bill){
        billService.deleteBill(bill);
    }
}

