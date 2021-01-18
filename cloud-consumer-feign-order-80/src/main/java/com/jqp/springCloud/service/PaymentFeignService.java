package com.jqp.springCloud.service;


import com.jqp.springCloud.entity.CommontResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")    //调用对应注册到微服务名称
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommontResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeOut")
    String paymentFeignTimeOut();
}
