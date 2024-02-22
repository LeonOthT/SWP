package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ServiceOfPackage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceOfPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_of_package_id")
    private int serviceOfPackageId;

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "service_id")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "package_id", referencedColumnName = "package_id")
    private Package servicePackage;
}
