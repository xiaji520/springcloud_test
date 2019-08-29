package cn.xiaji.springcloud;
//encoding: utf-8

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: UserConsumerFeignHystrix9004Application.java
 */
/*

 */
@SpringBootApplication
//启动Eureka客户端
@EnableEurekaClient
//扫描指定包里面加了@FeignClient 的所有接口并且为他们产生代理对象并纳入spring管理,就可以通过代理远程访问
@EnableFeignClients(basePackages = "cn.xiaji.springcloud.client")
public class UserConsumerFeignHystrix9004Application {
    //主入口
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerFeignHystrix9004Application.class, args);

    }
}