package com.pyy.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 自定义负载均衡算法
 * 自定义随机算法
 * 每个服务访问五次
 * @Author panyangyi
 * @create 2020/4/10 14:05
 */

public class MyRandomRule extends AbstractLoadBalancerRule {

    Random random;

    private int total = 0; //定义每个服务轮询时一遍的访问次数
    private int currentIndex = 0; //定义选择哪一个服务，当前服务被访问5次后，会自动增加+1，切换到下一个负载均衡的服务

    public MyRandomRule(){
        this.random = new Random();
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }

        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            //可用的服务
            List<Server> reachableServers = lb.getReachableServers();
            //总得服务
            List<Server> allServers = lb.getAllServers();
            int upCount = reachableServers.size();       //可用服务数量
            int serverCount = allServers.size();         //总服务数量

            if ((upCount == 0) || (serverCount == 0)) {
                return null;
            }

//            int nextServerIndex = random.nextInt(serverCount); //在总的服务编号中随机选择一个编号
//            server = reachableServers.get(nextServerIndex);


            if (total < 5){

                //当前服务未被访问满5次
                server = reachableServers.get(currentIndex);
                total++;

            }else {
                //当前服务访问超过5次，调用下一个
                total = 0;
                currentIndex++;
                if (currentIndex >= upCount){
                    currentIndex = 0;
                }

            }

            if (server == null) {
                /* Transient. */
                Thread.yield();
                continue;
            }

            if (server.isAlive() && (server.isReadyToServe())) {
                return (server);
            }

            // Next.
            server = null;
        }


        return server;
    }



    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}
