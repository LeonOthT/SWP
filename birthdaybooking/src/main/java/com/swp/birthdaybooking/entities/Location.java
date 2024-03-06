package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "location")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @Column(name = "location_id")
    private int locationId;

    @ManyToOne
    @JoinColumn(name = "host_id", referencedColumnName = "host_id")
    private Host host;

    @Column(name = "address", length = 250)
    private String address;

    @Column(name = "name", length = 250)
    private String name;
}
