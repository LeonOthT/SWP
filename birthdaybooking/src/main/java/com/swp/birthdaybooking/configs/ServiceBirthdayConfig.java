package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.ServiceBirthdayRepository;
import com.swp.birthdaybooking.services.ServiceBirthdayService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class ServiceBirthdayConfig {

    private ServiceBirthdayService serviceBirthdayService;

    @Bean
    CommandLineRunner commandLineRunner(ServiceBirthdayRepository repository){
        return args -> {
            repository.saveAll(serviceBirthdayService.findAll());
        };
    }
}
