package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, String> {

}
