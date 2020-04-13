package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author panyangyi
 * @create 2020/4/9 17:32
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002_App.class,args);
    }
}
