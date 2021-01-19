package com.jqp.springCloud.controller;

import com.jqp.springCloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentHystrixController
 * @author: JQP
 * @description:
 * @create: 2021-01-19 14:30
 **/
@RestController
@Slf4j
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id) {

        String result = paymentHystrixService.paymentInfo_ok(id);
        return result;
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id) {

        String result = paymentHystrixService.paymentInfo_timeout(id);
        return result;
    }
}
