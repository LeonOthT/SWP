package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Package;
import com.swp.birthdaybooking.services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/package")
public class PackageController {

    private final PackageService packageService;

    @Autowired
    public PackageController(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping
    public List<Package> getAllPackages() {
        return packageService.findAll();
    }

    @PostMapping
    public void addNewPackage(@RequestBody Package thisPackage){
        packageService.addNewPackage(thisPackage);
    }

    @PostMapping
    public void deletePackage(@RequestBody Package thisPackage){
        packageService.deletePackage(thisPackage);
    }
}
