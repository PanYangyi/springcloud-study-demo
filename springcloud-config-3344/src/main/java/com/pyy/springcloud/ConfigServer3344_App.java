package com.pyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author panyangyi
 * @create 2020/4/13 15:30
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer3344_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344_App.class,args);
    }
}
