package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {
    Optional<Guest> findByUserId(Integer userId);
    Optional<Guest> findByPhone(String phone);
    Optional<Guest> findByName(String name);
}
