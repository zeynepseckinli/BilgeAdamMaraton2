package com.zeynep.controller;

import com.zeynep.repository.entity.User;
import com.zeynep.service.UserService;
import static com.zeynep.utility.Constants.*;

import java.util.Optional;
import java.util.Scanner;

public class UserController {
    UserService userService;
    Scanner scanner;

    public UserController(){
        this.userService = new UserService();
        this.scanner = new Scanner(System.in);
    }

    public User createAccount() {
        String ppURL = "";
        String name = "";
        String surname = "";
        String email = "";
        String address = "";
        String phone = "";

        System.out.print("Kullanici Adini Giriniz : ");
        String username = scanner.nextLine();
        System.out.print("Adinizi Giriniz : ");
        name = scanner.nextLine();
        System.out.print("Soyadinizi Giriniz : ");
        surname = scanner.nextLine();
        System.out.print("Email Adresinizi Giriniz : ");
        email = scanner.nextLine();
        while (true) {
            System.out.print("Profil Fotoğrafı olustur (E/H) : ");
            String harf= scanner.nextLine();
            if (harf.equalsIgnoreCase("e")) {
                System.out.print("Fotoğraf url'si giriniz : ");
                ppURL = scanner.nextLine();
                break;
            } else if (harf.equalsIgnoreCase("h")) {
                break;
            } else {
                System.out.println("Lutfen gecerli bir harf giriniz.");
            }
        }
        System.out.print("Adresinizi Giriniz : ");
        address = scanner.nextLine();
        System.out.print("Telefonunuzu Giriniz : ");
        phone = scanner.nextLine();

        User user = User.builder()
                .username(username)
                .name(name)
                .surname(surname)
                .email(email)
                .ppURL(ppURL)
                .address(address)
                .phone(phone)
                .baseEntity(getBaseEntity())
                .build();

        return userService.save(user);
    }


    public Optional<User> loginUser() {
        System.out.print("Lütfen username giriniz : ");
        String username = scanner.nextLine();
        Optional<User> user = kullaniciAdinaGoreKullaniciBul(username);
        if (user.isPresent()){
            System.out.println("Hosgeldin " + user.get().getName());
        } else {
            System.out.println("Kullanici bulunamadi.");
        }
        return user;
    }

    private Optional<User> kullaniciAdinaGoreKullaniciBul(String username) {
        return userService.kullaniciAdinaGoreKullaniciBul(username);
    }
}
