package cn.xiaji.springcloud;
//encoding: utf-8

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: UserProviderHystrix8003Application.java
 */
/*

 */
@SpringBootApplication
//启动Eureka客户端
@EnableEurekaClient
// @EnableHystrix = @EnableCircuitBreaker 效果一样,都是熔断器
@EnableHystrix
public class UserProviderHystrix8003Application {
    //主入口
    public static void main(String[] args) {
        SpringApplication.run(UserProviderHystrix8003Application.class, args);
    }
}