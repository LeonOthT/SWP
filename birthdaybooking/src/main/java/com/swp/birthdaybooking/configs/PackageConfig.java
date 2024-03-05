package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.PackageRepository;
import com.swp.birthdaybooking.services.PackageService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class PackageConfig {
    private PackageService packageService;

    @Bean
    CommandLineRunner commandLineRunner(PackageRepository repository){
        return args -> {
            repository.saveAll(packageService.findAll());
        };
    }
}
