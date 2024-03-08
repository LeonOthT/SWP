package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.ServiceBirthday;
import com.swp.birthdaybooking.services.ServiceBirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/serviceBirthday")
public class ServiceBirthdayController {

    private final ServiceBirthdayService serviceBirthdayService;

    @Autowired
    public ServiceBirthdayController(ServiceBirthdayService serviceBirthdayService) {
        this.serviceBirthdayService = serviceBirthdayService;
    }

    @GetMapping
    public List<ServiceBirthday> getAllServiceBirthdays() {
        return serviceBirthdayService.findAll();
    }

    @PostMapping
    public void addNewServiceBirthday(@RequestBody ServiceBirthday serviceBirthday){
        serviceBirthdayService.addNewServiceBirthday(serviceBirthday);
    }

    @PostMapping
    public void deleteServiceBirthday(@RequestBody ServiceBirthday serviceBirthday){
        serviceBirthdayService.deleteServiceBirthday(serviceBirthday);
    }
}
