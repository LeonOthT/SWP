package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.ScheduleDetail;
import com.swp.birthdaybooking.services.ScheduleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/scheduleDetail")
public class ScheduleDetailController {

    private final ScheduleDetailService scheduleDetailService;

    @Autowired
    public ScheduleDetailController(ScheduleDetailService scheduleDetailService) {
        this.scheduleDetailService = scheduleDetailService;
    }

    @GetMapping
    public List<ScheduleDetail> getAllScheduleDetails() {
        return scheduleDetailService.findAll();
    }

    @PostMapping
    public void addNewScheduleDetail(@RequestBody ScheduleDetail scheduleDetail){
        scheduleDetailService.addNewScheduleDetail(scheduleDetail);
    }

    @PostMapping
    public void deleteScheduleDetail(@RequestBody ScheduleDetail scheduleDetail){
        scheduleDetailService.deleteScheduleDetail(scheduleDetail);
    }
}
