package org.zxl.springbootdemo.activemq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zxl.springbootdemo.activemq.service.ProduceService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsQueueTest {
    @Autowired
    private ProduceService produceService;

    @Test
    public void contextloads(){
        for (int i=0;i<10;i++){
            produceService.sendMsg("test.queue", "Queue message "+i);
        }
    }

    @Test
    public void contextTopics(){
        for (int i=0;i<10;i++){
            produceService.publish("topic1", "Queue message "+i);
        }
    }

}
