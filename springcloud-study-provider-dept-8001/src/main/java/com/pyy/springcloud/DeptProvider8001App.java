package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author panyangyi
 * @create 2020/4/9 11:02
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务内
public class DeptProvider8001App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001App.class,args);
    }
}
