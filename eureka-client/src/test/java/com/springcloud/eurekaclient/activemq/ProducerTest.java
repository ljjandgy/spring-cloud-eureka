package com.springcloud.eurekaclient.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProducerTest {
    @Autowired
    private Producer producer;

    @Test
    public void sendTest(){
        Destination destination = new ActiveMQQueue("mytest.queue");
        producer.sendMessage(destination,"hello spring boot activemq");
    }
}