package com.example.demoforbanlance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoForBanlanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoForBanlanceApplication.class, args);
    }


    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String hostname;

    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name") String name) {
        return "你好，" + name + "。我是" + hostname + ",端口是" + port;
    }
}
