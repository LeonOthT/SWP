package com.thanhdung.driverapp.Service;

import com.thanhdung.driverapp.DTO.UserDTO;
import com.thanhdung.driverapp.Service.imp.UserServiceImp;
import com.thanhdung.driverapp.entity.Users;
import com.thanhdung.driverapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements UserServiceImp {
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
}
