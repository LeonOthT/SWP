package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.ServiceOfPackageRepository;
import com.swp.birthdaybooking.services.ServiceOfPackageService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class ServiceOfPackageConfig {
    private ServiceOfPackageService serviceOfPackageService;

    @Bean
    CommandLineRunner commandLineRunner(ServiceOfPackageRepository repository){
        return args -> {
            repository.saveAll(serviceOfPackageService.findAll());
        };
    }
}
