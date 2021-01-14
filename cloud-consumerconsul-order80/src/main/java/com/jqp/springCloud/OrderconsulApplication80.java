package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderconsulApplication
 * @author: JQP
 * @description:
 * @create: 2021-01-14 14:33
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderconsulApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderconsulApplication80.class);
    }
}
