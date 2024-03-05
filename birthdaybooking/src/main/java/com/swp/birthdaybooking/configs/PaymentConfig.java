package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.PaymentRepository;
import com.swp.birthdaybooking.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class PaymentConfig {

    private PaymentService paymentService;

    @Bean
    CommandLineRunner commandLineRunner(PaymentRepository repository){
        return args -> {
            repository.saveAll(paymentService.findAll());
        };
    }

}
