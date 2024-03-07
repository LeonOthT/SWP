package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.BillDetail;
import com.swp.birthdaybooking.repositories.BillDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BillDetailService {

    private final BillDetailRepository billDetailRepository;


    @Autowired
    public BillDetailService(BillDetailRepository billDetailRepository) {
        this.billDetailRepository = billDetailRepository;
    }


    public List<BillDetail> findAll() {
        return billDetailRepository.findAll();
    }
    public void addNewBill(BillDetail billDetail){
        billDetailRepository.save(billDetail);
    }
}
