package com.thanhdung.driverapp.Service;

import com.thanhdung.driverapp.DTO.UserDTO;
import com.thanhdung.driverapp.Service.imp.LoginServiceImp;
import com.thanhdung.driverapp.entity.Users;
import com.thanhdung.driverapp.payload.request.SignUpRequest;
import com.thanhdung.driverapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LoginService implements LoginServiceImp {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserDTO> getAllUsers() {
        List<Users> listUser = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (Users users : listUser) {
            UserDTO userDTO = new UserDTO();
            userDTO.setID(users.getID());
            userDTO.setUserID(users.getUserID());
            userDTO.setFullname(users.getFullname());
            userDTO.setPassword(users.getPassword());
            userDTO.setRoleID(users.getRoleID());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public boolean checkLogin(String fullname, String password) {
        List<Users> listUsers=userRepository.findByFullnameAndPassword(fullname, password);
        return listUsers.size() > 0;

    }

    @Override
    public boolean addUsers(SignUpRequest signUpRequest) {
        Users users=new Users();
        users.setUserID(signUpRequest.getUserid());
        users.setFullname(signUpRequest.getFullname());
        users.setPassword(signUpRequest.getPassword());
        users.setRoleID(signUpRequest.getRoleid());
        try{
            userRepository.save(users);
            return true;
        }catch(Exception e){

                return false;

        }
    }

}
