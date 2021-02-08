package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosPaymentApplication9001
 * @author: JQP
 * @description:
 * @create: 2021-02-08 13:29
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplication9001.class, args);
    }
}
