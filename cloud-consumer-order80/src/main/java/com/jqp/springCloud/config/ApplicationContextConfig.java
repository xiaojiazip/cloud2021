package com.jqp.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @author: JQP
 * @description:
 * @create: 2021-01-11 13:38
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced   //使用@LoadBalanced，赋予RestTemplate负载均衡的能力，默认轮询机制
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }
}
