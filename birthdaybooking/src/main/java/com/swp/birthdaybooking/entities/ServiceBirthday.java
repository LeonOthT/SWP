package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceBirthday {

    @Id
    @Column(name = "service_id")
    private int serviceId;

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
    private Location location;

    @Column(name = "name", length = 250)
    private String name;

    @Column(name = "price")
    private float price;

    @Column(name = "description", length = 250)
    private String description;
}
