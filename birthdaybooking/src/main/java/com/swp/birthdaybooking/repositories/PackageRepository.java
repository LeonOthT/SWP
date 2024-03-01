package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PackageRepository extends JpaRepository<Package, Integer> {
    Optional<Package> findByPackageId(Integer packageId);
    Optional<Package> findByName(String name);
    Optional<Package> findByPrice(Float price);
}
