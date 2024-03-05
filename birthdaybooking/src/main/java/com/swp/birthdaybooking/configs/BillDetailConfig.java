package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.BillDetailRepository;
import com.swp.birthdaybooking.services.BillDetailService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class BillDetailConfig {
    private BillDetailService billDetailService;

    @Bean
    CommandLineRunner commandLineRunner(BillDetailRepository repository){
        return args -> {
            repository.saveAll(billDetailService.findAll());
        };
    }
}
