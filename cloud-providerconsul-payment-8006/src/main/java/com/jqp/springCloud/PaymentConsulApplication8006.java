package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentConsulApplication8006
 * @author: JQP
 * @description:
 * @create: 2021-01-14 14:18
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulApplication8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulApplication8006.class);
    }
}
