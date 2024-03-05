package com.swp.birthdaybooking.configs;

import com.swp.birthdaybooking.repositories.FeedbackRepository;
import com.swp.birthdaybooking.services.FeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class FeedbackConfig {
    private FeedbackService feedbackService;

    @Bean
    CommandLineRunner commandLineRunner(FeedbackRepository repository){
        return args -> {
            repository.saveAll(feedbackService.findAll());
        };
    }
}
