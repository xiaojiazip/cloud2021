package com.jqp.springCloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    /**
     * @HystrixCommand 服务降级，paymentInfo_timeout出异常，则调用paymentInfo_timeoutHandler方法
     * @HystrixProperty 设置最大超时为3秒，超时则抛异常
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String paymentInfo_timeout(Integer id) {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_timeout,id：" + id + "\t耗时三秒钟";
    }

    public String paymentInfoTimeOutHandler(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_timeoutHandler,id：" + id + "\t" + "(ಥ﹏ಥ)";
    }
}
