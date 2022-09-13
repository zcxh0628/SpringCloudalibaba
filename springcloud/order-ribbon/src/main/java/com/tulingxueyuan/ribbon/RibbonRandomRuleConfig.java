package com.tulingxueyuan.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhangChen
 * @Date 2022/9/11 21:49
 */
@Configuration
public class RibbonRandomRuleConfig {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
