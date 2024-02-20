package com.swp.birthdaybooking.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// Entity is a single instance of a domain object saved into the database as a record.
// It has some attributes that we represent as columns in our tables.
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    private int userId;

    private String email;

    private String password;

    private int roleId;





}
