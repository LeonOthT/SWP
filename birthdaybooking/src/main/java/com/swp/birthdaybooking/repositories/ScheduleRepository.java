package com.swp.birthdaybooking.repositories;

import com.swp.birthdaybooking.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {

}
