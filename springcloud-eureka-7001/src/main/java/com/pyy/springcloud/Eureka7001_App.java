package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author panyangyi
 * @create 2020/4/9 15:19
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001_App.class,args);
    }
}
