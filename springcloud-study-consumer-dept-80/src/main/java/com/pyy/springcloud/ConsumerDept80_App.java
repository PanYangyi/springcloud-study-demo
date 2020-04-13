package com.pyy.springcloud;

import com.pyy.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author panyangyi
 * @create 2020/4/9 14:09
 */
@SpringBootApplication
@EnableEurekaClient
//自定义我们自己的负载均衡算法
@RibbonClient(name = "STUDY-SPRINGCLOUD-DEPT",configuration = MyRule.class)
public class ConsumerDept80_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept80_App.class,args);
    }
}
