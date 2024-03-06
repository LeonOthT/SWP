package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.ScheduleDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScheduleDetailRepository extends JpaRepository<ScheduleDetail, Integer> {

}
