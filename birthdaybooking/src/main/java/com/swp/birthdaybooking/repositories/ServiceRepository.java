package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String> {

}
