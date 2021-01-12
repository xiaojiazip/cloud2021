package com.jqp.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Author jiangqingpeng
 * @Date 2021/1/12 20:53
 * @Version 2.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk() {

        return "springCloud with zookeeper：" + serverPort +"\t" + UUID.randomUUID().toString();
    }
}
