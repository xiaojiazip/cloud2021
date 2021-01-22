package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigCenterApplication3344
 * @author: JQP
 * @description:
 * @create: 2021-01-21 15:00
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication3344.class);
    }
}
