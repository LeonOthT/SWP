package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Host;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostRepository extends JpaRepository<Host, String> {

}
