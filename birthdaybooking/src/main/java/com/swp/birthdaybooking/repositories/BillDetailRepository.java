package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Integer> {

    Optional<BillDetail> findByBillDetailId(Integer billDetailId);

    Optional<BillDetail> findByBillId(Integer billId);

    Optional<BillDetail> findByGuestid(Integer guestId);
}
