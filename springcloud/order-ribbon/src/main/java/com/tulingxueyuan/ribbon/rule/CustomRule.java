package com.tulingxueyuan.ribbon.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author zhangChen
 * @Date 2022/9/11 23:13
 */
//自定义负载均衡策略
public class CustomRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();

        // 获取当前请求的服务实例
        List<Server> reachableServers = loadBalancer.getReachableServers();

        //随机策略
        //根据服务实例拿到一个随机数
        int random = ThreadLocalRandom.current().nextInt(reachableServers.size());
        Server server = reachableServers.get(random);
        //判断服务实例是否存活
        /*if (server.isAlive()) {
            return null;
        }*/
        return server;
    }
}
