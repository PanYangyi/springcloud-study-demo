package com.pyy.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author panyangyi
 * @create 2020/4/9 14:15
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 修改我们的负载均衡算法选择机制
     * 默认的负载均衡算法是 轮训算法
     * 现在我们改成 随机
     * @return
     */
    @Bean
    public IRule myRule(){
//        return new RetryRule();
//        return new RoundRobinRule();//轮询
        return new RandomRule();//随机
//        return new MyRandomRule();//随机
    }
}
