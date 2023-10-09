package com.zeynep.controller;

import com.zeynep.repository.entity.ComputerSpec;
import com.zeynep.service.ComputerSpecService;

import java.util.Scanner;

import static com.zeynep.utility.Constants.getBaseEntity;

public class ComputerSpecController {
    Scanner scanner;
    ComputerSpecService computerSpecService;

    public ComputerSpecController() {
        this.computerSpecService=new ComputerSpecService();
        this.scanner = new Scanner(System.in);
    }

    public ComputerSpec createSpec() {
        String gpu = "";
        String cpu = "";
        String ram = "";
        String storage = "";
        String monitor = "";
        Long computerId = 0L;

        System.out.print("GPU Adini Giriniz : ");
        gpu = scanner.nextLine();
        System.out.print("CPU Giriniz : ");
        cpu = scanner.nextLine();
        System.out.print("RAM Giriniz : ");
        ram = scanner.nextLine();
        System.out.print("Storage Giriniz : ");
        storage = scanner.nextLine();
        System.out.print("Monitor Giriniz :  ");
        monitor = scanner.nextLine();
        System.out.print("ComputerId Giriniz : ");
        computerId = Long.parseLong(scanner.nextLine());

        ComputerSpec computerSpec = ComputerSpec.builder()
                .gpu(gpu)
                .cpu(cpu)
                .ram(ram)
                .storage(storage)
                .monitor(monitor)
                .computerId(computerId)
                .baseEntity(getBaseEntity())
                .build();

        return computerSpecService.save(computerSpec);
    }
}
