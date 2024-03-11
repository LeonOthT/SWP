package com.thanhdung.driverapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private Users user;

    @Column(name = "RoleID")
    private int RoleID;

    @Column(name = "StaffName")
    private String StaffName;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Phone")
    private String Phone;
}



