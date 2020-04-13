package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author panyangyi
 * @create 2020/4/12 16:46
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptHystrixDashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixDashboard_App.class,args);
    }
}
