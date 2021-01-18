package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderFeignApplication80
 * @Author jiangqingpeng
 * @Date 2021/1/18 19:37
 * @Version 2.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplication80.class);
    }
}
