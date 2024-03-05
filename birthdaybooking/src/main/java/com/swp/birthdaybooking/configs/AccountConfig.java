package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.AccountRepository;
import com.swp.birthdaybooking.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class AccountConfig {

    private AccountService accountService;

    //This method will be invoked at application startup
    @Bean
    CommandLineRunner commandLineRunner(AccountRepository repository){
        return args -> {
            repository.saveAll(accountService.findAll());
        };
    }
}
