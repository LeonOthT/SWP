package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.CartRepository;
import com.swp.birthdaybooking.services.CartService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class CartConfig {
    private CartService cartService;

    @Bean
    CommandLineRunner commandLineRunner(CartRepository repository){
        return args -> {
            repository.saveAll(cartService.findAll());
        };
    }
}
