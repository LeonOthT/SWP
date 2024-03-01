package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    Optional<Location> findByLocationId(Integer locationId);
    Optional<Location> findByHostId(Integer hostId);
    Optional<Location> findByAddress(String address);
    Optional<Location> findByName(String name);
}
