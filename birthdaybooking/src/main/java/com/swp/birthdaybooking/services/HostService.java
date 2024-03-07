package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Host;
import com.swp.birthdaybooking.repositories.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostService {

    private final HostRepository hostRepository;

    @Autowired
    public HostService(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    public List<Host> findAll() {
        return hostRepository.findAll();
    }

    public void addNewHost(Host host){
        hostRepository.save(host);
    }
}