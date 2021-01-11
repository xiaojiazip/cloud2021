package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: OrderApplication80
 * @author: JQP
 * @description:
 * @create: 2021-01-11 13:47
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class);
    }
}
