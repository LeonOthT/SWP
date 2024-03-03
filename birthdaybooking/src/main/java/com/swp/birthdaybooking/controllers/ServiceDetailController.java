package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.ServiceDetail;
import com.swp.birthdaybooking.services.ServiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/serviceDetail")
public class ServiceDetailController {

    private final ServiceDetailService serviceDetailService;

    @Autowired
    public ServiceDetailController(ServiceDetailService serviceDetailService) {
        this.serviceDetailService = serviceDetailService;
    }

    @GetMapping
    public List<ServiceDetail> getAllServiceDetails() {
        return serviceDetailService.findAll();
    }
}