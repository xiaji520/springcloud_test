package cn.xiaji.springcloud.controller;
//encoding: utf-8

import cn.xiaji.springcloud.domain.User;
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
    public User getById(@PathVariable("id") Long id) {
        //测试 user_consumer_9004_feign_hystrix
        /*try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return new User(id, "老污龟-8001");
    }
}