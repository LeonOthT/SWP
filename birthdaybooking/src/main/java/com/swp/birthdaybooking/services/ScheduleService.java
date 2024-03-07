package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Schedule;
import com.swp.birthdaybooking.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    public void addNewSchedule(Schedule schedule){
        scheduleRepository.save(schedule);
    }
}