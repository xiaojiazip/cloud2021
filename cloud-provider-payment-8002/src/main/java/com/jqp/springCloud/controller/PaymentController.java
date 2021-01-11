package com.jqp.springCloud.controller;

import com.jqp.springCloud.entity.CommontResult;
import com.jqp.springCloud.entity.Payment;
import com.jqp.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Author jiangqingpeng
 * @Date 2021/1/5 19:23
 * @Version 2.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/savePayment")
    public CommontResult savePayment(@RequestBody Payment payment) {

        int result = paymentService.insertPayment(payment);
        log.info("插入结果O(∩_∩)O哈哈~----" + result);
        if (result > 0) {
            return new CommontResult(200, "插入成功,serverPort:" + serverPort, payment);
        }
        return new CommontResult(400, "插入数据库失败");
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommontResult savePayment(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果O(∩_∩)O哈哈~----" + payment);
        if (payment != null) {
            return new CommontResult(200, "查询成功,serverPort:" + serverPort, payment);
        }
        return new CommontResult(400, "结果集不存在，查询ID：" + id);
    }
}
