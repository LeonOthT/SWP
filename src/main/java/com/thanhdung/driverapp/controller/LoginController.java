package com.thanhdung.driverapp.controller;

import com.thanhdung.driverapp.DTO.UserDTO;
import com.thanhdung.driverapp.Service.LoginService;
import com.thanhdung.driverapp.Service.imp.LoginServiceImp;
import com.thanhdung.driverapp.entity.Users;
import com.thanhdung.driverapp.payload.ResponseData;
import com.thanhdung.driverapp.payload.request.SignUpRequest;
import com.thanhdung.driverapp.repository.UserRepository;
import com.thanhdung.driverapp.util.JwtUtilHelper;
import com.thanhdung.driverapp.util.JwtUtilHelper;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKey;
import java.util.Base64;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginServiceImp loginServiceImp;
    @Autowired
    JwtUtilHelper jwtUtilHelper;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String fullname,@RequestParam String password){
        ResponseData responseData=new ResponseData();
        if(loginServiceImp.checkLogin(fullname,password)){
            String token = jwtUtilHelper.generateToken(fullname);
            responseData.setData(token);
        }else{
            responseData.setData("");
            responseData.setIsSuccess(false);
        }

        return new ResponseEntity<>(responseData,HttpStatus.OK);

    }
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignUpRequest signUpRequest){
        ResponseData responseData=new ResponseData();
        responseData.setData(loginServiceImp.addUsers(signUpRequest));
        return new ResponseEntity<>(responseData,HttpStatus.OK);

    }

}
