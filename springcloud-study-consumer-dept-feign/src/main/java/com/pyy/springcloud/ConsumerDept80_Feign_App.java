package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author panyangyi
 * @create 2020/4/11 13:56
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.pyy.springcloud")
public class ConsumerDept80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept80_Feign_App.class,args);
    }
}
