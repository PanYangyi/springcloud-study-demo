package com.pyy.myrule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author panyangyi
 * @create 2020/4/10 11:08
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getRule(){
        System.out.println("自定义的负载均衡算法");
        return new MyRandomRule();
    }
}
