package com.swp.birthdaybooking.controllers;


import com.swp.birthdaybooking.entities.ServiceOfPackage;
import com.swp.birthdaybooking.services.ServiceOfPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/serviceOfPackage")
public class ServiceOfPackageController {

    private final ServiceOfPackageService serviceOfPackageService;

    @Autowired
    public ServiceOfPackageController(ServiceOfPackageService serviceOfPackageService) {
        this.serviceOfPackageService = serviceOfPackageService;
    }

    @GetMapping
    public List<ServiceOfPackage> getAllServiceOfPackages() {
        return serviceOfPackageService.findAll();
    }
}
