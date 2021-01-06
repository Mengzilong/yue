package com.zl.mq;

import com.zl.entity.Car;
import com.zl.mail.MailBean;
import com.zl.mail.MailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    MailService mailService;

    @RabbitListener(queues = "1805a")
    public void show(Car car) throws Exception {

        MailBean mailBean = new MailBean();
        mailBean.setAttachment("2842039147@qq.com");
        mailBean.setReceiver("2842039147@qq.com");
        mailBean.setSubject("购买订单明细");
        mailBean.setContent("价格:"+car.getPrice()+"数量:"+car.getNum()+"商品名称:"+car.getName());

        mailService.sendSimpleMail(mailBean);
        mailService.sendMailTemplate(mailBean);
    }
}
