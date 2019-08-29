package cn.xiaji.springcloud;
//encoding: utf-8

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: ConfigServer1299Application.java
 */
/*

 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServer1299Application {
    //主入口
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer1299Application.class, args);
    }
}