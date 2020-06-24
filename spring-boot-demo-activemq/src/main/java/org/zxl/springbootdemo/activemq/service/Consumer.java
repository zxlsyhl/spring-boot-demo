package org.zxl.springbootdemo.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @JmsListener(destination = "test.queue")
    public void receiveQueueMsg(String text){
        System.out.println("收到消息："+text);
    }

    @JmsListener(destination = "topic1", containerFactory = "myJmsContainerFactory")
    public void subscribe(String text){
        System.out.println("收到消息："+text);
    }
}
