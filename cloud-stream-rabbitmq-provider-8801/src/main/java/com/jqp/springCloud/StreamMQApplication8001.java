package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: StreamMQApplication8001
 * @author: JQP
 * @description:
 * @create: 2021-02-06 14:52
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMQApplication8001.class);
    }
}
