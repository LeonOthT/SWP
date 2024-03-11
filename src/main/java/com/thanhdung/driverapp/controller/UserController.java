package com.thanhdung.driverapp.controller;

import com.thanhdung.driverapp.Service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImp userServiceImp;
    @GetMapping("/")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(userServiceImp.getAllUsers(), HttpStatus.OK);
    }
}
