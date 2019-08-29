package cn.xiaji.springcloud;
//encoding: utf-8

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: EurekaServer7001Application.java
 */
/*

 */
@SpringBootApplication
//启用Eureka服务端
@EnableEurekaServer
public class EurekaServer7002Application {
    //主入口
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002Application.class, args);
    }
}