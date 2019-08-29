package cn.xiaji.springcloud;
//encoding: utf-8

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: ConfigClientApplication.java
 */
/*

 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {
    //主入口
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}