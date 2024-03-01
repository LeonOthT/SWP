package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Optional<Account> findByUserId(Integer userId);

    Optional<Account> findByEmail(String email);
}
