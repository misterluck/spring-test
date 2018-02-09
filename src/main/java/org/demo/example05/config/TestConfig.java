package org.demo.example05.config;

import org.demo.example05.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {

    @Bean
    @Profile(value = "dev")
    public TestBean devTestBean() {
        return new TestBean("from development profile");
    }

    @Bean
    @Profile(value = "prod")
    public TestBean prodTestBean() {
        return new TestBean("from production profile");
    }

}
