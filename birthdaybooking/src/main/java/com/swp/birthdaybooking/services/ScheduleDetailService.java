package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.ScheduleDetail;
import com.swp.birthdaybooking.repositories.ScheduleDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleDetailService {

    private final ScheduleDetailRepository scheduleDetailRepository;

    @Autowired
    public ScheduleDetailService(ScheduleDetailRepository scheduleDetailRepository) {
        this.scheduleDetailRepository = scheduleDetailRepository;
    }

    public List<ScheduleDetail> findAll() {
        return scheduleDetailRepository.findAll();
    }

    public void addNewScheduleDetail(ScheduleDetail scheduleDetail){
        scheduleDetailRepository.save(scheduleDetail);
    }
}