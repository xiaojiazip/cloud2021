package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentHystrixApplication8001
 * @Author jiangqingpeng
 * @Date 2021/1/18 20:58
 * @Version 2.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class);
    }
}
