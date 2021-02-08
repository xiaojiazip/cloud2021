package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosOrderApplication83
 * @author: JQP
 * @description:
 * @create: 2021-02-08 14:04
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApplication83 {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication83.class);
    }
}
