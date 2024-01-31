package com.thanhdung.driverapp.Service.imp;

import com.thanhdung.driverapp.DTO.UserDTO;
import com.thanhdung.driverapp.payload.request.SignUpRequest;

import java.util.List;

public interface LoginServiceImp {
    List<UserDTO>getAllUsers();
    boolean checkLogin(String fullname,String password);
    boolean addUsers(SignUpRequest signUpRequest);
}
