package org.demo.example04;

import org.demo.example04.config.MyConfig;
import org.demo.example04.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example04 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
    }

}
