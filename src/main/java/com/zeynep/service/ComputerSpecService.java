package com.zeynep.service;

import com.zeynep.repository.ComputerSpecRepository;
import com.zeynep.repository.entity.ComputerSpec;

public class ComputerSpecService {

    ComputerSpecRepository computerSpecRepository;
    public ComputerSpecService(){
        this.computerSpecRepository= new ComputerSpecRepository();
    }

    public ComputerSpec save(ComputerSpec computerSpec) {
        return computerSpecRepository.save(computerSpec);
    }
}
