package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.LocationRepository;
import com.swp.birthdaybooking.services.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class LocationConfig {
    private LocationService locationService;

    @Bean
    CommandLineRunner commandLineRunner(LocationRepository repository){
        return args -> {
            repository.saveAll(locationService.findAll());
        };
    }
}
