package com.jqp.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ReceiveMessageListenerController
 * @author: JQP
 * @description:
 * @create: 2021-02-06 16:14
 **/
@RestController
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String severPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {

        String msg = "消费者1号，----------->接收到的消息："+message.getPayload()+"\t port"+severPort;
        log.info(msg);
    }
}
