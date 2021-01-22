package com.jqp.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigClientController
 * @author: JQP
 * @description:
 * @create: 2021-01-22 14:24
 **/
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "getConfigInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
