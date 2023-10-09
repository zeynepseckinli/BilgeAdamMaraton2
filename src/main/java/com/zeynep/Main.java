package com.zeynep;

import com.zeynep.controller.*;
import com.zeynep.repository.entity.User;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    Scanner scanner;
    PostController postController;
    LikeController likeController;
    UserController userController;
    TimelineController timelineController;
    ComputerController computerController;
    ComputerSpecController computerSpecController;

    public Main() {
        this.scanner = new Scanner(System.in);
        this.postController = new PostController();
        this.likeController = new LikeController();
        this.userController = new UserController();
        this.timelineController = new TimelineController();
        this.computerController = new ComputerController();
        this.computerSpecController = new ComputerSpecController();
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.pcShareApp();
    }

    private Integer girisMenu() {
        System.out.println("### PC SHARE Uygulamasina Hosgeldiniz! ####");
        System.out.println("1- Kullanici Olustur");
        System.out.println("2- Kullanici Girisi");
        System.out.println("0 - Cikis");
        System.out.print("Secim yapiniz : ");
        Integer secim = Integer.parseInt(scanner.nextLine());
        return secim;
    }

    public void pcShareApp(){
        Integer secim = 0;
        do {
            secim = girisMenu();
            switch(secim){
                case 1:
                    userController.createAccount();
                    break;
                case 2:{
                    Optional<User> user=userController.loginUser();
                    if (user.isPresent()){
                        userMenu(user.get());
                    }
                    break;
                }
                case 0: {
                    System.out.println("Cikis Yapildi.");break;
                }
            }
        }while (secim!=0);
    }

    private void userMenu(User user) {
        Integer secim  =0;
        do {
            System.out.println("1- Bilgisayar Bileseni Olustur");
            System.out.println("2- Bilgisayar Olustur");
            System.out.println("3- Yeni Post At");
            System.out.println("4- Post'a Begeni Yap");
            System.out.println("5- Tum postlari Listele");
            System.out.println("6- Begendigim Gonderiler");
            System.out.println("7- Bir kisiye ait postlari Listele");
            System.out.println("0- Cikis Yap");
            System.out.print("Secim yapiniz : ");
            secim = Integer.parseInt(scanner.nextLine());
            switch (secim){
                case 1 : {
                    computerSpecController.createSpec();
                    break;
                }
                case 2:
                    computerController.createComputer(user);
                    break;
                case 3:
                    postController.newPost(user);
                    break;
                case 4:
                    likeController.likePost(user);
                    break;
                case 5:
                    postController.findAll().forEach(System.out::println);
                    break;
                case 6:

                    break;
                case 7:
                    postController.findPostsByUserId(user.getId()).forEach(System.out::println);
                    break;
                case 0:{
                    System.out.println("Cikis Yapildi.");
                    break;
                }
            }

        }while (secim!=0);
    }
}