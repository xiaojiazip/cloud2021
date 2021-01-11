package com.jqp.springCloud.service.impl;

import com.jqp.springCloud.entity.Payment;
import com.jqp.springCloud.mapper.PaymentMapper;
import com.jqp.springCloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Author jiangqingpeng
 * @Date 2021/1/5 19:22
 * @Version 2.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int insertPayment(Payment payment) {
        return paymentMapper.insertPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
