package com.jqp.springCloud;

import com.jqp.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName: OrderApplication80
 * @author: JQP
 * @description:
 * @create: 2021-01-11 13:47
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class);
    }
}
