package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.ScheduleDetailRepository;
import com.swp.birthdaybooking.services.ScheduleDetailService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class ScheduleDetailConfig {
    private ScheduleDetailService scheduleDetailService;

    @Bean
    CommandLineRunner commandLineRunner(ScheduleDetailRepository repository){
        return args -> {
            repository.saveAll(scheduleDetailService.findAll());
        };
    }
}
