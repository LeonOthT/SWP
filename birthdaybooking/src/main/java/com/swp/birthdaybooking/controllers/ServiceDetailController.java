package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.ServiceDetail;
import com.swp.birthdaybooking.services.ServiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void addNewServiceDetail(@RequestBody ServiceDetail serviceDetail){
        serviceDetailService.addNewServiceDetail(serviceDetail);
    }

    @PostMapping
    public void deleteServiceDetail(@RequestBody ServiceDetail serviceDetail){
        serviceDetailService.deleteServiceDetail(serviceDetail);
    }
}