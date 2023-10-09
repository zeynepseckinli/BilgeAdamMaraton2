package com.zeynep.service;

import com.zeynep.repository.ComputerRepository;
import com.zeynep.repository.entity.Computer;

public class ComputerService {
    ComputerRepository computerRepository;
    public ComputerService(){
        this.computerRepository= new ComputerRepository();
    }

    public Computer save(Computer computer) {
        return computerRepository.save(computer);
    }
}
