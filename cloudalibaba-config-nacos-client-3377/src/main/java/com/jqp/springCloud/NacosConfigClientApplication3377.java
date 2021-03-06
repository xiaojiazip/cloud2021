package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosConfigClientApplication3377
 * @author: JQP
 * @description:
 * @create: 2021-02-08 15:06
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApplication3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication3377.class);
    }
}
