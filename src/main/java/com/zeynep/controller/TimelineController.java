package com.zeynep.controller;

import com.zeynep.service.TimelineService;

public class TimelineController {
    TimelineService timelineService;

    public TimelineController() {
        this.timelineService= new TimelineService();
    }
}
