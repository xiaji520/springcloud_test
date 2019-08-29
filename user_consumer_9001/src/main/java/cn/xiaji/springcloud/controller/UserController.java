package cn.xiaji.springcloud.controller;
//encoding: utf-8

import cn.xiaji.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: UserController.java
 */
/*

 */
@RestController
@RequestMapping("/user/consumer")
public class UserController {

    public static final String URL_PREFIX = "http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    /*@GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        String url = URL_PREFIX + "user/provider/" + id;
        return restTemplate.getForObject(url, User.class);
    }*/

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        //要远程访问服务提供者,需要httpclient客户端工具RestTemplate
        //拿到特定名称服务实例们 "USER-PROVIDER".toLowerCase() 要小写
        List<ServiceInstance> instances = discoveryClient.getInstances("USER-PROVIDER".toLowerCase());
        //获取第一个
        ServiceInstance instance = instances.get(0);
        //拼接url http://localhost:8001/
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/provider/" + id;
        System.out.println("url:" + url);
        return restTemplate.getForObject(url, User.class);
    }
}