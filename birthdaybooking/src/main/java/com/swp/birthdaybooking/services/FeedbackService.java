package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Feedback;
import com.swp.birthdaybooking.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public List<Feedback> findAll() {
        return feedbackRepository.findAll();
    }

    public void addNewFeedback (Feedback feedback){
        feedbackRepository.save(feedback);
    }

    public void deleteFeedback(Feedback feedback){
        feedbackRepository.delete(feedback);
    }
}
