package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Guest")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    @Id
    @Column(name = "guest_id")
    private int guestId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Account account;

    @Column(name = "phone", length = 250)
    private String phone;

    @Column(name = "name", length = 250)
    private String name;

    @Column(name = "gender", length = 250)
    private String gender;
}

