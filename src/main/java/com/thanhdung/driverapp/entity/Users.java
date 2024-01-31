package com.thanhdung.driverapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "UserID")
    private int UserID;

    @Column(name = "Password")
    private String password;

    @Column(name = "RoleID")
    private int RoleID;

    @Column(name = "fullname")
    private String fullname;

    @OneToMany(mappedBy = "user") // Ánh xạ tới trường "user" trong Staff
    private Set<Staff> listStaff;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public void setListStaff(Set<Staff> listStaff) {
        this.listStaff = listStaff;
    }

    public String getFullname() {
        return fullname;
    }
}
