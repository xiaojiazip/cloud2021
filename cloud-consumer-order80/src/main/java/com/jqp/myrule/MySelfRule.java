package com.jqp.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MySelfRule
 * @author: JQP
 * @description:
 * @create: 2021-01-16 16:16
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {

        return new RandomRule();
    }
}
