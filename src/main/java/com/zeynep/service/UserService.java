package com.zeynep.service;

import com.zeynep.repository.UserRepository;
import com.zeynep.repository.entity.User;

import java.util.Optional;

public class UserService {

    UserRepository userRepository;

    public UserService() {
        this.userRepository=new UserRepository();
    }


    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> kullaniciAdinaGoreKullaniciBul(String username) {
        return userRepository.kullaniciAdinaGoreKullaniciBul(username);
    }
}
