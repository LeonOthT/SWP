package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Feedback;
import com.swp.birthdaybooking.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public List<Feedback> getAllFeedbacks() {
        return feedbackService.findAll();
    }

    @PostMapping
    public void addNewFeedback(@RequestBody Feedback feedback){
        feedbackService.addNewFeedback(feedback);
    }
}
