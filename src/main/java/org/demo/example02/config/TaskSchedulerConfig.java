package org.demo.example02.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configurable
@ComponentScan(value = "org.demo.example02")
@EnableScheduling
public class TaskSchedulerConfig {

}
