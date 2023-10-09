package com.zeynep.service;

import com.zeynep.repository.TimelineRepository;

public class TimelineService {
    TimelineRepository timelineRepository;

    public TimelineService() {
        this.timelineRepository= new TimelineRepository();
    }
}
