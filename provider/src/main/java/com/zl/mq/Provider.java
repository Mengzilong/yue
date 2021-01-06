package com.zl.mq;

import com.zl.entity.Car;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Provider {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void sendMassage(Car car){

        amqpTemplate.convertAndSend("yue","mzl",car);
    }
}
