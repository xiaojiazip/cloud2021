package com.jqp.springCloud.controller;

import com.jqp.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Author jiangqingpeng
 * @Date 2021/1/18 21:05
 * @Version 2.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private PaymentService paymentService;


    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id) {

        String result = paymentService.paymentInfo_ok(id);
        log.info("*********result:" + result);
        return result;
    }

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id) {

        String result = paymentService.paymentInfo_timeout(id);
        log.info("*********result:" + result);
        return result;
    }

    /**
     * 服务熔断
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/hystrix/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {

        String result = paymentService.paymentCircuitBreaker(id);
        log.info("*********result:" + result);
        return result;
    }
}
