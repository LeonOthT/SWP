package com.thanhdung.driverapp.controller;
import com.thanhdung.driverapp.Service.imp.LoginServiceImp;
import com.thanhdung.driverapp.payload.ResponseData;
import com.thanhdung.driverapp.payload.request.SignUpRequest;
import com.thanhdung.driverapp.util.JwtUtilHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginServiceImp loginServiceImp;

    JwtUtilHelper jwtUtilHelper;

    public LoginController(JwtUtilHelper jwtUtilHelper) {
        this.jwtUtilHelper = jwtUtilHelper;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String fullname,@RequestParam String password){
        ResponseData responseData=new ResponseData();
//        SecretKey secretKey=Keys.secretKeyFor(SignatureAlgorithm.HS256);
//        String encrypted=Encoders.BASE64.encode(secretKey.getEncoded());
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
