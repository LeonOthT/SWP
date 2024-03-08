package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.ServiceDetail;
import com.swp.birthdaybooking.repositories.ServiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDetailService {

    private final ServiceDetailRepository serviceDetailRepository;

    @Autowired
    public ServiceDetailService(ServiceDetailRepository serviceDetailRepository) {
        this.serviceDetailRepository = serviceDetailRepository;
    }

    public List<ServiceDetail> findAll() {
        return serviceDetailRepository.findAll();
    }

    public void addNewServiceDetail(ServiceDetail serviceDetail){
        serviceDetailRepository.save(serviceDetail);
    }

    public void deleteServiceDetail(ServiceDetail serviceDetail){
        serviceDetailRepository.delete(serviceDetail);
    }
}