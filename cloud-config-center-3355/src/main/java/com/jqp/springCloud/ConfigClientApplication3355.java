package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ConfigApplication3355
 * @author: JQP
 * @description:
 * @create: 2021-01-22 14:20
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3355.class);
    }
}
