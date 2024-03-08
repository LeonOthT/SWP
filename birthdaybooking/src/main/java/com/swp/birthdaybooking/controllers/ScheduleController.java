package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Schedule;
import com.swp.birthdaybooking.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public List<Schedule> getAllSchedules() {
        return scheduleService.findAll();
    }

    @PostMapping
    public void addNewSchedule(@RequestBody Schedule schedule){
        scheduleService.addNewSchedule(schedule);
    }

    @PostMapping
    public void deleteSchedule(@RequestBody Schedule schedule){
        scheduleService.deleteSchedule(schedule);
    }
}
