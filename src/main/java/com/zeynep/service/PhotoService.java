package com.zeynep.service;

import com.zeynep.repository.PhotoRepository;

public class PhotoService {
    PhotoRepository photoRepository;

    public PhotoService() {
        this.photoRepository=new PhotoRepository();
    }
}
