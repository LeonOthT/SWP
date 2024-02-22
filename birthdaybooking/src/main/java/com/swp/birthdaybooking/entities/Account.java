package com.swp.birthdaybooking.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// Entity is a single instance of a domain object saved into the database as a record.
// It has some attributes that we represent as columns in our tables.
@Entity
@Table(name = "Account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id

    @Column(name = "user_id")
    private int userId;

    @Column(name = "email", length = 250, nullable = false)
    private String email;

    @Column(name = "password", length = 250, nullable = false)
    private String password;

    @Column(name = "roleId")
    private int roleId;
}
