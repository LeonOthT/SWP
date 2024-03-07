package com.swp.birthdaybooking.services;



import com.swp.birthdaybooking.entities.ServiceBirthday;
import com.swp.birthdaybooking.repositories.ServiceBirthdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ServiceBirthdayService {

    private final ServiceBirthdayRepository serviceBirthdayRepository;

    @Autowired
    public ServiceBirthdayService(ServiceBirthdayRepository serviceBirthdayRepository) {
        this.serviceBirthdayRepository = serviceBirthdayRepository;
    }

    public List<ServiceBirthday> findAll() {
        return serviceBirthdayRepository.findAll();
    }

    public void addNewServiceBirthday(ServiceBirthday serviceBirthday){
        serviceBirthdayRepository.save(serviceBirthday);
    }
}