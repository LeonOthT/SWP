package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.HostRepository;
import com.swp.birthdaybooking.services.HostService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class HostConfig {

    private HostService hostService;

    @Bean
    CommandLineRunner commandLineRunner(HostRepository repository){
        return args -> {
            repository.saveAll(hostService.findAll());
        };
    }
}
