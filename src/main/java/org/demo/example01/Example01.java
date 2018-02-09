package org.demo.example01;

import org.demo.example01.config.TaskExecutorConfig;
import org.demo.example01.service.AsyncTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i=0; i<10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();

    }

}
