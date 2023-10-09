package com.zeynep.controller;

import com.zeynep.repository.entity.Like;
import com.zeynep.repository.entity.User;
import com.zeynep.service.LikeService;

import java.util.Scanner;

public class LikeController {
    LikeService likeService;
    Scanner scanner;

    public LikeController() {
        this.likeService =new LikeService();
        this.scanner = new Scanner(System.in);
    }

    public Like likePost(User user) {

        Long userId=user.getId();
        Long postId = 0L;
        System.out.println("Begeni yapacaginiz postun Id'sini giriniz");
        postId = Long.parseLong(scanner.nextLine());

        Like like = Like.builder()
                .userId(userId)
                .postId(postId)
                .build();
        return likeService.save(like);
    }

}
