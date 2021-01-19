package com.jqp.springCloud.service.impl;

import com.jqp.springCloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentHystrixServiceImpl
 * @Author jiangqingpeng
 * @Date 2021/1/19 20:36
 * @Version 2.0
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfo_ok(Integer id) {
        return "------PaymentHystrixServiceImpl fall back-paymentInfo_ok  o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "-------PaymentHystrixServiceImpl fall back-paymentInfo_timeout  o(╥﹏╥)o";
    }
}
