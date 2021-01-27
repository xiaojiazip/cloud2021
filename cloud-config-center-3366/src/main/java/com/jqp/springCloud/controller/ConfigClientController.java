package com.jqp.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigClientController
 * @author: JQP
 * @description:
 * @create: 2021-01-22 14:24
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;
    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/getConfigInfo")
    public String getConfigInfo() {
        return "serverPort:" + serverPort + "\t configInfo:" + configInfo;
    }

    @GetMapping(value = "/serverPort")
    public String getServerPort() {
        return serverPort;
    }
}
