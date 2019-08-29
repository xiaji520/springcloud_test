package cn.xiaji.springcloud.controller;
//encoding: utf-8

import cn.xiaji.springcloud.domain.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: UserController.java
 */
/*

 */
@RestController
@RequestMapping("/user/provider")
public class UserController {

    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "getFallback")
    public User getById(@PathVariable("id") Long id) {
        if (id == 2) {
            throw new RuntimeException("出错了!");
        }
        return new User(id, "老污龟-8003");
    }

    public User getFallback(Long id) {
        return new User(id, "用户不存在!");
    }
}