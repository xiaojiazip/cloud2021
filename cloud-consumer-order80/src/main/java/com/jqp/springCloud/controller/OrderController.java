package com.jqp.springCloud.controller;

import com.jqp.springCloud.entity.CommontResult;
import com.jqp.springCloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    /**
     * getForObject ->返回对象为相应体中数据转换成对象，基本可以理解成json
     * @param id
     * @return
     */
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommontResult<Payment> getPayment(@PathVariable("id") Long id) {

       return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommontResult.class);
    }

    /**
     * getForEntity ->返回对象为ResponseEntity对象，包含了响应中一些重要信息，包含响应头、状态码、相应他等
     * @param id
     * @return
     */
    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommontResult<Payment> getForEntity(@PathVariable("id") Long id) {

        ResponseEntity<CommontResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommontResult.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommontResult<>(500, "操作失败");
        }

    }


}
