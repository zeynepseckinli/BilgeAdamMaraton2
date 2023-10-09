package com.zeynep.controller;

import com.zeynep.service.PhotoService;

public class PhotoController {
    PhotoService photoService;

    public PhotoController() {
        this.photoService=new PhotoService();
    }
}
