package com.zeynep.service;

import com.zeynep.repository.LikeRepository;
import com.zeynep.repository.entity.Like;

public class LikeService {
    LikeRepository likeRepository;

    public LikeService() {
        this.likeRepository=new LikeRepository();
    }


    public Like save(Like like) {
        return likeRepository.save(like);
    }


}
