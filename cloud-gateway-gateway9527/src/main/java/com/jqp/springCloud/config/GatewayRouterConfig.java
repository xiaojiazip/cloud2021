package com.jqp.springCloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GatewayRouterConfig
 * @Author jiangqingpeng
 * @Date 2021/1/20 20:40
 * @Version 2.0
 * 通过编码的形式实现gateway路由网关配置
 */
@Configuration
public class GatewayRouterConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_jqp", r -> r.path("/guonei")
        .uri("https://news.baidu.com/guonei")).build();

        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_jqp", r -> r.path("/guoji")
                .uri("https://news.baidu.com/guoji")).build();

        return routes.build();
    }
}
