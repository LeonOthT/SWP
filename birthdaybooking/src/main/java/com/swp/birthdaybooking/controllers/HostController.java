package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Host;
import com.swp.birthdaybooking.services.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/host")
public class HostController {

    private final HostService hostService;

    @Autowired
    public HostController(HostService hostService) {
        this.hostService = hostService;
    }

    @GetMapping
    public List<Host> getAllHosts() {
        return hostService.findAll();
    }

    @PostMapping
    public void addNewHost(@RequestBody Host host){
        hostService.addNewHost(host);
    }
}
