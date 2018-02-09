package org.demo.example01.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer integer) {
        System.out.println("执行异步任务："+integer);
    }

    @Async
    public void executeAsyncTaskPlus(Integer integer) {
        System.out.println("执行异步任务Plus："+integer);
    }

}
