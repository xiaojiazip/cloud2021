package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderZKApplication
 * @author: JQP
 * @description:
 * @create: 2021-01-14 13:58
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKApplication.class);
    }
}
