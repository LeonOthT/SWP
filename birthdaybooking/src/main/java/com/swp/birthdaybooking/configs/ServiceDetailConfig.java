package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.ServiceDetailRepository;
import com.swp.birthdaybooking.services.ServiceDetailService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class ServiceDetailConfig {

    private ServiceDetailService serviceDetailService;

    @Bean
    CommandLineRunner commandLineRunner(ServiceDetailRepository repository){
        return args -> {
            repository.saveAll(serviceDetailService.findAll());
        };
    }
}
