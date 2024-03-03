package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.BillDetail;
import com.swp.birthdaybooking.services.BillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/billDetail")
public class BillDetailController {

    private final BillDetailService billDetailService;

    @Autowired
    public BillDetailController(BillDetailService billDetailService) {
        this.billDetailService = billDetailService;
    }

    @GetMapping
    public List<BillDetail> getAllBillDetails() {
        return billDetailService.findAll();
    }
}
