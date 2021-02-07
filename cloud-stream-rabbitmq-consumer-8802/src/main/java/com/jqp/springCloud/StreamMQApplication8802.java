package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: StreamMQApplication8802
 * @author: JQP
 * @description:
 * @create: 2021-02-06 16:12
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQApplication8802 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMQApplication8802.class);
    }
}
