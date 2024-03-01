package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HostRepository extends JpaRepository<Host, Integer> {
    Optional<Host> findByUserId(Integer userId);
    Optional<Host> findByName(String name);
    Optional<Host> findByPhone(String phone);
}
