package com.jqp.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: HystrixDashboardApplication9001
 * @author: JQP
 * @description:    微服务健康web图形化监控，访问地址：http://localhost:9002/hystrix
 * @create: 2021-01-20 14:20
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication9001.class);
    }
}
