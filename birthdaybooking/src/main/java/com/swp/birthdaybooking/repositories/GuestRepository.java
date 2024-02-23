package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, String> {

}
