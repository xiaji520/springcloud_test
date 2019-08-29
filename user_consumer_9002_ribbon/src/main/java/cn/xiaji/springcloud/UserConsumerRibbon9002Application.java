package cn.xiaji.springcloud;
//encoding: utf-8

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: UserConsumer9001Application.java
 */
/*

 */
@SpringBootApplication
//启动Eureka客户端
@EnableEurekaClient
public class UserConsumerRibbon9002Application {
    //主入口
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerRibbon9002Application.class, args);

    }
}