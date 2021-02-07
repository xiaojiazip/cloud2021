package com.jqp.springCloud.service.impl;


import com.jqp.springCloud.service.MessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName: MessageProviderImpl
 * @author: JQP
 * @description:
 * @create: 2021-02-06 15:03
 **/
@EnableBinding(Source.class)    //定义消息推送管道
@Slf4j
@Service
public class MessageProviderImpl implements MessageProvider {

    @Resource
    private MessageChannel output;  //定义消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("*****************serial:" + serial);
        return serial;
    }
}
