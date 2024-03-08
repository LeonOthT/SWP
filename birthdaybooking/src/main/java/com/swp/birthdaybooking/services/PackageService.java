package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Package;
import com.swp.birthdaybooking.repositories.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageService {

    private final PackageRepository packageRepository;

    @Autowired
    public PackageService(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    public List<Package> findAll() {
        return packageRepository.findAll();
    }

    public void addNewPackage(Package thisPackage){
        packageRepository.save(thisPackage);
    }

    public void deletePackage(Package thisPackage){
        packageRepository.delete(thisPackage);
    }
}