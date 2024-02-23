package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}
