package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.GuestRepository;
import com.swp.birthdaybooking.services.GuestService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class GuestConfig {

    private GuestService guestService;

    @Bean
    CommandLineRunner commandLineRunner(GuestRepository repository){
        return args -> {
            repository.saveAll(guestService.findAll());
        };
    }
}
