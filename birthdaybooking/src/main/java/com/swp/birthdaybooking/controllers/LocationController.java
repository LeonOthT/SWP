package com.swp.birthdaybooking.controllers;


import com.swp.birthdaybooking.entities.Location;
import com.swp.birthdaybooking.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/location")
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.findAll();
    }

    @PostMapping
    public void addNewLocation(@RequestBody Location location){
        locationService.addNewLocation(location);
    }

    @PostMapping
    public void deleteLocation(@RequestBody Location location){
        locationService.deleteLocation(location);
    }
}