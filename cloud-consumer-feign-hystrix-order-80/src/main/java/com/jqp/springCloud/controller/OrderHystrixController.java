package com.jqp.springCloud.controller;

import com.jqp.springCloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: PaymentHystrixController
 * @author: JQP
 * @description:
 * @create: 2021-01-19 14:30
 **/
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod") //默认全局服务器降级
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id) {

        String result = paymentHystrixService.paymentInfo_ok(id);
        return result;
    }

    /**
     * @HystrixCommand 服务降级，paymentInfo_timeout出异常，则调用paymentInfo_timeoutHandler方法
     * @HystrixProperty 设置最大超时为3秒，超时则抛异常
     * @param id
     * @return
     */
    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
//    })
    @HystrixCommand //默认调用全局服务降级
    public String paymentInfo_timeout(@PathVariable("id") Integer id) {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return paymentHystrixService.paymentInfo_timeout(id);
    }


    public String paymentInfoTimeOutHandler(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_timeoutHandler,id：" + id + "\t" + "(ಥ﹏ಥ)";
    }

    //全局fallback
    public String paymentGlobalFallbackMethod() {

        return "Global异常信息处理，请稍后再试";
    }
}
