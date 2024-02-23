package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {

}
