package com.zl;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.zl")
@EnableDubbo
@MapperScan("com.zl.mapper")
public class ProviderApp {

    public static void main(String[] args) {

        SpringApplication.run(ProviderApp.class,args);
    }
}
