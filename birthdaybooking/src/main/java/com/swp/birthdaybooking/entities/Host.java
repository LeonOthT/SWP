package com.swp.birthdaybooking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Host {
    @Id
    private int hostId;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private Account account;

    private String name;

    private String phone;
}

