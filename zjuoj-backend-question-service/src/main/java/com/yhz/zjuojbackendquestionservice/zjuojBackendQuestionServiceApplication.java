package com.yhz.zjuojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.yhz.zjuojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.yhz")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.yhz.zjuojbackendserviceclient.service"})
public class zjuojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(zjuojBackendQuestionServiceApplication.class, args);
    }

}
