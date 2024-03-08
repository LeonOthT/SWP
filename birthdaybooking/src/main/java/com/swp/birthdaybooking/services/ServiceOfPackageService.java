package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.ServiceOfPackage;
import com.swp.birthdaybooking.repositories.ServiceOfPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOfPackageService {

    private final ServiceOfPackageRepository serviceOfPackageRepository;

    @Autowired
    public ServiceOfPackageService(ServiceOfPackageRepository serviceOfPackageRepository) {
        this.serviceOfPackageRepository = serviceOfPackageRepository;
    }

    public List<ServiceOfPackage> findAll() {
        return serviceOfPackageRepository.findAll();
    }

    public void addNewServiceOfPackage(ServiceOfPackage serviceOfPackage){
        serviceOfPackageRepository.save(serviceOfPackage);
    }

    public void deleteServiceOfPackage(ServiceOfPackage serviceOfPackage){
        serviceOfPackageRepository.delete(serviceOfPackage);
    }
}