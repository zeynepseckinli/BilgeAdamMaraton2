package com.zeynep.controller;

import com.zeynep.repository.entity.Computer;
import com.zeynep.repository.entity.User;
import com.zeynep.service.ComputerService;

import java.util.Scanner;

import static com.zeynep.utility.Constants.getBaseEntity;

public class ComputerController {
    ComputerService computerService;
    Scanner scanner;

    public ComputerController() {
        this.computerService=new ComputerService();
        this.scanner = new Scanner(System.in);
    }

    public Computer createComputer(User user) {
        String marka = "";
        String model = "";
        Long userId = user.getId();


        System.out.print("Marka Giriniz : ");
        marka = scanner.nextLine();
        System.out.print("Model Giriniz : ");
        model = scanner.nextLine();


        Computer computer = Computer.builder()
                .marka(marka)
                .model(model)
                .userId(userId)
                .baseEntity(getBaseEntity())
                .build();

        return computerService.save(computer);
    }
}
