package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentApplicaton8004
 * @Author jiangqingpeng
 * @Date 2021/1/12 20:49
 * @Version 2.0
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于向consul或者zookeeper作为注册中心时注册服务
public class PaymentApplicaton8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplicaton8004.class);
    }
}
