package com.example.concourseDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunnerConfig {
    @RequestMapping("/")
    public String helloworld() {
        return "hello world";
    }

}
