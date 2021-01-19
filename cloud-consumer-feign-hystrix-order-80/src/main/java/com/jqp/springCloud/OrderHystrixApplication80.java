package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderHystrixApplication80
 * @author: JQP
 * @description:
 * @create: 2021-01-19 13:59
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApplication80.class);
    }
}
