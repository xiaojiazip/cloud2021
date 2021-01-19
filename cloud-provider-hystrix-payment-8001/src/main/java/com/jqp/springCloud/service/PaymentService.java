package com.jqp.springCloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentService
 * @Author jiangqingpeng
 * @Date 2021/1/18 21:00
 * @Version 2.0
 */
@Service
public class PaymentService {

    public String paymentInfo_ok(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_ok,id：" + id + "\tO(∩_∩)O";
    }

    public String paymentInfo_timeout(Integer id) {

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_ok,id：" + id + "\t耗时三秒钟";
    }
}
