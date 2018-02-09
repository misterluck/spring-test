package org.demo.example03.config;

import org.demo.example03.condition.LinuxCondition;
import org.demo.example03.condition.WindowsCondition;
import org.demo.example03.service.DemoService;
import org.demo.example03.service.impl.LinuxDemoServiceImpl;
import org.demo.example03.service.impl.WindowsDemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(value = WindowsCondition.class)
    public DemoService windowsDemoService() {
        return new WindowsDemoServiceImpl();
    }

    @Bean
    @Conditional(value = LinuxCondition.class)
    public DemoService linuxDemoService() {
        return new LinuxDemoServiceImpl();
    }

}
