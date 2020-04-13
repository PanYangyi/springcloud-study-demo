package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author panyangyi
 * @create 2020/4/13 15:48
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigDeptClient8001_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigDeptClient8001_App.class,args);
    }
}
