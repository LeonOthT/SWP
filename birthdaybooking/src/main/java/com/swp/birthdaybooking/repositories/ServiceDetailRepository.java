package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.ServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceDetailRepository extends JpaRepository<ServiceDetail, Integer> {
    Optional<ServiceDetail> findByCartId(Integer cartId);
    Optional<ServiceDetail> findByServiceId(Integer serviceId);
}
