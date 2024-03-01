package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.ServiceOfPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceOfPackageRepository extends JpaRepository<ServiceOfPackage, Integer> {
    Optional<ServiceOfPackage> findByServiceId(Integer serviceId);
    Optional<ServiceOfPackage> findByPackageId(Integer packageId);
}
