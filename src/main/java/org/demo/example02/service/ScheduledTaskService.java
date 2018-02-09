package org.demo.example02.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每个五秒执行一次"+System.currentTimeMillis());
    }

    @Scheduled(cron = "0 27 15 ? * *")
    public void fixTimeExecution() {
        System.out.println("定时任务："+System.currentTimeMillis());
    }

}
