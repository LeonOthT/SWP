package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Guest;
import com.swp.birthdaybooking.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/guest")
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.findAll();
    }

    @PostMapping
    public void addNewGuest(@RequestBody Guest guest){
        guestService.addNewGuest(guest);
    }
}
