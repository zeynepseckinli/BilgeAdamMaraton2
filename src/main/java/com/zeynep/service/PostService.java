package com.zeynep.service;

import com.zeynep.repository.PostRepository;
import com.zeynep.repository.entity.Post;

import java.util.List;

public class PostService {
    PostRepository postRepository;

    public PostService() {
        this.postRepository=new PostRepository();
    }


    public Post save(Post post) {
        return postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public List<Post> birKisiyeAitPostlar(Long userId) {

        return postRepository.birKisiyeAitPostlar(userId);
    }
}
