package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, String> {

}
