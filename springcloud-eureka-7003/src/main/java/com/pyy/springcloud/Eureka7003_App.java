package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author panyangyi
 * @create 2020/4/9 17:34
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7003_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7003_App.class,args);
    }
}
