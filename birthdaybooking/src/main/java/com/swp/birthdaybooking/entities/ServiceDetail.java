package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Service_Detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDetail {

    @Id
    @Column(name = "service_detail_id")
    private int serviceDetailId;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "service_id")
    private Service service;
}
