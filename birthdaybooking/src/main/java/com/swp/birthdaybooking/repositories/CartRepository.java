package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String> {

}
