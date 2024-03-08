package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Bill;
import com.swp.birthdaybooking.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }


    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    public void addNewBill(Bill bill){
        billRepository.save(bill);
    }

    public void deleteBill(Bill bill){
        billRepository.delete(bill);
    }

}
