package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.ScheduleRepository;
import com.swp.birthdaybooking.services.ScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class ScheduleConfig {
    private ScheduleService scheduleService;

    @Bean
    CommandLineRunner commandLineRunner(ScheduleRepository repository){
        return args -> {
            repository.saveAll(scheduleService.findAll());
        };
    }
}
