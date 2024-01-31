package com.thanhdung.driverapp.repository;

import com.thanhdung.driverapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    //select * Users where fullname="" and password=""
    List<Users> findByFullnameAndPassword(String fullname, String password);
    Users findByFullname(String fullname);
}
