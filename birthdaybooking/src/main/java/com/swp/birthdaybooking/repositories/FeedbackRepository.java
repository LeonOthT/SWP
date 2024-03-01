package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {


    Optional<Feedback> findByFeedbackId(Integer feedbackId);

    Optional<Feedback> findByGuestId(Integer guestId);

    Optional<Feedback> findByFeedbackDate(Date feedbackDate);


}
