package org.demo.example03;

import org.demo.example03.config.ConditionConfig;
import org.demo.example03.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.showListCmd());
    }

}
