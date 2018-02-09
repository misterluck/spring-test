package org.demo.example03.service.impl;

import org.demo.example03.service.DemoService;

public class LinuxDemoServiceImpl implements DemoService {
    public String showListCmd() {
        return "ls";
    }
}
