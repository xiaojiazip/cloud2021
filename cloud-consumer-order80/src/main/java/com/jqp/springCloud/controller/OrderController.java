package com.jqp.springCloud.controller;

import com.jqp.springCloud.entity.CommontResult;
import com.jqp.springCloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderController
 * @author: JQP
 * @description:
 * @create: 2021-01-11 13:40
 **/
@RestController
@Slf4j
public class OrderController {

//    private final static String PAYMENT_URL = "http://localhost:8001";//不集群
    private final static String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";//不集群
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/savePayment")
    public CommontResult<Payment> savePayment(Payment payment) {

        return restTemplate.postForObject(PAYMENT_URL + "/payment/savePayment", payment, CommontResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommontResult<Payment> savePayment(@PathVariable("id") Long id) {

       return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommontResult.class);
    }
}
