package com.jqp.springCloud.controller;

import com.jqp.springCloud.service.MessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: MessageProviderController
 * @author: JQP
 * @description:
 * @create: 2021-02-06 15:09
 **/
@RestController
public class MessageProviderController {

    @Resource
    private MessageProvider messageProvider;

    @GetMapping(value = "sendMessage")
    public String sendMessage() {

        return messageProvider.send();
    }
}
