package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Hosts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Host {

    @Id
    @Column(name = "host_id")
    private int hostId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Account account;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "phone", length = 250, nullable = false)
    private String phone;
}

