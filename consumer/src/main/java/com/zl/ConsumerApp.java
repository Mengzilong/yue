package com.zl;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.zl")
@EnableDubbo
public class ConsumerApp {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerApp.class,args);
    }
}
