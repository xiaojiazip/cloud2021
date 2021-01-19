package com.jqp.springCloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: PaymentHystrixService
 * @author: JQP
 * @description:
 * @create: 2021-01-19 14:28
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-SERVICE")
public interface PaymentHystrixService {

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    String paymentInfo_timeout(@PathVariable("id") Integer id);
}
