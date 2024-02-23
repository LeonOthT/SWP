package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, String> {

}
